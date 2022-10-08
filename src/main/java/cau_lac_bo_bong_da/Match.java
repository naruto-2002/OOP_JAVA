/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau_lac_bo_bong_da;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Match{
    int fan;
    String code2;
    
    Match() {}
    
    void input(Scanner sc) {
        code2 = sc.next();
        fan = sc.nextInt();
    }
    
}
