/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuyen_giao_vien;

/**
 *
 * @author Nguyen Cong Van
 */
public class GiaoVien {
    private String ma, ten, maXT;
    private double diemTH, diemCM, diemT;
    
    private static int cnt = 1;

    public GiaoVien() {
    }

    public GiaoVien(String enter, String ten, String maXT, double diemTH, double diemCM) {
        ma = "GV" + String.format("%02d", cnt);
        cnt++;
        this.ten = ten;
        this.maXT = maXT;
        this.diemTH = diemTH;
        this.diemCM = diemCM;
        diemT = (double) (diemTH*2 + diemCM + getUT());
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaXT() {
        return maXT;
    }

    public void setMaXT(String maXT) {
        this.maXT = maXT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double getDiemCM() {
        return diemCM;
    }

    public void setDiemCM(double diemCM) {
        this.diemCM = diemCM;
    }

    public double getDiemT() {
        return diemT;
    }

    public void setDiemT(double diemT) {
        this.diemT = diemT;
    }
    
    
    
    private double getUT() {
        Character c = maXT.charAt(1);
        if(c == '1') return 2;
        else if(c == '2') return 1.5;
        else if(c == '3') return 1;
        return 0;
    }
    
    private String getRank() {
        if(diemT >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }
  
    private String getTenMH() {
        Character c = maXT.charAt(0);
        if(c == 'A') return "TOAN";
        else if(c == 'B') return "LY";
        return "HOA";
    }
    
    public String toString() {
        String s = ma + " " + ten + " " + getTenMH() + " " + String.format("%.1f", diemT) + " " + getRank();
        return s;
    }
}
