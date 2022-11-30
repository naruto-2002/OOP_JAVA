/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    private static long getSo(String s) {
        return Long.parseLong(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = getSo(sc.nextLine());
        ArrayList<HoaDon> res = new ArrayList<>();
        while(t-- > 0) {
            res.add(new HoaDon(sc.nextLine(), sc.nextLine(), getSo(sc.nextLine()), getSo(sc.nextLine()), getSo(sc.nextLine())));
        }
        Collections.sort(res);
        for(HoaDon hd: res) {
            System.out.println(hd);
        }
    }
}

/*
3
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
*/
