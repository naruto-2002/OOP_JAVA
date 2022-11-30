/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lich_giang_day_theo_giang_vien;

/**
 *
 * @author Nguyen Cong Van
 */
public class NhomLopHocPhan implements Comparable<NhomLopHocPhan>{
    private String maN, maM, tenM;
    private int ngGD;
    private int kipH;
    private String tenGV, phongH;
    
    private static int cnt = 1;

    public NhomLopHocPhan() {
    }

    public NhomLopHocPhan(String maM, int ngGD, int kipH, String tenGV, String phongH) {
        maN = "HP" + String.format("%03d", cnt);
        cnt++;
        this.maM = maM.trim();
        this.ngGD = ngGD;
        this.kipH = kipH;
        this.tenGV = tenGV.trim();
        this.phongH = phongH.trim();
    }

    public String getMaN() {
        return maN;
    }

    public void setMaN(String maN) {
        this.maN = maN;
    }

    public String getMaM() {
        return maM;
    }

    public void setMaM(String maM) {
        this.maM = maM;
    }

    public String getTenM() {
        return tenM;
    }

    public void setTenM(String tenM) {
        this.tenM = tenM;
    }

    public int getNgGD() {
        return ngGD;
    }

    public void setNgGD(int ngGD) {
        this.ngGD = ngGD;
    }

    public int getKipH() {
        return kipH;
    }

    public void setKipH(int kipH) {
        this.kipH = kipH;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getPhongH() {
        return phongH;
    }

    public void setPhongH(String phongH) {
        this.phongH = phongH;
    }
    
    public String toString() {
        String s = maN + " " + tenM + " " + ngGD + " " + kipH + " " + phongH;
        return s;
    }

    @Override
    public int compareTo(NhomLopHocPhan o) {
        if(this.ngGD == o.ngGD) {
            return this.tenGV.compareTo(o.tenGV);
        }else return this.ngGD - o.ngGD;
    }
    
}
