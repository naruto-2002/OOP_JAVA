/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_bai_tap_nhom_2;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> lsv = new ArrayList<>();
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        while(n-- > 0) {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine());
            lsv.add(sv);
        }
        
        List<String> lnh = new ArrayList<>();
        while(m-- > 0) {
            lnh.add(sc.nextLine());
        }
        
        sort(lsv);
        
        for(SinhVien i: lsv) {
            System.out.println(i + " " + i.getTTN() + " " + lnh.get(i.getTTN() - 1));
        }
        
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1
*/