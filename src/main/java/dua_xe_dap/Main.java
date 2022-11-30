/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dua_xe_dap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cua_ro> lcr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            lcr.add(new Cua_ro(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(lcr, new Comparator<Cua_ro>(){
            @Override
            public int compare(Cua_ro o1, Cua_ro o2) {
                if(o1.getVTB() < o2.getVTB()) return 1;
                return -1;
            }
        });
        for(Cua_ro i: lcr) {
            System.out.println(i);
        }
    }
}
/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
*/