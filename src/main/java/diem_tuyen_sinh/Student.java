/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem_tuyen_sinh;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student implements Comparable<Student> {
    String code, name, ethnic;
    double point;
    int area;
    
    static int cnt = 1;
    
    Student(Scanner sc) {
        code = "TS" + (cnt < 10? '0' + Integer.toString(cnt): Integer.toString(cnt));
        cnt++;
        sc.nextLine();
        this.name = formName(sc.nextLine());
        this.point = sc.nextDouble();
        sc.nextLine();
        this.ethnic = sc.nextLine();
        this.area = sc.nextInt();
        if(this.ethnic.compareTo("Kinh") != 0) this.point += 1.5;
        switch(this.area) {
            case 1:
                this.point += 1.5;
                break;
            case 2:
                this.point += 1;
                break;
        }
    }
    
    String formName(String s) {
        String[] ans = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String ss: ans) {
            res += ss.substring(0, 1).toUpperCase() + ss.substring(1) + " ";
        }
        return res.substring(0, res.length() - 1);
    }
    
    String getRank() {
        if(point >= 20.5 ) return "Do";
        else return "Truot";
    }
    
    public String toString() {
        return code + " " + name + " " + String.format("%.1f", point) + " " + getRank();
    }
    
    @Override
    public int compareTo(Student o) {
        if(this.point < o.point) return 1;
        if(this.point > o.point) return -1;
        return this.code.compareTo(o.code);
    }
}
