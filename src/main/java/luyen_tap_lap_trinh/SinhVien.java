/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyen_tap_lap_trinh;

/**
 *
 * @author Nguyen Cong Van
 */
public class SinhVien {
    private String hoten;
    private long baiAC, submit;

    public SinhVien() {
    }

    public SinhVien(String hoten, long baiAC, long submit) {
        this.hoten = hoten;
        this.baiAC = baiAC;
        this.submit = submit;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public long getBaiAC() {
        return baiAC;
    }

    public void setBaiAC(long baiAC) {
        this.baiAC = baiAC;
    }

    public long getSubmit() {
        return submit;
    }

    public void setSubmit(long submit) {
        this.submit = submit;
    }
    
    public String toString() {
        return hoten + " " + baiAC + " " + submit;
    }
}
