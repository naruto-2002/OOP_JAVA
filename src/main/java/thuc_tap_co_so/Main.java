/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_tap_co_so;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        String fsv = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\thuc_tap_co_so\\SINHVIEN.in";
        String fdt = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\thuc_tap_co_so\\DETAI.in";
        String fnv = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\thuc_tap_co_so\\NHIEMVU.in";
        try {
            Scanner scSV = new Scanner(new File(fsv));
            Scanner scDT = new Scanner(new File(fdt));
            Scanner scNV = new Scanner(new File(fnv));
            
            List<SinhVien> lsv = new ArrayList<>();
            List<DeTai> ldt = new ArrayList<>();
            List<NhiemVu> lnv = new ArrayList<>();
            
            int t1 = Integer.parseInt(scSV.nextLine());
            while(t1-- > 0) {
                String ma = scSV.nextLine();
                SinhVien sv = new SinhVien(ma, scSV.nextLine(), scSV.nextLine(), scSV.nextLine());
                int ok = 1;
                for(SinhVien i: lsv) {
                    if(ma.equals(i.getMa())) {
                        ok = 0;
                        break;
                    }
                }
                if(ok == 1) lsv.add(sv);
            }
            
            int t2 = Integer.parseInt(scDT.nextLine());
            for(int i = 0; i < t2; i++) {
                DeTai dt = new DeTai(i + 1, scDT.nextLine(), scDT.nextLine());
                ldt.add(dt);
            }
            
            int t3 = scNV.nextInt();
            while(t3-- > 0) {
                String maSV = scNV.next();
                String maDT = scNV.next();
                for(SinhVien i: lsv) {
                    if(maSV.equals(i.getMa())) {
                        for(DeTai j: ldt) {
                            if(maDT.equals(j.getMa())) {
                                i.setHotenGV(j.getTenGV());
                                i.setTenDT(j.getTenDT());
                                break;
                            }
                        }
                    }
                }
            }
            
            Collections.sort(lsv);
            String ma = "";
            for(SinhVien i: lsv) {
                if(!ma.equals(i.getMa())) {
                    ma = i.getMa();
                    System.out.println(i);
                }
            }
            
           
            
            
            
        } catch (Exception e) {
        }
        
    }
}

/*
B19DCCN999 Ngo Quang Huy 0976544443 B19DCCN999@stu.ptit.edu.vn Tran Thanh Cong Xay dung he thong diem danh bang nhan dang van tay

B19DCCN997 Nguyen Manh Cuong 0987654321 B19DCCN997@stu.ptit.edu.vn Nguyen Hoai Nam Xay dung website tim kiem nha thong minh
*/
