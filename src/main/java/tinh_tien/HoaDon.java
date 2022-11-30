/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tien;


/**
 *
 * @author Nguyen Cong Van
 */
public class HoaDon implements Comparable<HoaDon>{
    private String maMH, tenMH;
    private long soL, donG, tienCK;

    public HoaDon() {
    }

    public HoaDon(String maMH, String tenMH, long soL, long donG, long tienCK) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soL = soL;
        this.donG = donG;
        this.tienCK = tienCK;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public long getSoL() {
        return soL;
    }

    public void setSoL(long soL) {
        this.soL = soL;
    }

    public long getDonG() {
        return donG;
    }

    public void setDonG(long donG) {
        this.donG = donG;
    }

    public long getTienCK() {
        return tienCK;
    }

    public void setTienCK(long tienCK) {
        this.tienCK = tienCK;
    }
    
    public long getTotalMoney() {
        return donG*soL - tienCK;
    }
    
    public String toString() {
        String s = maMH + " " + tenMH + " " + soL + " " + donG + " " + tienCK + " " + getTotalMoney();
        return s;
    }

    @Override
    public int compareTo(HoaDon o) {
        if(o.getTotalMoney() > getTotalMoney()) return 1;
        return -1;
    }
    
    
    
    
    
}
