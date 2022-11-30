/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_bai_tap_nhom_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class SinhVien {
    private String ma, hoten, soDT;
    private int TTN;
    

    public SinhVien() {
    }

    public SinhVien(String ma, String hoten, String soDT, int TTN, String enter) {
        this.ma = ma;
        this.hoten = hoten;
        this.soDT = soDT;
        this.TTN = TTN;
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

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getTTN() {
        return TTN;
    }

    public void setTTN(int TTN) {
        this.TTN = TTN;
    }
    
    @Override
    public String toString() {
        String s = ma + " " + hoten + " " + soDT;
        return s;
    }
}
