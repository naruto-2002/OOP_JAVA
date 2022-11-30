/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_so_du;

import java.math.BigInteger;
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
            BigInteger a = new BigInteger(s);
            BigInteger b = new BigInteger("4");
            BigInteger c = new BigInteger("0");
            if(a.mod(b).equals(c)) {
                System.out.println("4");
            }else {
                System.out.println("0");
            }
            
        }
    }
}
