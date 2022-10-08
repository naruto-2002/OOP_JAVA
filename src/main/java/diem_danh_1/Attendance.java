/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem_danh_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Attendance {
    String code, str;
    
    Attendance() {}
    
    void input(Scanner sc) {
        code = sc.next();
        str = sc.next();
    }
    
    int getPoint() {
        int diem = 10;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'v') diem -= 2;
            else if(str.charAt(i) == 'm') diem -= 1;
        }
        return diem;
    }
    
}
