/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Nguyen Cong Van
 */
public class NhanVien implements Serializable{
    private int ma;
    private String hoten, DC;
    private int soDT;
    
    private static int sma = 1000;
    
    public NhanVien(int ma, String hoten, String DC, int soDT) {
        this.ma = ma;
        this.hoten = hoten;
        this.DC = DC;
        this.soDT = soDT;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, hoten, DC, soDT
        };
    }
}
