package com.omnexyinc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class DBWork {
    private Connection myConnection;

    public DBWork(Connection myConnection) {
        this.myConnection = myConnection;
        System.out.println(getInfo("Omnexy"));
    }

    public String getInfo(String input) {
        String res = null;
        try {
            CallableStatement stmt;
            stmt = myConnection.prepareCall("{call get_info(?,?)}");
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.setString(1, input);
            stmt.execute();
            res = stmt.getString(2);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
