/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_thuan_nghich_trong_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Nguyen Cong Van
 */
public class Mian {
    public static boolean KT(int n) {
        String s = Integer.toString(n);
        if(s.length()%2 == 0 || s.length() == 1) return false;
        for(int i = 0; i <= s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1) || s.charAt(i)%2 == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<Integer> l1 = IOFile.read("DATA1.in");
        List<Integer> l2 = IOFile.read("DATA2.in");
        
        TreeMap<Integer, Integer> res = new TreeMap<>();
        
        for(int i: l2) {
            if(res.containsKey(i)) res.put(i, res.get(i) + 1);
            else if(KT(i) && l1.contains(i)) res.put(i, 1);
        }
        
        for(int i: l1) {
            if(res.containsKey(i)) res.put(i, res.get(i) + 1);
        }
        
        int dem = 0;
        for(Integer i: res.keySet()) {
            System.out.println(i + " " + res.get(i));
            dem++;
            if(dem == 10) break;
        }
    }
}
