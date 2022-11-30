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
public class CongNhan implements Serializable{
    private int ma;
    private String hoten, dc;
    private int soDT, bac;

    public CongNhan() {
    }

    public CongNhan(int ma, String hoten, String dc, int soDT, int bac) {
        this.ma = ma;
        this.hoten = hoten;
        this.dc = dc;
        this.soDT = soDT;
        this.bac = bac;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
    public Object[] toObjects() {
        return new Object[] {
          ma, hoten, dc, soDT, bac
        };
    }
    
}
