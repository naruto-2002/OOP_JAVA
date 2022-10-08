/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_thu_nhap_giao_vien;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Teacher {
    String code, name;
    int salary;
    
    void input(Scanner sc) {
        sc.nextLine();
        code = sc.nextLine();
        name = sc.nextLine();
        salary = sc.nextInt();
    }
    
    int getAllowance() {
        String s = code.substring(0, 2);
        if(s.compareTo("HT") == 0) return 2000000;
        else if(s.compareTo("HP") == 0) return 900000;
        return 500000;
    }
    
    int getRank() {
        return Integer.parseInt(code.substring(2));
    }
    
    int Income() {
        return getAllowance() + getRank()*salary;
    }
    
    
    public String toString() {
        return code + " " + name + " " + getRank() + " " + getAllowance() + " " + Income();
    }
    
    
}
