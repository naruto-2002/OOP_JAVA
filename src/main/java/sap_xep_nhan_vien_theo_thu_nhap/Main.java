/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sap_xep_nhan_vien_theo_thu_nhap;

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
        ArrayList<Staff> res = new ArrayList<>();
        while(t-- > 0) {
            Staff nv = new Staff();
            nv.input(sc);
            res.add(nv);
        }
        Collections.sort(res, (Staff nv1, Staff nv2) -> {
            if(nv1.getWageMain() + nv1.getAllowance() == nv2.getWageMain() + nv2.getAllowance()) {
                return nv1.code.compareTo(nv2.code);
            }else if(nv1.getWageMain() + nv1.getAllowance() < nv2.getWageMain() + nv2.getAllowance()) return 1;
            return -1;
        });
        for(Staff nv : res) {
            System.out.println(nv);
        }
    }
}

/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/
