/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
class Gamer {
    String code, name, timeIn, timeOut;
    int timeTotal;
    
    Gamer() {}
    
    void input(Scanner sc) {
        code = sc.nextLine();
        name = sc.nextLine();
        timeIn = sc.nextLine();
        timeOut = sc.nextLine();
        timeTotal = (Integer.parseInt(timeOut.substring(0, 2))*60 + Integer.parseInt(timeOut.substring(3))) - (Integer.parseInt(timeIn.substring(0, 2))*60 + Integer.parseInt(timeIn.substring(3)));
    }
    
    public String toString() {
        return code + " " + name + " " + (int)(timeTotal/60) + " gio " + (int)(timeTotal%60) + " phut";
    }
}
public class Tinh_gio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Gamer> res = new ArrayList<>();
        while(t-- > 0) {
            Gamer people = new Gamer();
            people.input(sc);
            res.add(people);
        }
        Collections.sort(res, (Gamer people1, Gamer people2) -> people2.timeTotal - people1.timeTotal);
        for(Gamer people : res) {
            System.out.println(people);
        }
    }
}

/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/
