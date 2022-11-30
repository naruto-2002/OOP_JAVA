/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuan_hoa_danh_sach_sinh_vien;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String fname = "src\\main\\java\\chuan_hoa_danh_sach_sinh_vien\\SINHVIEN.in";
        try {
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            List<SinhVien> lsv = new ArrayList<>(); 
            int t = Integer.parseInt(sc.nextLine());
            while(t-- > 0) {
                lsv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
            }
            for(SinhVien sv: lsv) {
                System.out.println(sv);
            }
            
            
            
        } catch (Exception e) {
        }
        
    }
}
