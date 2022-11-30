/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lich_giang_day_theo_mon_hoc;

/**
 *
 * @author Nguyen Cong Van
 */
public class GiangVien implements Comparable<GiangVien>{
    private String maPH, maMH;
    private int thu, kip;
    private String hoten, phongH;
    
    private static int cnt = 1;

    public GiangVien() {
    }

    public GiangVien(String maMH, int thu, int kip, String hoten, String phongH) {
        maPH = "HP" + String.format("%03d", cnt);
        cnt++;
        this.maMH = maMH;
        this.thu = thu;
        this.kip = kip;
        this.hoten = hoten;
        this.phongH = phongH;
    }

    public String getMaPH() {
        return maPH;
    }

    public String getMaMH() {
        return maMH;
    }

    public int getThu() {
        return thu;
    }

    public int getKip() {
        return kip;
    }

    public String getHoten() {
        return hoten;
    }

    public String getPhongH() {
        return phongH;
    }

    public String toString() {
        String s = maPH + " " + thu + " " + kip + " " + hoten + " " + phongH;
        return s;
    }

    @Override
    public int compareTo(GiangVien o) {
        if(thu == o.getThu()) {
            if(kip == o.getKip()) {
                String[] t1 = hoten.split("s+");
                String[] t2 = o.getHoten().split("s+");
                String ten1 = t1[t1.length - 1] + hoten;
                String ten2 = t2[t2.length - 1] + o.getHoten();
                return ten1.compareTo(ten2);
            }return kip - o.getKip();
        }else return thu - o.getThu();
    }
    
    
    
}
