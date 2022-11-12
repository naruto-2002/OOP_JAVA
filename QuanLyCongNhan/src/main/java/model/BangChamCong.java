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
public class BangChamCong implements Serializable{
    private CongNhan congNhan;
    private XuongSanXuat xuongSanXuat;
    private int songayLV;

    public BangChamCong() {
    }

    public BangChamCong(CongNhan congNhan, XuongSanXuat xuongSanXuat, int songayLV) {
        this.congNhan = congNhan;
        this.xuongSanXuat = xuongSanXuat;
        this.songayLV = songayLV;
    }

    public CongNhan getCongNhan() {
        return congNhan;
    }

    public void setCongNhan(CongNhan congNhan) {
        this.congNhan = congNhan;
    }
    
    public String getMavsTen() {
        return congNhan.getMa() + "\t" + congNhan.getHoten();
    }

    public XuongSanXuat getXuongSanXuat() {
        return xuongSanXuat;
    }

    public void setXuongSanXuat(XuongSanXuat xuongSanXuat) {
        this.xuongSanXuat = xuongSanXuat;
    }

    public int getSongayLV() {
        return songayLV;
    }

    public void setSongayLV(int songayLV) {
        this.songayLV = songayLV;
    }

    public int getTN() {
        int tnh = songayLV*xuongSanXuat.getHesoCV()*140000;
        return tnh;
    }

    public Object[] toObjects() {
        return new Object[] {
            congNhan.getMa(), congNhan.getHoten(),
            xuongSanXuat.getMa(), xuongSanXuat.getTen(),
            songayLV
        };
    }
    
}
