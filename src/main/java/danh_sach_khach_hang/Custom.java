/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_khach_hang;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Custom {
    String code, name, sex, date, address, date1;
    
    static int cnt = 1;
    
    Custom(){}
    
    void input(Scanner sc) {
        code = "KH0" + (cnt < 10? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = formName(sc.nextLine());
        sex = sc.nextLine();
        date = formDate(sc.nextLine());
        address = sc.nextLine();
        date1 = formDate1(date);
    }
    
    String formName(String s) {
        String[] ans = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String ss: ans) {
            res += ss.substring(0,1).toUpperCase() + ss.substring(1) + ' ';
        }
        return res.substring(0, res.length() - 1);
    }
    
    String formDate(String s) {
        String[] ans = s.split("/");
        for(int i = 0; i < 2; i++) {
            if(ans[i].length() == 1) {
                ans[i] = '0' + ans[i];
            }
        }
        return ans[0] + '/' + ans[1] + '/' + ans[2];
    }
    
    String formDate1(String s) {
        String[] ans = s.split("/");
        return ans[2] + "/" + ans[1] + "/" + ans[0];
    }
    
    public String toString() {
        return code + " " + name + " " + sex + " " + address + " " + date;
    }
}
