/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_mon_thi_2;

/**
 *
 * @author Nguyen Cong Van
 */
public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, hinhTT;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, String hinhTT) {
        this.ma = ma;
        this.ten = ten;
        this.hinhTT = hinhTT;
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

    public String getHinhTT() {
        return hinhTT;
    }

    public void setHinhTT(String hinhTT) {
        this.hinhTT = hinhTT;
    }
    
    public String toString() {
        return ma + " " + ten + " " + hinhTT;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.getMa());
    }
}
