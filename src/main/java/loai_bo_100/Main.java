/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loai_bo_100;

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
        while(t-- > 0) {
            String s = sc.next();
            int res = 0;
            ArrayList<Integer> pos = new ArrayList<>();
            pos.add(-1);
            String ss = "";
            for(int i = 0; i < s.length(); i++) {
                ss += s.charAt(i);
                pos.add(i);
                while(ss.length() > 0 && ss.endsWith("100")) {
                    ss = ss.substring(0, ss.length() - 3);
                    pos.remove(pos.size() - 1);
                    pos.remove(pos.size() - 1);
                    pos.remove(pos.size() - 1);
                }
                res = Math.max(res, i - pos.get(pos.size() - 1));
            }
            System.out.println(res);
        }
    }
}
