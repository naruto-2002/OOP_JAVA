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
    String code, name, rank = "";
    float math, tv, english, physical, chemical, biological,
            history, geography, education,  technology, medium;
    
    static int cnt = 1;
    
    Student() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = "HS" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt) );
        cnt++;
        name = sc.nextLine();
        math = sc.nextFloat();
        tv = sc.nextFloat();
        english = sc.nextFloat();
        physical = sc.nextFloat();
        chemical = sc.nextFloat();
        biological = sc.nextFloat();
        history = sc.nextFloat();
        geography = sc.nextFloat();
        education = sc.nextFloat();
        technology = sc.nextFloat();
        medium = (math*2 + tv*2 + english + physical + chemical + biological + 
                history + geography + education + technology)/12;
        medium = (float) ((Math.round(medium*10))*1.0/10);
        
        if(medium >= 9) rank = "XUAT SAC";
        else if(medium >= 8) rank = "GIOI";
        else if(medium >= 7) rank = "KHA";
        else if(medium >= 5) rank = "TB";
        else rank = "YEU";
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + medium + " " + rank;
    }
}
public class Bang_diem_hoc_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student> res = new ArrayList<>();
        while(t-- > 0) {
            Student sv = new Student();
            sv.input(sc);
            res.add(sv);
        }
        Collections.sort(res, (Student sv1, Student sv2) -> {
            if(sv1.medium > sv2.medium) return -1;
            return 1;
        });
        for(Student sv : res) {
            System.out.println(sv);
        }
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/
