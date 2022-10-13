/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem_tuyen_sinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        ArrayList<Student> res = new ArrayList<>();
        while(t-- > 0) {
            Student hs = new Student(sc);
            res.add(hs);
        }
        Collections.sort(res);
        for(Student hs: res) {
            System.out.println(hs);
        }
    }
}
