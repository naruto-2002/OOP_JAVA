/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bang_ke_nhap_kho;

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
        ArrayList<Item> res = new ArrayList<>();
        while(t-- > 0) {
            Item sp = new Item();
            sp.input(sc);
            res.add(sp);
        }
        Collections.sort(res, (Item sp1, Item sp2) -> {
            if(sp1.getDiscount() > sp2.getDiscount()) return -1;
            return 1;
        });
        for(Item sp : res) {
            System.out.println(sp);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/