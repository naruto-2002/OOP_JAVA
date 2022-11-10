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
public class QLMuon implements Serializable{
    private BanDoc bandoc;
    private Sach sach;
    private int soL;
    private String TT;

    public QLMuon() {
    }

    public QLMuon(BanDoc bandoc, Sach sach, int soL, String TT) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.soL = soL;
        this.TT = TT;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoL() {
        return soL;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }

    public String getTT() {
        return TT;
    }

    public void setTT(String TT) {
        this.TT = TT;
    }
    
    public String getMavaten() {
        return bandoc.getMa() + "\t" + bandoc.getHoten();
    }
    
    public Object[] toObjects() {
        return new Object[] {
            bandoc.getMa(), bandoc.getHoten(),
            sach.getMa(), sach.getTen(), soL, TT
        };
    }
    
    
}
