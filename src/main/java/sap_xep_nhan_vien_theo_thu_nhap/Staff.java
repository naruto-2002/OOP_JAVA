/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sap_xep_nhan_vien_theo_thu_nhap;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Staff {
    String code, name, position;
    float baseSalary, numberWorkday;
    
    static int cnt = 1;
    
    Staff() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = "NV" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        position = sc.nextLine();
        baseSalary = sc.nextFloat();
        numberWorkday = sc.nextFloat();
    }
    
    long getAllowance() {
        if(position.compareTo("GD") == 0) return 500;
        else if(position.compareTo("PGD") == 0) return 400;
        else if(position.compareTo("TP") == 0) return 300;
        else if(position.compareTo("KT") == 0) return 250;
        return 100;
    }
    
    long getWageMain() {
        return (long) (baseSalary*numberWorkday);
    }
    
    long getAdvance() {
        if((getAllowance() + getWageMain())*0.66666 < 25000) return Math.round(((getAllowance() + getWageMain())*0.66666)/1000)*1000;
        return 25000;
    }
    
    long getRemain() {
        return getAllowance() + getWageMain() - getAdvance();
    }
    
    public String toString() {
        return code + " " + name + " " + getAllowance() + " " + getWageMain() + " " + getAdvance() + " " + getRemain();
    }
}
