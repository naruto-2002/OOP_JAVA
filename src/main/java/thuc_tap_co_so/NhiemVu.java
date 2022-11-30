/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_tap_co_so;

/**
 *
 * @author Nguyen Cong Van
 */
public class NhiemVu {
    private String maSV, maDT;

    public NhiemVu() {
    }

    public NhiemVu(String maSV, String maDT) {
        this.maSV = maSV.trim();
        this.maDT = maDT.trim();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }
    
    
}
