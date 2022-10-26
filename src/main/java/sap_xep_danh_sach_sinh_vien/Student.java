/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sap_xep_danh_sach_sinh_vien;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Student implements Comparable<Student>{
    private String code, name, phone, email;
    
    public Student(Scanner sc) {
        code = sc.nextLine();
        name = sc.nextLine();
        phone = sc.nextLine();
        email = sc.nextLine();
    }
    
    public String getName() {
        String[] ans = name.split("\\s+");
        return ans[ans.length - 1];
    }
    
    public String toString() {
        return code + " " + name + " " + phone + " " + email;
    }
    
    public int compareTo(Student o) {
        if(getName().equals(o.getName())) {
            if(name.equals(o.name)) {
                return code.compareTo(o.code);
            }
            return name.compareTo(o.name);
        }
        return getName().compareTo(o.getName());
    }
}
