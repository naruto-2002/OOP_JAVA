/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hieu_cua_hai_tap_tu;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Cong Van
 */
public class WordSet {
    private TreeSet<String> data = new TreeSet<>();
    
    WordSet(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            while(sc.hasNext())
                data.add(sc.next().toLowerCase());
        } catch (Exception e) {
        }
    }
    
    WordSet(TreeSet<String> ts) {
        this.data = ts;
    }
    
    WordSet difference(WordSet ws) {
        TreeSet<String> res = new TreeSet<>();
        for(String i: data)
            if(!ws.data.contains(i))
                res.add(i);
        return new WordSet(res);
    }
    
    public String toString() {
        String s = "";
        for(String i: data)
            s += i + " ";
        return s;
    }
    
}
