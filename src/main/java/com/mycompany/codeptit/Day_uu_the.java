/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Day_uu_the {
    public static boolean check(String[] s) {
        int n;
        n = s.length;
        int ch = 0, l = 0;
        
        for(String ss : s) {
            if(Integer.parseInt(ss)%2 == 0) ch += 1;
            else l += 1;
        }
        
       
        if(n%2 == 0 && ch > l) return true;
        else if(n%2 != 0 && ch < l) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String[] s = sc.nextLine().split(" ");
            if(check(s) == true) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
