/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhap_xuat_hang;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Statistic {
    String code;
    long inp, price, outp; 
    
    void input(Scanner sc) {
        code = sc.next();
        inp = sc.nextLong();
        price = sc.nextLong();
        outp = sc.nextLong();
    }
    
    
}
