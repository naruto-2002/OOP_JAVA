/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        int TimeAt;
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
        Date Time1 = ft.parse("07:00:00"), Time2 = ft.parse("09:10:56");
        Calendar cal1 = Calendar.getInstance(), cal2 = Calendar.getInstance();
        cal1.setTime(Time1);
        cal2.setTime(Time2);
        TimeAt = cal2.get(Calendar.);
        System.out.println(TimeAt);
    }

}
