/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_khach_hang_trong_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String fname = "src\\main\\java\\danh_sach_khach_hang_trong_file\\KHACHHANG.in";
        try {
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            List<KhachHang> lkh = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while(t-- > 0) {
                lkh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            sort(lkh, new KhachHang());
            for(KhachHang kh: lkh) {
                System.out.println(kh);
            }
            
            
        } catch (FileNotFoundException | NumberFormatException e) {
        }
    }

}
