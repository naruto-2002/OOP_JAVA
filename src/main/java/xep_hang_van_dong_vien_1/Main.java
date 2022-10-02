/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xep_hang_van_dong_vien_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Athlete> res = new ArrayList<>();
        while(t-- > 0) {
            Athlete vdv = new Athlete() {};
            vdv.input(sc);
            res.add(vdv);
        }
        Collections.sort(res, (Athlete vdv1, Athlete vdv2) -> {
            if(vdv1.time - vdv1.second() > vdv2.time - vdv2.second()) return 1;
            return -1;
        });
        int cnt = 1;
        res.get(0).rank = 1;
        for(int i = 1; i < res.size(); i++) {
            if(res.get(cnt - 1).time - res.get(cnt - 1).second() == res.get(i).time - res.get(i).second()) {
                res.get(i).rank = cnt;
            }else {
                cnt = i + 1;
                res.get(i).rank = cnt;
            }
        }
        for(Athlete vdv : res) {
            System.out.println(vdv);
        }
    }
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/