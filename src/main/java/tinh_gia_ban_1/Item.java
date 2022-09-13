/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_gia_ban_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Item {
    String code, name, unit;
    float transportFee, inputPrice, quantity;
    
    static int cnt = 1;
    
    Item() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = "MH" + (cnt < 10 ? "0" + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        unit = sc.nextLine();
        inputPrice = sc.nextFloat();
        quantity = sc.nextFloat();
    }
    
    long getTransportFee() {
        return Math.round((inputPrice*quantity)*0.05);
    }
    
    long getMoney() {
        return Math.round(inputPrice*quantity + getTransportFee());
    }
    
    long getSell() {
        return Math.round(Math.ceil(((getMoney() + getMoney()*0.02)/quantity)/100)*100);
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + unit + " " + getTransportFee() + " " + getMoney() + " " + getSell();
    }
}
