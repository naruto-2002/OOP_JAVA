/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dua_xe_dap;

/**
 *
 * @author Nguyen Cong Van
 */
public class Cua_ro {
    private String ma, ten, dv, tg;

    public Cua_ro() {
    }

    public Cua_ro(String ten, String dv, String tg) {
        this.ten = ten;
        this.dv = dv;
        this.tg = tg;
        ma = formMa();
    }
    
    private String formMa() {
        String[] s1 = dv.split("\\s+");
        String res1 = "";
        for(String i: s1)
            res1 += i.charAt(0);
        String[] s2 = ten.split("\\s+");
        String res2 = "";
        for(String i: s2)
            res1 += i.charAt(0);
        return res1 + res2;
    }
    
    private double getSo(String s) {
        return Double.parseDouble(s);
    }
    
    public double getVTB() {
        String[] ans = tg.split(":");
        double a = getSo(ans[0]);
        double b = getSo(ans[1]);
        double c = a + b/60;
        return 120/(c - 6);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }
    
    
    
    public String toString() {
        String s = ma + " " + ten + " " + dv + " " + Math.round(getVTB()) + " " + "Km/h";
        return s;
    }
    
}
