/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_toan_tuyen_sinh;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class SinhVien {
    private String ma, hoten;
    private float diemT, diemL, diemH;
    private Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String ma, String enter, String hoten, float diemT, float diemL, float diemH) {
        this.ma = ma;
        this.hoten = hoten;
        this.diemT = diemT;
        this.diemL = diemL;
        this.diemH = diemH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getDiemT() {
        return diemT;
    }

    public void setDiemT(float diemT) {
        this.diemT = diemT;
    }

    public float getDiemL() {
        return diemL;
    }

    public void setDiemL(float diemL) {
        this.diemL = diemL;
    }

    public float getDiemH() {
        return diemH;
    }

    public void setDiemH(float diemH) {
        this.diemH = diemH;
    }
    
    public String getDiemUTKV() {
        String s = ma.substring(0, 3).toUpperCase();
        float diem = 0;
        switch(s) {
            case "KV1":
                diem = (float) 0.5;
                break;
           
            case "KV2":
                diem = 1;
                break;
            
            case "KV3":
                diem = (float) 2.5;
                break;
            
        }
        return (diem == (int) diem? String.format("%.0f", diem): String.format("%.1f", diem));
        
    }

    public String getTD() {
        float diem = diemT*2 + diemL + diemH;
        return (diem == (int) diem ?String.format("%.0f", diem):String.format("%.1f", diem));
    }
    
    public String getTT() {
        return (Float.parseFloat(getTD()) + Float.parseFloat(getDiemUTKV()) >= 24 ? "TRUNG TUYEN" : "TRUOT");
    }
    
    @Override
    public String toString() {
        String s = ma + " " + hoten + " " + getDiemUTKV() + " " + getTD() + " " + getTT();
        return s;
    }
}
