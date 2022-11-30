/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Nguyen Cong Van
 */
public class XuongSanXuat implements Serializable{
    private int ma;
    private String ten;
    private int hesoCV;

    public XuongSanXuat() {
    }

    public XuongSanXuat(int ma, String ten, int hesoCV) {
        this.ma = ma;
        this.ten = ten;
        this.hesoCV = hesoCV;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHesoCV() {
        return hesoCV;
    }

    public void setHesoCV(int hesoCV) {
        this.hesoCV = hesoCV;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, ten, hesoCV
        };
    }
}
