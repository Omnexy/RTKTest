package com.omnexyinc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateWork {
    public static void main(String[] args) throws ParseException {
        String input = "29.05.2019";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = format.parse(input);
        System.out.println("String->Date: "+date);
        String output = format.format(date);
        System.out.println("Date->String: "+output);
    }
}
