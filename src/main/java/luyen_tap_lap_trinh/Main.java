/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyen_tap_lap_trinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String fname = "";
        try {
            Scanner sc = new Scanner(new File("LUYENTAP.in"));
            List<SinhVien> lsv = new ArrayList<>();
            int t = sc.nextInt();
            while(t-- > 0) {
                sc.nextLine();
                SinhVien sv = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
                lsv.add(sv);
            }
            
            lsv.sort(new Comparator<SinhVien>() {
                public int compare(SinhVien o1, SinhVien o2) {
                    if(o1.getBaiAC() == o2.getBaiAC()) {
                        if(o1.getSubmit() == o2.getSubmit()) {
                            return o1.getHoten().compareTo(o2.getHoten());
                        }else 
                            return (o1.getSubmit() + "").compareTo(o2.getSubmit() + "");
                    }
                    return (o2.getBaiAC() + "").compareTo(o1.getBaiAC() + "");
                    
                }
            
            });
            
            for(SinhVien i: lsv) {
                System.out.println(i);
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        
        
    }
}
