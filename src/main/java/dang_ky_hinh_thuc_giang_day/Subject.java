/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dang_ky_hinh_thuc_giang_day;


/**
 *
 * @author Nguyen Cong Van
 */
public class Subject implements Comparable<Subject>{
    private String code, name;
    private int stc;
    private String theory, practice;
    
    public Subject(String code, String name, int stc, String enter, String theory, String practice) {
        this.code = code;
        this.name = name;
        this.stc = stc;
        this.theory = theory;
        this.practice = practice;
    }
    
    public String getTh() {
        return practice;
    }
    
    public String toString() {
        return code + " " + name + " " + stc + " " + theory + " " + practice;
    }
    
    public int compareTo(Subject o) {
        return code.compareTo(o.code);
    }
}
