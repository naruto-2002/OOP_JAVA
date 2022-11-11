/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Nguyen Cong Van
 */
public class DichVu implements Serializable{
    private int ma;
    private String ten, nhom;
    private int CP, GC;
    
    private static int sma = 1000;

    public DichVu(int ma, String ten, String nhom, int CP, int GC){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.CP = CP;
        this.GC = GC;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DichVu.sma = sma;
    }
    
    public Object[] toObjects() {
        return new Object[] {
            ma, ten, nhom, CP, GC
        };
    }
    
}
