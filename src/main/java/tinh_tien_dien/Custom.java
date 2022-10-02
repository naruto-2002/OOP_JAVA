/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tien_dien;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Custom {
    String code, type;
    long oldIndex, newIndex;
    
    static int cnt = 1;
    
    Custom() {}
    
    void input(Scanner sc) {
        code = "KH" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        type = sc.next();
        oldIndex = sc.nextLong();
        newIndex = sc.nextLong();
    }
    
    long getCoefficient() {
        switch(type) {
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            case "CN":
                return 2;
        }
        return 0;
    }
    
    long getMoney() {
        return (long) ((newIndex - oldIndex)*getCoefficient()*550);
    }
    
    long getSub() {
        if(newIndex - oldIndex > 100) return (long) getMoney();
        else if(newIndex - oldIndex >= 50) return (long) Math.ceil(getMoney()*35/100.0);
        return 0;
    }
    
    long getTotal() {
        return getSub() + getMoney();
    }
    
    public String toString() {
        return code + " " + getCoefficient() + " " + getMoney() + " " + getSub() + " " + getTotal();
    }
}
