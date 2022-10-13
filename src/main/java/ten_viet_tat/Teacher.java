/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ten_viet_tat;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Teacher implements Comparable<Teacher> {
    String name;
    
    Teacher(Scanner sc) {
        name = sc.nextLine();
    }
    
    String getSummary() {
        String[] ans = name.split("\\s+");
        String res = "";
        for(String s: ans) {
            res += s.substring(0, 1) + '.';
        }
        return res.substring(0, res.length() - 1);
    }
    
    String getName() {
        String[] ans = name.split("\\s+");
        return ans[ans.length - 1];
    }
    
    public int compareTo(Teacher o) {
        if(getName().compareTo(o.getName()) == 0) {
            return name.compareTo(o.name);
        }
        return getName().compareTo(o.getName());
    }
    
    public String toString() {
        return name;
    }

    
}
