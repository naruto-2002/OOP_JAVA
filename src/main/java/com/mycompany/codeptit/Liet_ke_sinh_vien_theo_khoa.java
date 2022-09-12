/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
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
public class Liet_ke_sinh_vien_theo_khoa {
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
        int tt = sc.nextInt();
        while(tt-- > 0) {
            String s = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for(Student sv : res) {
                if(sv.clas.substring(1, 3).compareTo(s.substring(2, 4)) == 0) {
                    System.out.println(sv);
                }
            }
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
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
2015
*/