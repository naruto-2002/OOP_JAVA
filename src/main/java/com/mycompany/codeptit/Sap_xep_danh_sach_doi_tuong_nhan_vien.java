/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Cong Van
 */
class Staff {
    String code, name, sex, date, address, tax, contractDate;
    int age = 0;
    static int cnt = 1;
    Staff() {}
    void input(Scanner sc) throws ParseException {
        code = "000" + (cnt < 10 ? '0' + Integer.toString(cnt) : Integer.toString(cnt));
        cnt += 1;
        name = sc.nextLine();
        sex = sc.nextLine();
        date = sc.nextLine();
        address = sc.nextLine();
        tax = sc.nextLine();
        contractDate = sc.nextLine();
        
        
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = format.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        age = 2022 - cal.get(Calendar.YEAR) + 1;
    }
    
    public String toString() {
        return code + " " + name + " " + sex + " " + date + " " + address + " " + tax + " " + contractDate;
    }
}
public class Sap_xep_danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Staff> res = new ArrayList<>();
        while(t-- > 0) {
            Staff nv = new Staff();
            nv.input(sc);
            res.add(nv);
        }
        Collections.sort(res, new Comparator<Staff>() {
            @Override
            public int compare(Staff nv1, Staff nv2) {
               return nv2.age - nv1.age;
            }
        });
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
