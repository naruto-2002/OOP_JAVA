/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            BigInteger A = sc.nextBigInteger();
            BigInteger B = new BigInteger("11");
            BigInteger C = A.divide(B);
            if(C.multiply(B).compareTo(A) == 0) System.out.println(1);
            else System.out.println(0);
        }
        
    }
}
