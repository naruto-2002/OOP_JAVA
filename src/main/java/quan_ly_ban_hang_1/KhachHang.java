/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_ban_hang_1;

/**
 *
 * @author Nguyen Cong Van
 */
public class KhachHang {
    private String code, name, sex, date, address;
    
    private static int cnt = 1;

    public KhachHang() {
    }

    public KhachHang(String name, String sex, String date, String address) {
        code = "KH" + String.format("%03d", cnt);
        cnt++;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
