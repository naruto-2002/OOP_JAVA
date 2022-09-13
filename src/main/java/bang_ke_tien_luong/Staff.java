/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_ke_tien_luong;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Staff {
    String code, name, position;
    float wage, numberWorday;
    
    static int cnt = 1;
    
    Staff() {}
    
    void input(Scanner sc) {
        code = "NV" + (cnt < 10 ? "0" + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        wage = sc.nextFloat();
        numberWorday = sc.nextFloat();
        sc.nextLine();
        position = sc.nextLine();
       
    } 
    
    long getSalaryMonth() {
        return  (long)(wage*numberWorday);
    }
    
    long getBonus() {
        if(numberWorday >= 25) return (long) Math.round(getSalaryMonth()*0.2);
        else if(numberWorday >= 22) return (long) Math.round(getSalaryMonth()*0.1);
        return 0;
    }
    
    long getAllowance() {
        if(position.compareTo("GD") == 0) return 250000;
        else if(position.compareTo("PGD") == 0) return 200000;
        else if(position.compareTo("TP") == 0) return 180000;
        return 150000;
    }
    
    long getMoney() {
        return getSalaryMonth() + getBonus() + getAllowance();
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + (getSalaryMonth()) + " " + (getBonus()) + " " + (getAllowance()) + " " + (getMoney()); 
    }
    
    
}
