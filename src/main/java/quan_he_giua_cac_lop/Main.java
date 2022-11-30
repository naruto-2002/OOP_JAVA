/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_he_giua_cac_lop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        
        String[][] sIs_a = new String[n][n];
        String[][] shas_a = new String[n][n];
        
        int t = n;
        while(t-- > 0) {
            String s = sc.nextLine();
            String[] ans = s.split("\\s+");
            
        }
        
    }
}

/*
4 5
NgayNhapHoc is-a Ngay
SinhVien is-a Nguoi
SinhVien has-a NgayNhapHoc
Nguoi has-a DiaChi
NgayNhapHoc is-a Ngay
Ngay is-a NgayNhapHoc
SinhVien has-a Ngay
SinhVien has-a DiaChi
Ngay is-a Ngay
*/