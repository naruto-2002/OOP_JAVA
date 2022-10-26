/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_con_lon_nhat;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        String res = "" + s.charAt(l - 1);
        for(int i = l - 2; i >= 0; i--) {
            if(res.length() > 0 && s.charAt(i) >= res.charAt(0)) {
                res = s.charAt(i) + res;
            }
        }
        System.out.println(res);
    }
}
