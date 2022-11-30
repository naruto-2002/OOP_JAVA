/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bao_cao_thuc_tap_co_so;

import java.io.File;
import java.io.FileNotFoundException;
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
    public static void main(String[] args) throws FileNotFoundException {
        String fsv = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\bao_cao_thuc_tap_co_so\\SINHVIEN.in";
        String fdt = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\bao_cao_thuc_tap_co_so\\DETAI.in";
        String fhd = "D:\\Documents\\nam_3_ki_1\\lap_trinh_huong_doi_tuong_java\\CodePtit\\src\\main\\java\\bao_cao_thuc_tap_co_so\\HOIDONG.in";
        
        Scanner scSV = new Scanner(new File("SINHVIEN.in"));
        Scanner scDT = new Scanner(new File("DETAI.in"));
        Scanner scHD = new Scanner(new File("HOIDONG.in"));

        List<SinhVien> lsv = new ArrayList<>();
        List<DeTai> ldt = new ArrayList<>();

        int t1 = Integer.parseInt(scSV.nextLine());
        while(t1-- > 0) {
            SinhVien sv = new SinhVien(scSV.nextLine(), scSV.nextLine(), scSV.nextLine(), scSV.nextLine());
            lsv.add(sv);
        }

        int t2 = Integer.parseInt(scDT.nextLine());
        for(int i = 0; i < t2; i++) {
            DeTai dt = new DeTai(i + 1, scDT.nextLine(), scDT.nextLine());
            ldt.add(dt);
        }

        int t3 = Integer.parseInt(scHD.next());
        while(t3-- > 0) {
            String maSV = scHD.next();
            String maDT = scHD.next();
            String maHD = scHD.next();
            for(SinhVien i: lsv) {
                if(maSV.equals(i.getMa())) {
                    for(DeTai j: ldt) {
                        if(maDT.equals(j.getMa())) {
                            i.setHotenGV(j.getTenGV());
                            i.setTenDT(j.getTenDT());
                            i.setMaHD(maHD);
                            break;
                        }
                    }
                }
            }
        }

        Collections.sort(lsv);
        int ma = 0;
        for(SinhVien i: lsv){
            int check = Integer.parseInt(String.valueOf(i.getMaHD().charAt(2)));
            if(ma != check){
                ma = check;
                System.out.println("DANH SACH HOI DONG " + ma + ":");
            }
            System.out.println(i);
        }

        
    }
}

/*
B19DCCN999 Ngo Quang Huy 0976544443 B19DCCN999@stu.ptit.edu.vn Tran Thanh Cong Xay dung he thong diem danh bang nhan dang van tay

B19DCCN997 Nguyen Manh Cuong 0987654321 B19DCCN997@stu.ptit.edu.vn Nguyen Hoai Nam Xay dung website tim kiem nha thong minh
*/
