/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
class Student {
    String code, name, date;
    float point1, point2, point3, total;
    
    static int cnt = 1;
    
    Student() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = Integer.toString(cnt);
        cnt++;
        name = sc.nextLine();
        date = sc.nextLine();
        point1 = sc.nextFloat();
        point2 = sc.nextFloat();
        point3 = sc.nextFloat();
        total = point1 + point2 + point3;
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + date + " " + String.format("%.1f", total);
    }
}
public class Thu_khoa_cua_ki_thi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student> res = new ArrayList<>();
        float maxx = 0;
        while(t-- > 0) {
            Student sv = new Student();
            sv.input(sc);
            maxx = Math.max(maxx, sv.total);
            res.add(sv);
        }
        for(Student sv : res) {
            if(sv.total == maxx) {
                System.out.println(sv);
            }
        }
    }
}

/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
*/
