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
public class Tong_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            BigInteger A = sc.nextBigInteger(), B = sc.nextBigInteger();
            System.out.println(A.add(B));
        }
    }
}
