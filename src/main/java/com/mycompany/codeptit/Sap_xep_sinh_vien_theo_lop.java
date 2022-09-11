/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

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
    
    @Override
    public String toString() {
        return code + " " + name + " " + clas + " " + email;
    }
}
public class Sap_xep_sinh_vien_theo_lop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> res = new ArrayList<>();
        while(t-- > 0) {
            Student sv = new Student();
            sv.input(sc);
            res.add(sv);
        }
        Collections.sort(res, (Student sv1, Student sv2) -> {
            if(sv1.clas.compareTo(sv2.clas) == 0) {
                if(sv1.code.compareTo(sv2.code) > 0) return 1;
            }else if(sv1.clas.compareTo(sv2.clas) > 0) return 1;
            return -1;
        });
        for(Student sv : res) {
            System.out.println(sv);
        }
    }
}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT03-B
sv4@stu.ptit.edu.vn
*/
