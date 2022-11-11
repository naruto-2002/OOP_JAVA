/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordset;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Cong Van
 */
public class WordSet {
    private String s;
    
    private TreeSet<String> hop = new TreeSet<>();
    private TreeSet<String> giao = new TreeSet<>();

    public WordSet() {
    }

    public WordSet(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    WordSet union(WordSet ws) {
        String[] ans1 = s.toLowerCase().split("[' ']+");
        String[] ans2 = ws.s.toLowerCase().split("[' ']+");
        
        for(String ss: ans1) {
            hop.add(ss);
        }
        
        for(String ss: ans2) {
            hop.add(ss);
        }
        
        String sss = "";
        for(String ss: hop) {
            sss = sss + ss + " ";
        }
        
        return new WordSet(sss);
    }
    
    WordSet intersection(WordSet ws) {
        String[] ans1 = s.toLowerCase().split("[' ']+");
        String[] ans2 = ws.s.toLowerCase().split("[' ']+");
        
        ArrayList<String> ans3 = new ArrayList<>();
        
        for(String ss: ans1) {
           ans3.add(ss);
        }
        
        for(String ss: ans2) {
            if(ans3.contains(ss)) {
                giao.add(ss);
            }
        }
        
        String sss = "";
        for(String ss: giao) {
            sss = sss + ss + " ";
        }
        
        return new WordSet(sss);
    }
    
    @Override
    public String toString() {
        return s;
    }
}
