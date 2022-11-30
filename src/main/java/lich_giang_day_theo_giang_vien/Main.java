/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lich_giang_day_theo_giang_vien;

import java.io.File;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    private static List<MonHoc> lmh =  new ArrayList<>();
    private static List<NhomLopHocPhan> lnlhp =  new ArrayList<>();
    
    private static int getSo(String s) {
        return Integer.parseInt(s);
    }
    
    private static void docMH(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            int t = getSo(sc.nextLine());
            while(t-- > 0) {
                lmh.add(new MonHoc(sc.nextLine(), sc.nextLine(), getSo(sc.nextLine())));
            }
        } catch (Exception e) {
        }
    }
    
    private static void docNLHP(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            int t = getSo(sc.nextLine());
            while(t-- > 0) {
                lnlhp.add(new NhomLopHocPhan(sc.nextLine(), getSo(sc.nextLine()), getSo(sc.nextLine()), sc.nextLine(), sc.nextLine()));
            }
            
            for(MonHoc mh:  lmh) {
                for(NhomLopHocPhan nlhp:  lnlhp) {
                    if(mh.getMa().equals(nlhp.getMaM())) {
                        nlhp.setTenM(mh.getTen());
                    }
                }
            }
            
            sort(lnlhp);
            
            String s = sc.nextLine();
            System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
            for(NhomLopHocPhan nlhp: lnlhp) {
                if(s.equals(nlhp.getTenGV())) {
                    System.out.println(nlhp);
                }
            }
            
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        String f1 = "src\\main\\java\\lich_giang_day_theo_giang_vien\\MONHOC.in";
        String f2 = "src\\main\\java\\lich_giang_day_theo_giang_vien\\LICHGD.in";
        String f3 = "MONHOC.in";
        String f4 = "LICHGD.in";
        docMH(f3);
        docNLHP(f4);
    }
}
