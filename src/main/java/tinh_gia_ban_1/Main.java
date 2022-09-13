/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_gia_ban_1;

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
            if(sp1.getSell() < sp2.getSell()) return 1;
            return -1;
        });
        for(Item sp : res) {
            System.out.println(sp);
        }
        
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
*/
