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
public class BanDoc implements Serializable{
    private int ma;
    private String hoten, dc, soDT;
    
    private static int sma = 10000;

    public BanDoc() {
    }

    public BanDoc(int ma, String hoten, String dc, String soDT) {
        this.ma = ma;
        this.hoten = hoten;
        this.dc = dc;
        this.soDT = soDT;
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

    public String getdc() {
        return dc;
    }

    public void setdc(String dc) {
        this.dc = dc;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, hoten, dc, soDT
        };
    }
}
