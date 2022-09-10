/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Loai_bo_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            String s = sc.next();
            String ss = s;
            while(ss.contains("101") == true) {
                ss = ss.replace("101", "1");
            }
            System.out.println(ss);
        }
        
    }
}
