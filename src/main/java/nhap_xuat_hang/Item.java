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
public class Item {
    String code, name, rank;
    Item() {}
    void input(Scanner sc) {
        code = sc.nextLine();
        name = sc.nextLine();
        rank = sc.nextLine();
    }
    
    float getInterest() {
        if(rank.compareTo("A") == 0) return (float) 0.08;
        else if(rank.compareTo("B") == 0) return (float) 0.05;
        return (float) 0.02;
    }
}
