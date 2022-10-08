/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_hoc_phan_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Subject> res = new ArrayList<>();
        while(t-- > 0) {
            Subject mh = new Subject();
            mh.input(sc);
            res.add(mh);
        }
        Collections.sort(res, (Subject mh1, Subject mh2) -> {
            if(mh1.code.compareTo(mh2.code) > 0) return 1;
            else if(mh1.code.compareTo(mh2.code) == 0) {
                if(mh1.group.compareTo(mh2.group) > 0) return 1;
            }
            return -1;
        });
        int tt = sc.nextInt();
        sc.nextLine();
        while(tt-- > 0) {
            String s = sc.nextLine();
            for(Subject mh: res) {
                if(s.compareTo(mh.nameLecturer) == 0){
                    System.out.println("Danh sach cho giang vien " + mh.nameLecturer + ":");
                    break;
                }
            }
            for(Subject mh: res) {
                if(s.compareTo(mh.nameLecturer) == 0){
                    System.out.println(mh);
                }
            }
        }
    }
    
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An
*/