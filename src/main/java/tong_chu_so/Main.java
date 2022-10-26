/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_chu_so;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        ArrayList<String> arr = new ArrayList<>();
//        while(t-- > 0) arr.add(sc.nextLine());
        String fname = "DATA.in";
//        IOFile.write(fname, arr);
        ArrayList<String> res = IOFile.read(fname);
        
        for(String s: res) {
            String ss = "";
            int sum = 0;
            int ok = 0;
            String patter = "\\d{1}";
            for(int i = 0; i < s.length(); i++) {
                String sss = String.valueOf(s.charAt(i));
                if(sss.matches(patter) && s.charAt(i) != '0') ok = 1;
                if(sss.matches(patter) && ok == 1) {
                   ss += sss;
                   sum += Integer.parseInt(sss);
                }
                
            }
            System.out.println(ss + " " + sum);
            
        }
        
        
    }
}
