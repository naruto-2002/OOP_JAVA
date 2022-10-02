/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xep_hang_van_dong_vien_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Cong Van
 */
public class Athlete {
    String code, name, date, timeBegin, timeEnd;
    int time, rank;
    
    static int cnt = 1;
    
    Athlete() {}
    
    void input(Scanner sc) {
        code = "VDV" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        date = sc.nextLine();
        timeBegin = sc.nextLine();
        timeEnd = sc.nextLine();
        String[] s1 = timeBegin.split(":"), s2 = timeEnd.split(":");
        time = (Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]))*3600 + (Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]))*60 + (Integer.parseInt(s2[2]) - Integer.parseInt(s1[2]));
    }
    
    String timeCurrent() {
        int tmp = time;
        int h = tmp/3600;
        tmp %= 3600;
        int m = tmp/60;
        tmp %= 60;
        int s = tmp;
        return (h < 10 ? '0' + Integer.toString(h) : Integer.toString(h)) + ':' + (m < 10 ? '0' + Integer.toString(m) : Integer.toString(m)) + ':' + (s < 10 ? '0' + Integer.toString(s) : Integer.toString(s));
    }

    String timePriority() {
        String[] ans = date.split("/");
        int year = Integer.parseInt(ans[2]);
        int age = 2021 - year;
        if(age < 18) return "00:00:00";
        else if(age < 25) return "00:00:01";
        else if(age < 32) return "00:00:02";
        return "00:00:03";
    }
    
    int second() {
        String[] ans = timePriority().split(":");
        return Integer.parseInt(ans[2]);
    }
    
    String timeRank() {
        time = time - second();
        int tmp = time;
        int h = tmp/3600;
        tmp %= 3600;
        int m = tmp/60;
        tmp %= 60;
        int s = tmp;
        return (h < 10 ? '0' + Integer.toString(h) : Integer.toString(h)) + ':' + (m < 10 ? '0' + Integer.toString(m) : Integer.toString(m)) + ':' + (s < 10 ? '0' + Integer.toString(s) : Integer.toString(s));
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + timeCurrent() + " " + timePriority() + " " + timeRank() + " " + rank;
    }
}
