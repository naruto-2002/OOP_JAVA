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
public class Sach implements Serializable{
    private int ma;
    private String ten, TG, CN;
    private int soL;
    
    private static int sma = 10000;

    public Sach() {
        ma = sma++;
    }

    public Sach(int ma, String ten, String TG, String CN, int soL) {
        this.ma = ma;
        this.ten = ten;
        this.TG = TG;
        this.CN = CN;
        this.soL = soL;
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

    public String getTG() {
        return TG;
    }

    public void setTG(String TG) {
        this.TG = TG;
    }

    public String getCN() {
        return CN;
    }

    public void setCN(String CN) {
        this.CN = CN;
    }

    public int getSoL() {
        return soL;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
             ma, ten, TG, CN, soL
        };
    }
    
}
