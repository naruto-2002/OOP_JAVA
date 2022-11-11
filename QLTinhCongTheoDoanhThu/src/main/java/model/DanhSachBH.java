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
public class DanhSachBH implements Serializable{
    private DichVu dv;
    private NhanVien nv;
    
    private float loiNhuan;

    public DanhSachBH() {
    }

    public DanhSachBH(DichVu dv, NhanVien nv) {
        this.dv = dv;
        this.nv = nv;
        loiNhuan = (float) ((dv.getCP() - dv.getGC())*0.02);
    }

    public DichVu getDv() {
        return dv;
    }

    public void setDv(DichVu dv) {
        this.dv = dv;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public String getMavsHoten() {
        return nv.getMa() + "\t" + nv.getHoten();
    }
    
    public float getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(float loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public Object[] toObjects() {
        return new Object[] {
            nv.getMa(), nv.getHoten(), dv.getMa(), dv.getTen(), loiNhuan
        };
    }
    
    
    
}
