/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_tinh_cong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv= new NhanVien(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(nv);
    }
}
/*
Bui Thi Trang
45000
23
PGD
*/