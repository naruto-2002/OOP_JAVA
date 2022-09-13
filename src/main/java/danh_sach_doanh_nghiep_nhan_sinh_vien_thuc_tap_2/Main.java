/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_2;

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
        ArrayList<Enterprise> res = new ArrayList<>();
        while(t-- > 0) {
            Enterprise dn = new Enterprise();
            dn.input(sc);
            res.add(dn);
        }
        Collections.sort(res, (Enterprise dn1, Enterprise dn2) -> {
            if(dn1.quantity == dn2.quantity) {
                return dn1.code.compareTo(dn2.code);
            }
            return dn2.quantity - dn1.quantity;
        });
        int tt = sc.nextInt();
        while(tt-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(Enterprise dn : res) {
                if(dn.quantity >= a && dn.quantity <= b) {
                    System.out.println(dn);
                }
            }
        }
    }
}
