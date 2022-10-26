/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dang_ky_hinh_thuc_giang_day;

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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Subject> res = new ArrayList<>();
        while(t-- > 0) {
            res.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(res);
        for(Subject mh: res) {
            if(!mh.getTh().equals("Truc tiep")) {
                System.out.println(mh);
            }
        }
    }
}
