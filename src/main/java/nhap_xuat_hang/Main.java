/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhap_xuat_hang;

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
        sc.nextLine();
        ArrayList<Item> res1 = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            Item sp = new Item();
            sp.input(sc);
            res1.add(sp);
        }
        int tt = sc.nextInt();
        ArrayList<Statistic> res2 = new ArrayList<>();
        for(int i = 0; i < tt; i++) {
            Statistic tk = new Statistic();
            tk.input(sc);
            res2.add(tk);
        }
        
        for(Statistic tk: res2) {
            for(Item sp: res1) {
                if(tk.code.compareTo(sp.code) == 0) {
                    System.out.println(sp.code + " " + sp.name + " " + (long)(tk.inp*tk.price) + " " + (long)((tk.outp*tk.price)*(1 + sp.getInterest())));
                    break;
                }
            }
        }
    }
}
/*
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
*/