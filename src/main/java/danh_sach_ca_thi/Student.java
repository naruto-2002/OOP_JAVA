/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_ca_thi;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student{
    String code, date, hour, id;
    
    static int cnt = 1;
    
    Student(Scanner sc) {
        code = 'C' + String.format("%03d", cnt);
        cnt++;
        date = sc.next();
        hour = sc.next();
        id = sc.next();
    }
    
    public String toString() {
        return code + " " + date + " " + hour + " " + id;
    }
    
    int getYear() {
        return Integer.parseInt(date.substring(6));
    }
    
    int getMonth() {
        return Integer.parseInt(date.substring(3, 5));
    }
    
    int getDay() {
        return Integer.parseInt(date.substring(0, 2));
    }
    
    int getHour() {
        return Integer.parseInt(hour.substring(0, 2));
    }
    
    int getMinute() {
        return Integer.parseInt(hour.substring(3));
    }
    
    int getCode() {
        return Integer.parseInt(code.substring(2, 4));
    }

    
    
}
