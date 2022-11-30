/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghep_ma;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String fname1 = "DATA1.in";
        String fname2 = "DATA2.in";

        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        l1 = IOFile.red(fname1);
        l2 = IOFile.red(fname2);
        
        TreeSet<String> res = new TreeSet<>();
        
        for(String i: l1)
            for(Integer j: l2) {
                res.add(i + j + "");
            }
        
        for(String i: res) {
            System.out.println(i);
        }
                
                
        
    }
    
    
    
}
