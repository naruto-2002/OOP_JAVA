/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liet_ke_va_dem;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String f = "src\\main\\java\\liet_ke_va_dem\\input.in";
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> res = new ArrayList<>();
            while(sc.hasNext()) {
                String s = sc.next();
                int ok = 1;
                for(int i = 0; i < s.length() - 1; i++) {
                    if(s.charAt(i) > s.charAt(i + 1)) {
                        ok = 0;
                        break;
                    }
                }
                if(ok == 1) {
                    res.add(s);
                }
            }
            res.sort((o1, o2) -> Collections.frequency(res, o2) - Collections.frequency(res, o1)); 
            String tmp = "";
            for(String i: res) {
                if(!tmp.equals(i)) {
                    System.out.println(i + " " + Collections.frequency(res, i)); 
                }
                tmp = i;
            }
            
            
            
        } catch (Exception e) {
        }
    }
}
