/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_thu_nhap_cho_nhan_vien;

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
        ArrayList<Staff> res = new ArrayList<>();
        while(t-- > 0) {
            Staff nv = new Staff();
            nv.input(sc);
            res.add(nv);
        }
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
