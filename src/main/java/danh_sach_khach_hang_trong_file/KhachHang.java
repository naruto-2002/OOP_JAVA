/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_khach_hang_trong_file;

import java.util.Comparator;

/**
 *
 * @author Nguyen Cong Van
 */
public class KhachHang implements Comparator<KhachHang>{
    private String maKH, name, sex, date, address;
    
    private static int cnt = 1;

    public KhachHang() {
    }

    public KhachHang(String name, String sex, String date, String address) {
        maKH = "KH" + String.format("%03d", cnt);
        cnt++;
        this.name = formName(name);
        this.sex = sex;
        this.date = formDate(date);
        this.address = address;
    }
    
    public String formName(String s) {
        String[] ans = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String ss: ans)
            res += ss.substring(0, 1).toUpperCase() + ss.substring(1) + " ";
        return res.substring(0, res.length() - 1);
    }
    
    public String formDate(String s) {
        String[] ans = s.split("/");
        String res = "";
        for(int i = 0; i < ans.length - 1; i++) {
            if(ans[i].length() == 1)
                ans[i] = '0' + ans[i];
        }
        return ans[0] + '/' + ans[1] + '/' + ans[2];
    }
    
    @Override
    public String toString() {
        String s = maKH + " " + name + " " + sex + " " + address + " " + date;
        return s;
    }
    
    public int getSo(String  s) {
        return Integer.parseInt(s);
    }
    @Override
    public int compare(KhachHang o1, KhachHang o2) {
        String[] d1 = o1.date.split("/");
        String[] d2 = o2.date.split("/");
        if(getSo(d1[2]) == getSo(d2[2])) {
            if(getSo(d1[1]) == getSo(d2[1])) {
                return getSo(d1[0]) - getSo(d2[0]);
            }else return getSo(d1[1]) - getSo(d2[1]);
        }return getSo(d1[2]) - getSo(d2[2]);
    }
}
