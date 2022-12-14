/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuan_hoa_va_sap_xep;

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
        String fname = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\chuan_hoa_va_sap_xep\\DANHSACH.in";
        Scanner sc = new Scanner(new File(fname));
        ArrayList<Person> res = new ArrayList<>();
        while(sc.hasNext()) {
            String s = sc.nextLine();
            res.add(new Person(s));
        }
        Collections.sort(res);
        for(Person ng: res) {
            System.out.println(ng);
        }
    }
}
