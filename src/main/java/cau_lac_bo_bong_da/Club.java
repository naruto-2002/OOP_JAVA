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
public class Club {
    String code1, name;
    int price;
    
    static int cnt = 1;
    
    Club() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code1 = sc.nextLine();
        name = sc.nextLine();
        price = sc.nextInt();
    }
    
}
