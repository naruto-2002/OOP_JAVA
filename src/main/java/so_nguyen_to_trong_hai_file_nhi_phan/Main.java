/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_nguyen_to_trong_hai_file_nhi_phan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i*i <= n; i += 2)
            if(n%i == 0) return false;
        return true;
    }
    public static boolean isThuanNgich(int n) {
        String s = Integer.toString(n);
        int l = s.length();
        for(int i = 0; i < l/2; i++)
            if(s.charAt(i) != s.charAt(l - i - 1))
                return false;
        return true;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a = IOFile.read("DATA1.in");
        b = IOFile.read("DATA2.in");
        
        TreeMap<Integer, Integer> ar = new TreeMap<>();
        TreeMap<Integer, Integer> br = new TreeMap<>();
        
        for(int i: a)
            if(ar.containsKey(i)) ar.put(i, ar.get(i) + 1);
            else if(isPrime(i) && isThuanNgich(i) && b.contains(i)) ar.put(i, 1);
        
        for(int i: b)
            if(br.containsKey(i)) br.put(i, br.get(i) + 1);
            else if(ar.containsKey(i)) br.put(i, 1);
        
        for(int tmp: ar.keySet()) {
            System.out.printf("%d %d %d\n", tmp, ar.get(tmp), br.get(tmp));
        }
            
            
        
    }
}
