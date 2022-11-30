/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xu_ly_van_ban;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
//         String fname = "src\\main\\java\\xu_ly_van_ban\\VANBAN.txt";
         try {
            Scanner sc = new Scanner(System.in); 
            String s = "";
            while(sc.hasNext()) {
                s += sc.next() + " ";
            }
            
            String[] res = s.toLowerCase().trim().split("[.!?]");
            for(int i = 0; i < res.length; i++) {
                while(res[i].contains("  ")) {
                    res[i].replace("  ", " ");
                }
                res[i] = res[i].trim();
                res[i] = res[i].substring(0, 1).toUpperCase() + res[i].substring(1);
                System.out.println(res[i]);
            }
            
            
        } catch (Exception e) {
        }
         
    }
}
