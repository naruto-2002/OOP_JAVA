/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tim_kiem_giang_vien;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Lecturer {
    String code, name, subject;
    
    static int cnt = 1;
    
    Lecturer() {}
    
    void input(Scanner sc) {
        code = "GV" + (cnt < 10 ? "0" + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        subject = formSubject(sc.nextLine());
        
    } 
    
    String formSubject(String s) {
        String[] data = s.toUpperCase().split(" ");
        String res = "";
        for(String ss : data) {
            res += ss.substring(0, 1);
        }
        return res;
    }
    
    public String toString() {
        return code + " " + name + " " + subject;
    }
}
