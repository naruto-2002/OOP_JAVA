/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuyen_dung;

/**
 *
 * @author Nguyen Cong Van
 */
public class Staff implements Comparable<Staff>{
    private String ma, ten;
    private double diemLT, diemTH, diemTB;
    
    private  static int cnt = 1;

    public Staff() {
    }

    public Staff(String ten, double diemLT, double diemTH) {
        ma = "TS" + String.format("%02d", cnt);
        cnt++;
        this.ten = ten;
        this.diemLT = sloveDiem(diemLT);
        this.diemTH = sloveDiem(diemTH);
        diemTB = (this.diemLT + this.diemTH)/2;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    private double sloveDiem(double n) {
        if(n/10 > 1) return n/10;
        return n;
    }
    
    private String getRank() {
        if(diemTB < 5) return "TRUOT";
        else if(diemTB < 8) return "CAN NHAC";
        else if(diemTB <= 9.5) return "DAT";
        return "XUAT SAC";
    }
    
    public String toString() {
        String s = ma + " " + ten + " " + String.format("%.2f", diemTB) + " " + getRank();
        return s;
    }

    @Override
    public int compareTo(Staff o) {
        if(diemTB < o.diemTB) return 1;
        return -1;
    }
}
