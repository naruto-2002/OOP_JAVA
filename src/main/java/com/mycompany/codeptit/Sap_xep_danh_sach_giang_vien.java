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
class Lecturer {
    String code, name, subject;
    
    static int cnt = 1;
    
    Lecturer() {}
    
    void input(Scanner sc) {
        code = "GV" + (cnt < 10 ? "0" + Integer.toString(cnt): Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        subject = sc.nextLine();
        
    }
    
    String getSign() {
        String[] ans = subject.split(" ");
        String res = "";
        for(String ss : ans) {
            res += ss.substring(0,1).toUpperCase();
        }
        return res;
    }
    
    public String toString() {
        return code + " " + name + " " + getSign();
    }
}
public class Sap_xep_danh_sach_giang_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Lecturer> res = new ArrayList<>();
        while(t-- > 0) {
            Lecturer gv = new Lecturer();
            gv.input(sc);
            res.add(gv);
        }
        Collections.sort(res, new Comparator<Lecturer>() {
            public int compare(Lecturer gv1, Lecturer gv2) {
                String[] a = gv1.name.split(" ");
                String[] b = gv2.name.split(" ");
                if(a[a.length - 1].compareTo(b[b.length - 1]) == 0) {
                    if(gv1.code.compareTo(gv2.code) > 0) return 1;
                    else return -1;
                }else if(a[a.length - 1].compareTo(b[b.length - 1]) > 0) {
                    return 1;
                }else return -1;
            }
        });
        for(Lecturer gv : res) {
            System.out.println(gv);
        }
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
*/