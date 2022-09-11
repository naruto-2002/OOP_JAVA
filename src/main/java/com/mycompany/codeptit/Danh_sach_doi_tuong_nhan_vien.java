/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
class Staff {
    String code, name, sex, date, address, tax, contractDate;
    
    static int cnt = 1;
    
    Staff() {}
    
    void input(Scanner sc) {
        code = "000" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt++;
        name = sc.nextLine();
        sex = sc.nextLine();
        date = sc.nextLine();
        address = sc.nextLine();
        tax = sc.nextLine();
        contractDate = sc.nextLine();
    }
    
    public String toString() {
        return code + " " + name + " " + sex + " " + date + " " + address + " " + tax + " " + contractDate;
    }
    
    
}
public class Danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Staff> res = new ArrayList<>();
        while(t-- > 0) {
            Staff nv = new Staff();
            nv.input(sc);
            res.add(nv);
        }
        for(Staff nv : res) {
            System.out.println(nv);
        }
    }
}

/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/
