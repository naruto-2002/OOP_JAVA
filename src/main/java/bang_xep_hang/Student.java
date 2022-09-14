/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_xep_hang;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student {
    String name;
    int codeAC, submit;
    
    Student() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        name = sc.nextLine();
        codeAC = sc.nextInt();
        submit = sc.nextInt();
    }
    
    public String toString() {
        return name + " " + codeAC + " " + submit; 
    }
}
