/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lich_giang_day_theo_mon_hoc;

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
    public static int setSo(String s) {
        return Integer.parseInt(s);
    }
    public static String getTenMH(String maMH, List<MonHoc> lmh) {
        for(MonHoc i: lmh)
            if(maMH.equals(i.getMaMH())) {
                return i.getTenMH();
            }
        return null;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(new File("MONHOC.in"));
            Scanner sc2 = new Scanner(new File("LICHGD.in"));
            
            List<MonHoc> lmh = new ArrayList<>();
            int t = setSo(sc1.nextLine());
            while(t-- > 0) {
                MonHoc mh = new MonHoc(sc1.nextLine(), sc1.nextLine(), setSo(sc1.nextLine()));
                lmh.add(mh);
            }
            
            List<GiangVien> lgv = new ArrayList<>();
            int tt = setSo(sc2.nextLine()); 
            while(tt-- > 0) {
                GiangVien gv = new GiangVien(sc2.nextLine(), setSo(sc2.nextLine()), setSo(sc2.nextLine()), sc2.nextLine(), sc2.nextLine());
                lgv.add(gv);
            }
            
            sort(lgv);
            
            String maMH = sc2.nextLine();
            System.out.println("LICH GIANG DAY MON " + getTenMH(maMH, lmh) + ":");
            for(GiangVien i: lgv) {
                if(maMH.equals(i.getMaMH())) {
                    System.out.println(i);
                }
            }
            
            
            
            
            
            
            
            
        } catch (Exception e) {
        }
    }
}
