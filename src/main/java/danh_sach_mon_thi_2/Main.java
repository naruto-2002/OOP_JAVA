/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_mon_thi_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String fname = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\danh_sach_mon_thi_2\\MONHOC.in";
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            List<MonHoc> lmh = new ArrayList<>();
            while(sc.hasNext()) {
                String ma = sc.nextLine();
                MonHoc mh = new MonHoc(ma, sc.nextLine().trim(), sc.nextLine().trim());
                int ok = 0;
                for(int i = 0; i < lmh.size(); i++) {
                    if(ma.equals(lmh.get(i).getMa())) {
                        ok = 1;
                        break;
                    }
                }
                if(ok == 0) {
                    lmh.add(mh);
                }
                
            }
            
            Collections.sort(lmh);
            
            for(MonHoc i: lmh) {
                System.out.println(i);
            }
            
            
            
        } catch (Exception e) {
        }
    }
}
