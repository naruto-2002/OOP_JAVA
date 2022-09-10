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
        cnt++;
        name = formName(sc.nextLine());
        clas = sc.nextLine();
        date = formDate(sc.nextLine());
        gpa = String.format("%.2f", sc.nextFloat());
    }
    
    String formName(String s) {
        String[] ans = s.toLowerCase().trim().split(" ");
        String res = "";
        for(String ss : ans) {
            if(ss.length() <= 0) continue;
            res += ss.substring(0, 1).toUpperCase() + ss.substring(1) + ' ';
        }
        return res.substring(0, res.length() - 1);
    }
    
    String formDate(String s) {
        String[] data = s.split("/");
        for(int i = 0; i < 2; i++) {
            if(data[i].length() == 1) data[i] = '0' + data[i];
        }
        return data[0] + "/" + data[1] + "/" + data[2];
    }
    
    public String toString() {
        return code + " " + name + " " + clas + " " + date + " " + gpa;
    }
}
public class Danh_sach_doi_tuong_sinh_vien_2 {
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
/*
1
nGuyEn  vaN    biNH
D20CQCN01-B
2/12/2002
3.1
*/


