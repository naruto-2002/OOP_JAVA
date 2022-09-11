/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
class Item {
    
    String code, name, group;
    float buy, sell, profit;
    
    static int cnt = 1;
    
    Item() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = Integer.toString(cnt);
        cnt++;
        name = sc.nextLine();
        group = sc.nextLine();
        buy = sc.nextFloat();
        sell = sc.nextFloat();
        profit = sell - buy;
    }
    
    public String toString() {
        return code + " " + name + " " + group + " " + String.format("%.2f", profit);
    }
}
public class Sap_xep_danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Item> res = new ArrayList<>();
        while(t-- > 0) {
            Item sp = new Item();
            sp.input(sc);
            res.add(sp);
        }
        Collections.sort(res, new Comparator<Item>() {
            public int compare(Item sp1, Item sp2) {
                if(sp1.profit < sp2.profit) return 1;
                return -1;
            }
        });
        for(Item sp : res) {
            System.out.println(sp);
        }
    }
}

/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/
