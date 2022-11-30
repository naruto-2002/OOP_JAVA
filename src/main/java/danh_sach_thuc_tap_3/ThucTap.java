/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_thuc_tap_3;

/**
 *
 * @author Nguyen Cong Van
 */
public class ThucTap implements Comparable<ThucTap>{
    private SinhVien sv;
    private DoanhNghiep dn;

    public ThucTap() {
    }

    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public DoanhNghiep getDn() {
        return dn;
    }

    public void setDn(DoanhNghiep dn) {
        this.dn = dn;
    }
    
    public String toString() {
        String s = sv.getMa() + " " + sv.getTen() + " " + sv.getLop();
        return s;
    }

    @Override
    public int compareTo(ThucTap o) {
        return this.sv.getMa().compareTo(o.sv.getMa());
    }
    
    
    
}
