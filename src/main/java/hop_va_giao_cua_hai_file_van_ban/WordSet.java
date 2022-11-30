/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hop_va_giao_cua_hai_file_van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Cong Van
 */
public class WordSet {
    private TreeSet<String> s = new TreeSet<>();
    
    public WordSet(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            while(sc.hasNext()) {
                s.add(sc.next().toLowerCase()); 
            }
        } catch (FileNotFoundException e) {
        }
    }
    
    WordSet(TreeSet<String> p) {
        this.s = p;
    }
    
    WordSet union(WordSet ws) {
        TreeSet<String> res = new TreeSet<>();
        for(String i: s)
            res.add(i);
        for(String i: ws.s)
            res.add(i);
        return new WordSet(res);
        
    }
    
    WordSet intersection(WordSet ws) {
        TreeSet<String> res = new TreeSet<>();
        for(String i: ws.s)
            if(s.contains(i))
                res.add(i);
        return new WordSet(res);
    }
    
    @Override
    public String toString() {
        String res = "";
        for(String i: s)
            res += i + " ";
        return res;
    }
}
