/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuan_hoa_danh_sach_sinh_vien;

/**
 *
 * @author Nguyen Cong Van
 */
public class SinhVien {
    private String maSV, hoten, lop, ngS;
    private float gpa;
    
    private static int cnt = 1;

    public SinhVien() {
    }

    public SinhVien(String hoten, String lop, String ngS, float gpa) {
        maSV = "B20DCCN" + String.format("%03d", cnt);
        cnt++;
        this.hoten = formName(hoten);
        this.lop = lop;
        this.ngS = formDate(ngS);
        this.gpa = gpa;
    }

    private String formName(String s) {
        String[] ans = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String ss: ans) 
            res += ss.substring(0, 1).toUpperCase() + ss.substring(1) + " ";
        return res.substring(0, res.length() - 1);
    }
    
    private String formDate(String s) {
        String[] ans = s.split("/");
        for(int i = 0; i < ans.length - 1; i++)
            if(ans[i].length() == 1)
                ans[i] = '0' + ans[i];
        return ans[0] + '/' + ans[1] + '/' + ans[2];
    }
    
    public String toString() {
        String s = maSV + " " + hoten + " " + lop + " " + ngS + " " + String.format("%.2f", gpa);
        return s;
    }
    
}
