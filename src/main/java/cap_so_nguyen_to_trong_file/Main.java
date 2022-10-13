/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap_so_nguyen_to_trong_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static boolean KT(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
//        Scanner sc = new Scanner(System.in);
//        
//        int t1 = sc.nextInt();
//        List<Integer> l1 = new ArrayList<>();
//        while(t1-- > 0) {
//            int a = sc.nextInt();
//            l1.add(a);
//        }
//        int t2 = sc.nextInt();
//        List<Integer> l2 = new ArrayList<>();
//        while(t2-- > 0) {
//            int a = sc.nextInt();
//            l2.add(a);
//        }
//        
//        IOFile.write("src\\main\\java\\cap_so_nguyen_to_trong_file\\DATA1.in", l1);
//        IOFile.write("src\\main\\java\\cap_so_nguyen_to_trong_file\\DATA2.in", l2);
        
        List<Integer> res1 = IOFile.resad("DATA1.in");
        List<Integer> res2 = IOFile.resad("DATA2.in");
        
        TreeMap<Integer, Integer> res3 = new TreeMap();
        
        for(Integer i: res1) {
            if(KT(i) == true && i < 500000 && res2.contains(i) == false) {
                int j = 1000000 - i;
                if(KT(j) == true && res1.contains(j) == true && res2.contains(j) == false) {
                    res3.put(i, j);
                }
            }
        }
        
        for(Integer i: res3.keySet()) {
            System.out.println(i + " " + res3.get(i));
        }
        
        
        
        
    }
}
