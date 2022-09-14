/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bang_ke_nhap_kho;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Item {
    String code, name;
    float quantity, price;
    static Map<String, Integer> mp = new HashMap<>();
    
    Item() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        name = sc.nextLine();
        
        mp.put(getSign(name), mp.containsKey(getSign(name)) ? mp.get(getSign(name)) + 1 : 1);
        int cnt = mp.get(getSign(name));
        code = getSign(name) + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        
        quantity = sc.nextFloat();
        price = sc.nextFloat();
        
        
        
        
    }
    
    String getSign(String s) {
        String[] ans = s.toUpperCase().split(" ");
        return ans[0].substring(0,1) + ans[1].substring(0,1);
    }
    
    float getPercent() {
        if(quantity > 10) return (float) 0.05;
        else if(quantity >= 8) return (float) 0.02;
        else if(quantity >= 5) return (float) 0.01;
        return 0;
    }
    
    long getBuy() {
         return (long) (price*quantity);
    }
    
    long getDiscount() {
        return (long) (getBuy()*getPercent());
    }
    
    long getMoney() {
        return getBuy() - getDiscount();
    }
    
    public String toString() {
        return code + " " + name + " " + getDiscount() + " " + getMoney();
    }
}
