/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_tap_co_so;

/**
 *
 * @author Nguyen Cong Van
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma, hoten, soDT, email, hotenGV, tenDT;

    public SinhVien() {
    }

    public SinhVien(String ma, String hoten, String soDT, String email) {
        this.ma = ma.trim();
        this.hoten = hoten.trim();
        this.soDT = soDT.trim();
        this.email = email.trim();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHotenGV() {
        return hotenGV;
    }

    public void setHotenGV(String hotenGV) {
        this.hotenGV = hotenGV;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.tenDT.compareTo(o.getTenDT());
    }
    
    public String toString() {
        return ma + " " + hoten + " " + soDT + " " + email + " " + hotenGV + " " + tenDT;
    }
    
    
}
