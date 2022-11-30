/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_ban_hang_1;

/**
 *
 * @author Nguyen Cong Van
 */
public class HoaDon {
    private String code;
    private KhachHang kh;
    private MatHang mh;
    private int amount;
    
    private static int cnt = 1;

    public HoaDon() {
    }

    public HoaDon(KhachHang kh, MatHang mh, int amount) {
        code = "HD" + String.format("%03d", cnt);
        cnt++;
        this.kh = kh;
        this.mh = mh;
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public int getMoney() {
        return amount*mh.getSell();
    }
    
    public String toString() {
        String s = code + " " + kh.getName() + " " + kh.getAddress() + " " +
                   mh.getName() + " " + mh.getUnit() + " " + mh.getBuy() + " " +
                   mh.getSell() + " " + amount + " " + getMoney();
        return s;
    }
}
