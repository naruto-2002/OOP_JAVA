/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_kho_xang_dau;

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
        ArrayList<Warehouse> res = new ArrayList<>();
        while(t-- > 0) {
            Warehouse kh = new Warehouse();
            kh.input(sc);
            res.add(kh);
        }
        Collections.sort(res, (Warehouse kh1, Warehouse kh2) -> {
            if(kh1.Money() < kh2.Money()) return 1;
            return -1;
        });
        for(Warehouse kh : res) {
            System.out.println(kh);
        }
    }
}
/*
3
N89BP 4500
D00BP 3500
X92SH 2600
*/