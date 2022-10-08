/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ket_qua_xet_tuyen;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Person {
    String name, date, code;
    float theory, practice;
    int medium;
    
    static int cnt = 1;
    
    Person() {}
    
    void input(Scanner sc) {
        code = "PH" + (cnt < 10?'0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        sc.nextLine();
        name = sc.nextLine();
        date = sc.nextLine();
        theory = sc.nextFloat();
        practice = sc.nextFloat();
        medium = ((int)(Math.round((theory + practice)/2 + getBonus())) > 10 ? 10 : (int)(Math.round((theory + practice)/2 + getBonus())));
    }
    
    int getAge() {
        String[] ans = date.split("/");
        return 2021 - Integer.parseInt(ans[2]);
    }
    
    float getBonus() {
        if(theory >= 8 && practice >= 8) return (float) 1.0;
        else if(theory >= 7.5 && practice >= 7.5) return (float) 0.5;
        return (float) 0.0;
    }
    
    String getRank() {
        if(medium < 5 ) return "Truot";
        else if(medium <= 6) return "Trung binh";
        else if(medium == 7) return "Kha";
        else if(medium == 8) return "Gioi";
        else return "Xuat sac";
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + getAge() + " " + medium + " " + getRank();
    }
}
