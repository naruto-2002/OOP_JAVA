/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Danh_sach_giang_vien_theo_bo_mon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
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
        
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-- > 0) {
            String s = sc.nextLine();
            String[] s1 = s.toUpperCase().split(" ");
            String  s2 = "";
            for(String ss : s1) {
                s2 += ss.substring(0, 1);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + s2 + ":");
            for(Lecturer gv : res) {
                if(gv.subject.compareTo(s2) == 0) {
                    System.out.println(gv);
                }
            }
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
1
Cong nghe phan mem
*/