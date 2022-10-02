/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tra_cuu_don_hang;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Item {
    String name, code;
    long price, quantity;
    
    static int cnt = 1;
    
    Item() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        name = sc.nextLine();
        code = sc.next();
        price = sc.nextLong();
        quantity = sc.nextLong();
    }
    
    String getOrder() {
        return code.substring(1, 4);
    }
    
    long getMoney() {
        return price*quantity;
    }
    
    long getDiscount() {
        if(code.charAt(code.length() - 1) == '1') return (long) (getMoney()*0.5);
        return (long) (price*quantity*0.3);
    }
    
    long getTotal() {
        return getMoney() - getDiscount();
    }
    
    public String toString() {
        return name + " " + code + " " + getOrder() + " " + getDiscount() + " " + getTotal();
    }
}
