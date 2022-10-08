/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau_lac_bo_bong_da;

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
        int t1 = sc.nextInt();
        ArrayList<Club> res1 = new ArrayList<>();
        while(t1-- > 0) {
            Club clb = new Club();
            clb.input(sc);
            res1.add(clb);
        }
        int t2 = sc.nextInt();
        ArrayList<Match> res2 = new ArrayList<>();
        while(t2-- > 0) {
            Match trd = new Match();
            trd.input(sc);
            res2.add(trd);
        }
        ArrayList<OutPut> res3 = new ArrayList<>();
        for(Match trd: res2) {
            OutPut op = new OutPut();
            op.code = trd.code2;
            String s = trd.code2.substring(1, 3);
            for(Club clb: res1) {
                if(s.compareTo(clb.code1) == 0) {
                    op.name = clb.name;
                    op.turnevor = trd.fan*clb.price;
                    break;
                }
            }
            res3.add(op);
        }
        Collections.sort(res3, (OutPut op1, OutPut op2) -> {
            if(op1.turnevor < op2.turnevor) return 1;
            else if(op1.turnevor == op2.turnevor) {
                if(op1.name.compareTo(op2.name) > 0) return 1;
            }
            return -1;
        });
        for(OutPut op: res3) {
            System.out.println(op);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/