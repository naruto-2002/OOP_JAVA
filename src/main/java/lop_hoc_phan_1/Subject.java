/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_hoc_phan_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Subject {
    String code, name, group, nameLecturer;
    
    Subject() {}
    
    void input(Scanner sc) {
        code = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        group = sc.next();
        sc.nextLine();
        nameLecturer = sc.nextLine();
    }
    
    public String toString() {
        return code + " " + name + " " + group;
    }
}
