/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Enterprise {
    String code, name;
    int quantity;
    
    Enterprise() {}
    
    void input(Scanner sc) {
        sc.nextLine();
        code = sc.nextLine();
        name = sc.nextLine();
        quantity = sc.nextInt();
    }
    
    public String toString() {
        return code + " " + name + " " + quantity;
    }
}


