/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_ban_hang_1;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    private static List<KhachHang> lkh = new ArrayList<>();
    private static List<MatHang> lmh = new ArrayList<>();
    private static List<HoaDon> lhd = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void khaibaoKH() {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            lkh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
    }
    
    public static void khaibaoMH() {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            lmh.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
    }
    
    public static void khaibaoHD() {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String maKH = sc.next();
            String maMH = sc.next();
            int amount = sc.nextInt();
            
            for(KhachHang kh: lkh) {
                if(kh.getCode().equals(maKH)) {
                    for(MatHang mh: lmh) {
                        if(mh.getCode().equals(maMH)) {
                            lhd.add(new HoaDon(kh, mh, amount));
                        }
                    }
                }
            }
            
            
        }
    }
    
    public static void main(String[] args) {
        khaibaoKH();
        khaibaoMH();
        khaibaoHD();
        
        for(HoaDon hd: lhd) {
            System.out.println(hd);
        }
    }
}

/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
*/