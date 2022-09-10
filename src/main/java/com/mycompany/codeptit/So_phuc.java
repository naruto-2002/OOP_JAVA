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
public class So_phuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int a1 = a + c, b1 = b + d;
            System.out.println((a1*a - b1*b) + ((a*b1 + a1*b) > 0 ? " + " : " - ") + Math.abs(a*b1 + a1*b) + "i" + ", " + (a1*a1 - b1*b1) + ((2*a1*b1) > 0 ? " + " : " - ") + Math.abs(2*a1*b1) + "i");
        }
    }
}
