/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_thuc_tap_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student {
    String code, name, clas, email, enterprise;
    int order;
    static int cnt = 1;
    
    Student() {}
    
    void input(Scanner sc) {
        order = cnt++;
        code = sc.nextLine();
        name = sc.nextLine();
        clas = sc.nextLine();
        email = sc.nextLine();
        enterprise = sc.nextLine();
    }
    
    public String toString() {
        return order + " " + code + " " + name + " " + clas + " " + email + " " + enterprise;
    }
    
}
