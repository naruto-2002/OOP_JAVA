/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_tinh_cong;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class NhanVien {
    private String ma, hoten;
    private int luongCB, soNC;
    private String chucvu;
    
    private Scanner sc = new Scanner(System.in);
    
    private static int cnt = 1;

    public NhanVien(String hoten, int luongCB, int soNC, String chucvu) {
        this.ma = "NV" + String.format("%02d", cnt);
        cnt++;
        this.hoten = hoten;
        this.luongCB = luongCB;
        this.soNC = soNC;
        this.chucvu = chucvu;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getSoNC() {
        return soNC;
    }

    public void setSoNC(int soNC) {
        this.soNC = soNC;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    
    public int getLuong() {
        return luongCB*soNC;
    }
    
    public int getTienT() {
        if(soNC >= 25) return (int) (0.2*getLuong());
        else if(soNC >= 22) return (int) (0.1*getLuong());
        return 0;
    }
    
    public int getPC() {
        switch(chucvu) {
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
        }
        return 0;
    }
    
    public int getTT() {
        return getLuong() + getTienT() + getPC();
    }
    
    

    @Override
    public String toString() {
        String s = ma + " " + hoten + " " + getLuong() + " " + getTienT() + " " + getPC() + " " + getTT();
        return s;
    }
    
    
    
}
