/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_diem_thanh_phan_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student {
    String code, name, clas;
    float point1, point2, point3;
    
    Student() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        
        code = sc.nextLine();
        name = sc.nextLine();
        clas = sc.nextLine();
        point1 = sc.nextFloat();
        point2 = sc.nextFloat();
        point3 = sc.nextFloat();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return code + " " + name + " " + clas + " " + (point1) + " " + (point2) + " " + (point3);
    }
    
}
