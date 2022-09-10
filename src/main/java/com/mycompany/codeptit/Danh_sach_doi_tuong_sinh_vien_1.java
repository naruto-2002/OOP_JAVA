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
    String code, name, clas, date, gpa;
    
    static int cnt = 1;
    
    Student() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = "B20DCCN0" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt += 1;
        name = sc.nextLine();
        clas = sc.nextLine();
        date = formDate(sc.nextLine());
        gpa = String.format("%.2f", sc.nextFloat());
    }
    
    String formDate(String data) {
        String[] a = data.split("/");
        for(int i = 0; i < 2; i++) {
            if(a[i].length() == 1) a[i] = '0' + a[i];
        }
        return a[0] + "/" + a[1] + "/" + a[2];
    }
    
    public String toString() {
        return code + " " + name + " " + clas + " " + date + " " + gpa;
    }
    
}
public class Danh_sach_doi_tuong_sinh_vien_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student> res = new ArrayList<>();
        while(t-- > 0) {
            Student sv = new Student();
            sv.input(sc);
            res.add(sv);
        }
        for(Student sv : res) {
            System.out.println(sv);
        }
    }
}

//2
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19
