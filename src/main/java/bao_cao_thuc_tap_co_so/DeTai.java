/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bao_cao_thuc_tap_co_so;


/**
 *
 * @author Nguyen Cong Van
 */
public class DeTai {
    private String ma = "DT", tenGV, tenDT;

    public DeTai() {
    }

    public DeTai(int i, String tenGV, String tenDT) {
        this.ma += String.format("%03d", i);
        this.tenGV = tenGV.trim();
        this.tenDT = tenDT.trim();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }
    
    
    
}
