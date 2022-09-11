/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
class Student {
    String code, name, clas, email;
    
    Student() {}
    
    void input(Scanner sc) {
        code = sc.nextLine();
        name = sc.nextLine();
        clas = sc.nextLine();
        email = sc.nextLine();
    }
    
    public String toString() {
        return code + " " + name + " " + clas + " " + email;
    }
}
public class Sap_xep_theo_ma_sinh_vien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> res = new ArrayList<>();
        
        while(sc.hasNext()) {
            Student sv = new Student();
            sv.input(sc);
            res.add(sv);
        }
        
        Collections.sort(res, (Student sv1, Student sv2) -> {
            if(sv1.code.compareTo(sv2.code) > 0) return 1;
            return -1;
        });
        
        for(Student sv : res) {
            System.out.println(sv);
        }
    }
}
