/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_theo_doi_nhap_xuat_hang;

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
            if(sp1.getTax() < sp2.getTax()) return 1;
            return -1;
        });
        String s = sc.next();
        for(Item sp : res) {
            if(sp.code.substring(0, 1).compareTo(s) == 0) {
                System.out.println(sp);
            }
        }
    }
}

/*
3
A001Y
1000
B012N
2500
B003Y
4582
*/
