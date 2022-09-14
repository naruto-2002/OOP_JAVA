/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liet_ke_nhan_vien_thheo_chuc_vu;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Staff {
    String code, name, position;
    float baseWage, numberWorkday;
    
    static int cnt = 1;
    
    Staff() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = "NV" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        position = sc.nextLine();
        baseWage = sc.nextFloat();
        numberWorkday = sc.nextFloat();
    }
    
    long getAllowance() {
        if(position.compareTo("GD") == 0) return 500;
        else if(position.compareTo("PGD") == 0) return 400;
        else if(position.compareTo("TP") == 0) return 300;
        else if(position.compareTo("KT") == 0) return 250;
        return 100;
    }
    
    long getWage() {
        return (long) (baseWage*numberWorkday);
    }
    
    long getAdvance() {
        if((getAllowance() + getWage())*0.66666 < 25000){
            return Math.round(((getAllowance() + getWage())*0.66666)/1000)*1000;
        }
        return 25000;
    }
    
    long getRemain() {
        return getAllowance() + getWage() - getAdvance();
    }
    
    public String toString() {
        return code + " " + name + " " + (getAllowance()) + " " + (getWage()) + " " +( getAdvance()) + " " + (getRemain());
    }
}
