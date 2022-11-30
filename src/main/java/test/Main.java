/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static int gcd(int a, int b) {
        int tmp;
        while(b!=0) {
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        List<Pair> lp = IOFile.read("DATA.in");
        List<Pair> res = new ArrayList<>();
        for(Pair p: lp) {
            if(p.getFirst() < p.getSecond() && gcd(p.getFirst(), p.getSecond()) == 1) {
                res.add(p);
            }
        }
        sort(res);
        Pair tmp = null;
        for(Pair p: res) {
            if(!p.equals(tmp)) {
                System.out.println(p);
            }
            tmp = p;
        }
    }
}
