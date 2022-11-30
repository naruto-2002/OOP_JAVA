/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_vi_tri_xau_con;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String fname = "STRING.in";
        try {
             Scanner sc = new Scanner(new File(fname));
             int t = sc.nextInt();
             while(t-- > 0) {
                 String s1 = sc.next(), s2 = sc.next();
                 int k = 0;
                 while(true) {
                     k = s1.indexOf(s2, k);
                     if(k == - 1) break;
                     System.out.print(++k + " ");
                 }
                 System.out.println("");
             }
             
             
             
             
             
             
             
             
             
             
             
             
        } catch (Exception e) {
        }
        
    }
}
