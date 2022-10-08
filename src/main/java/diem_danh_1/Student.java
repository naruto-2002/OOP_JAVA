/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem_danh_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student {
    String code, name, clas;
    
    Student() {}
    
    void input(Scanner sc) {
        code = sc.nextLine();
        name = sc.nextLine();
        clas = sc.nextLine();
    }
}
