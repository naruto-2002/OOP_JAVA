/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_luong;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Staff {
    String code, name;
    int salary, wordDay;
    
    Staff() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = sc.nextLine();
        name = sc.nextLine();
        salary = sc.nextInt();
        wordDay = sc.nextInt();
    }
    
    int getHsn() {
        char c = code.charAt(0);
        int year = Integer.parseInt(code.substring(1, 3));
        if(c == 'A') {
            if(year <= 3) return 10;
            else if(year <= 8) return 12;
            else if(year <= 15) return 14;
            return 20;
        }else if(c == 'B') {
            if(year <= 3) return 10;
            else if(year <= 8) return 11;
            else if(year <= 15) return 13;
            return 16;
        }else if(c == 'C') {
            if(year <= 3) return 9;
            else if(year <= 8) return 10;
            else if(year <= 15) return 12;
            return 14;
        }else {
            if(year <= 3) return 8;
            else if(year <= 8) return 9;
            else if(year <= 15) return 11;
            return 13;
        }
    }
}
