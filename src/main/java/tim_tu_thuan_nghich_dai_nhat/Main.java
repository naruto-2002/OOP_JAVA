/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_tu_thuan_nghich_dai_nhat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        String fname = "src\\main\\java\\tim_tu_thuan_nghich_dai_nhat\\VANBAN.txt";
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        int l = 0;
        while(sc.hasNext()) {
            String s = sc.next();
            int ok = 1;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    ok = 0;
                    break;
                }
            }
            if(ok == 1) {
                if(!b.contains(s)) b.add(s);
                a.add(s);
                l = Math.max(l, s.length());
            }
        }
        for(String i: b) {
            if(i.length() == l) {
                System.out.println(i + " " + Collections.frequency(a, i));
            }
        }
        
    }
}
