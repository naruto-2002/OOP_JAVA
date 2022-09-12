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
public class Liet_ke_sinh_vien_theo_nganh {
    public static void output(ArrayList<Student> res, String s) {
        for(Student sv : res) {
            if(s == "CN" || s == "AT") {
                if(sv.clas.substring(0, 1).compareTo("E") != 0 && sv.code.substring(5, 7).compareTo(s) == 0) {
                    System.out.println(sv);
                }
            }else {
                if(sv.code.substring(5, 7).compareTo(s) == 0) {
                    System.out.println(sv);
                }
            }
           
        }
    }
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
        sc.nextLine();
        while(tt-- > 0) {
            String s = sc.nextLine();
            String ss = s.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + ss + ":");
            switch(s) {
                case("Ke toan"):
                    output(res, "KT");
                    break;
                case("Cong nghe thong tin"):
                    output(res, "CN");
                    break;
                case("An toan thong tin"):
                    output(res, "AT");
                    break;
                case("Vien thong"):
                    output(res, "VT");
                    break;
                case("Dien tu"):
                    output(res, "DT");
                    break;
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
Ke toan
*/