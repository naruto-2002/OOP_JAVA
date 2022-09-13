/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_1;

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
        for(Enterprise dn : res) {
            System.out.println(dn);
        }
    }
}

/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
*/