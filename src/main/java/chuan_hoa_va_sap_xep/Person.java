/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuan_hoa_va_sap_xep;

/**
 *
 * @author Nguyen Cong Van
 */
public class Person implements Comparable<Person>{
    private String name;
    
    Person(String name) {
        this.name = formName(name);
    }

    String formName(String s) {
        String[] ans = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String ss: ans) {
            res += ss.substring(0, 1).toUpperCase() + ss.substring(1) + ' ';
        }
        return res.substring(0, res.length() - 1);
    }
    
    String getName() {
        String[] ans = name.trim().toLowerCase().split("\\s+");
        return ans[ans.length - 1];
    }
    
    public int compareTo(Person o) {
        if(getName().equals(o.getName()))
            return name.compareTo(o.name);
        return getName().compareTo(o.getName());
    }
    
    public String toString() {
        return name;
    }
}
