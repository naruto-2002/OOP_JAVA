/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thoi_gian_online_lien_tuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> res = new ArrayList<>();
        while(t-- > 0) {
            res.add(new Student(sc));
        }
        Collections.sort(res);
        for(Student sv: res) {
            System.out.println(sv);
        }
    }
}
