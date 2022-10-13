/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ten_viet_tat;

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
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Teacher> res1 = new ArrayList<>();
        while(t-- > 0) {
            res1.add(new Teacher(sc));
        }
        Collections.sort(res1);
        int tt = sc.nextInt();
        while(tt-- > 0) {
            String s = sc.next();
            int k = s.indexOf("*");
            for(Teacher gv: res1) {
                if(k == -1 && gv.getSummary().compareTo(s) == 0) {
                    System.out.println(gv);
                }else if(gv.getSummary().substring(0, k).compareTo(s.substring(0, k)) == 0 && gv.getSummary().substring(k + 1).compareTo(s.substring(k + 1)) == 0) {
                    System.out.println(gv);
                }
            }
        }
        
    }
    
}
