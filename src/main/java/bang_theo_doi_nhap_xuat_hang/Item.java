/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_theo_doi_nhap_xuat_hang;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Item {
    String code;
    int quantity;
    
    Item() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = sc.nextLine();
        quantity = sc.nextInt();
        
        
    }
    
    long getSell() {
        if(code.charAt(0) == 'A') return (long) Math.round(0.6*quantity);
        return (long) Math.round(0.7*quantity);
    }
    
    long getPrice() {
        if(code.charAt(code.length() - 1) == 'Y') return 110000;
        return 135000;
    }
    
    long getMoney() {
        return getSell()*getPrice();
    }
    
    long getTax() {
        if(code.charAt(0) == 'A' && code.charAt(code.length() - 1) == 'Y') return (long) (0.08*getMoney());
        else if(code.charAt(0) == 'A' && code.charAt(code.length() - 1) == 'N') return (long) (0.11*getMoney());
        else if(code.charAt(0) == 'B' && code.charAt(code.length() - 1) == 'Y') return (long) (0.17*getMoney());
        else if(code.charAt(0) == 'B' && code.charAt(code.length() - 1) == 'N') return (long) (0.22*getMoney());
        return 0;
    }
    
    public String toString() {
        return code + " " + quantity + " " + (getSell()) + " " + (getPrice()) + " " + (getMoney()) + " " + (getTax()); 
    }
}
