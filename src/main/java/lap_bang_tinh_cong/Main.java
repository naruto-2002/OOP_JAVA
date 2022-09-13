/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_bang_tinh_cong;

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
        sc.nextLine();
        ArrayList<Staff> res = new ArrayList<>();
        while(t-- > 0) {
            Staff nv = new Staff();
            nv.input(sc);
            res.add(nv);
        }
        Collections.sort(res, (Staff nv1, Staff nv2) -> {
            if(nv1.getMoney() > nv2.getMoney()) return -1;
            return 1;
        });
        for(Staff nv : res) {
            System.out.println(nv);
        }
    }
}

/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
*/