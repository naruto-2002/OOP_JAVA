/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lich_giang_day_theo_giang_vien;

/**
 *
 * @author Nguyen Cong Van
 */
public class MonHoc {
    private String ma, ten;
    private int soTC;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, int soTC) {
        this.ma = ma.trim();
        this.ten = ten.trim();
        this.soTC = soTC;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
    
    
}
