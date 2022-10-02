/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tra_cuu_don_hang;

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
            if(sp1.code.substring(1).compareTo(sp2.code.substring(1)) > 0) return 1;
            return -1;
        });
        for(Item sp : res) {
            System.out.println(sp);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/