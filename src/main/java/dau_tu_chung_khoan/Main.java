/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dau_tu_chung_khoan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-- > 0) {
           int n = sc.nextInt();
           int[] a = new int[n];
           for(int i = 0; i < n; i++) a[i] = sc.nextInt();
           Stack<Integer> S = new Stack<>();
           S.add(-1);
           for(int i = 0; i < n; i++) {
               while(S.peek() != -1 && a[S.peek()] <= a[i])
                   S.pop();
               System.out.print((i - S.peek()) + " ");
               S.add(i);
           }
           System.out.println("");
       }
       
        
    }
}
