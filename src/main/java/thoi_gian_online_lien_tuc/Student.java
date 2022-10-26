/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thoi_gian_online_lien_tuc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student implements Comparable<Student> {
    private String name, beginTime, endTime;
    private long time;
    
    public Student(Scanner sc) throws ParseException {
        name = sc.nextLine();
        Date date1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").parse(sc.nextLine());
        Date date2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").parse(sc.nextLine());
        time = Math.round((date2.getTime() - date1.getTime())/(1000*60));
    }
    
    public String toString() {
        return name + " " + time;
    }
    
    public int compareTo(Student o) {
        if(time < o.time) return 1;
        if(time > o.time) return -1;
        return name.compareTo(o.name);
    }
}
