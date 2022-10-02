/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xep_hang_hoc_sinh;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student {
    String code, name;
    float medium;
    int level;
    
    static int cnt = 1;
    
    Student(){}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = "HS" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        medium = sc.nextFloat();
    }
    
    String getRank() {
        if(medium < 5) return "Yeu";
        else if(medium < 7) return "Trung Binh";
        else if(medium < 9) return "Kha";
        else return "Gioi";
    }
    
    public String toString() {
        return code + " " + name + " " + String.format("%.1f", medium) + " " + getRank() + " " + level;
    }
}
