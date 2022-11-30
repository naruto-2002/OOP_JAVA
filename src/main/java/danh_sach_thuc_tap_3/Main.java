/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_thuc_tap_3;

import java.io.File;
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
    private static List<SinhVien> lsv = new ArrayList<>();
    private static List<DoanhNghiep> ldn = new ArrayList<>();
    public static List<ThucTap> ltt = new ArrayList<>();
    
    public static int getSo(String s) {
        return Integer.parseInt(s);
    }
    
    public static void docSV(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            int t = getSo(sc.nextLine());
            while(t-- > 0) {
                lsv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
        } catch (Exception e) {
        }
    }
    
    public static void docDN(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            int t = getSo(sc.nextLine());
            while(t-- > 0) {
                ldn.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), getSo(sc.nextLine())));
            }
        } catch (Exception e) {
        }
    }
    
    public static void docTT(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            int t = getSo(sc.nextLine());
            while(t-- > 0) {
                String maSV = sc.next();
                String maDN = sc.next();
                
                for(SinhVien sv: lsv) {
                    if(sv.getMa().equals(maSV)) {
                        for(DoanhNghiep dn: ldn) {
                            if(dn.getMa().equals(maDN)) {
                                ltt.add(new ThucTap(sv, dn));
                            }
                        }
                    }
                }
            }
            sort(ltt);
            int t1 = sc.nextInt();
            while(t1-- > 0) {
                String s = sc.next();
                System.out.print("DANH SACH THUC TAP TAI ");
                int soSVnhan = 1;
                for(DoanhNghiep dn: ldn) {
                    if(dn.getMa().equals(s)) {
                        soSVnhan = dn.getSoSV();
                        System.out.println(dn.getTen() + ":");
                        break;
                    }
                }
                
                for(ThucTap tt: ltt) {
                    if(tt.getDn().getMa().equals(s)) {
                        soSVnhan--;
                        System.out.println(tt);
                        if(soSVnhan == 0) break;
                    }
                }
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        String f1 = "src\\main\\java\\danh_sach_thuc_tap_3\\SINHVIEN.in";
        String f2 = "src\\main\\java\\danh_sach_thuc_tap_3\\DN.in";
        String f3 = "src\\main\\java\\danh_sach_thuc_tap_3\\THUCTAP.in";
        docSV("SINHVIEN.in");
        docDN("DN.in");
        docTT("THUCTAP.in");
        
        
    }
}
