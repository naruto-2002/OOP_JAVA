/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_diem_tuyen_sinh;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student {
    String code, name;
    float math, geography, chemical, total;
    
    Student() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = sc.nextLine();
        name = sc.nextLine();
        math = sc.nextFloat();
        geography = sc.nextFloat();
        chemical = sc.nextFloat();
        total = 2*math + geography + chemical + priority();
    }
    
    float priority() {
        String s = code.substring(0, 3);
        if(s.compareTo("KV1") == 0) return (float) 0.5;
        else if(s.compareTo("KV2") == 0) return (float) 1.0;
        else return (float) 2.5;
    }
    
    
    
    public String toString() {
        return code + " " + name + " " + (priority() == 1.0 ? "1" : String.format("%.1f", priority())) + " " + ((int) total == total ? (int) total : String.format("%.1f", total)) + " " + (total >= 24 ? "TRUNG TUYEN" : "TRUOT");
    }
}
