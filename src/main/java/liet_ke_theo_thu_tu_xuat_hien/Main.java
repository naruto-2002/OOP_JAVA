/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liet_ke_theo_thu_tu_xuat_hien;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> arr = IOFile.read("NHIPHAN.in");
        Set<String> res1 = new HashSet<>();
        for(String tmp : arr) {
            String[] ans = tmp.split("\\s+");
            for(String s : ans) {
                res1.add(s.toLowerCase());
            }
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> res2 = new HashSet<>();
        while(sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if(res1.contains(s) && !res2.contains(s)) {
                System.out.println(s);
                res2.add(s);
            }
        }
    }
    
}
