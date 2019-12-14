package com.omnexyinc;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("states", makeJSON());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public List<State> makePresetCollection() {
        List<State> states = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            states.add(new State("AL", "Alabama"));
            states.add(new State("AK", "Alaska"));
            states.add(new State("AZ", "Arizona"));
            states.add(new State("AR", "Arkansas"));
            states.add(new State("CA", "California"));
            states.add(new State("CO", "Colorado"));
            states.add(new State("CT", "Connecticut"));
            states.add(new State("FL", "Florida"));
            states.add(new State("GA", "Georgia"));
        }
        return states;
    }

    public JSONArray makeJSON() throws JSONException {
        List<State> collection = makePresetCollection();
        JSONArray array = new JSONArray();
        for (State state : collection) {
            JSONObject obj = new JSONObject();
            obj.put("short_name", state.getShortName());
            obj.put("name", state.getName());
            array.put(obj);
        }
        return array;
    }
}
