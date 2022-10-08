/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_kho_xang_dau;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Warehouse {
    String singleCode;
    long amount;
    
    Warehouse() {};
    
    void input(Scanner sc) {
        singleCode = sc.next();
        amount = sc.nextInt();
    }
    
    String Manufacturer() {
        String s = singleCode.substring(3);
        if(s.compareTo("BP") == 0) return "British Petro";
        else if(s.compareTo("ES") == 0) return "Esso";
        else if(s.compareTo("SH") == 0) return "Shell";
        else if(s.compareTo("CA") == 0) return "Castrol";
        else if(s.compareTo("MO") == 0) return "Mobil";
        return "Trong Nuoc";
    }
    
    long Price() {
        char s = singleCode.charAt(0);
        if(s == 'X') return 128000;
        else if(s == 'D') return 11200;
        return 9700;
    }
    
    long Tax() {
        char s = singleCode.charAt(0);
        if(singleCode.substring(3).compareTo("TN") == 0) return 0;
        else if(s == 'X') return (long) (128000*0.03);
        else if(s == 'D') return (long) (11200*0.035);
        return (long) (9700*0.02);
    }
    
    long Money() {
        return amount*(Price() + Tax());
    }
    
    public String toString() {
        return singleCode + " " + Manufacturer() + " " + Price() + " " + Tax()*amount + " " + Money();
    }
}
