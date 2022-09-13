/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tim_kiem_giang_vien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Lecturer> res = new ArrayList<>();
        while(t-- > 0) {
            Lecturer gv = new Lecturer();
            gv.input(sc);
            res.add(gv);
        }
        int tt = sc.nextInt();
        while(tt-- > 0) {
            String s = sc.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(Lecturer gv : res) {
                if((gv.name.toLowerCase()).contains(s.toLowerCase()) == true) {
                    System.out.println(gv);
                }
            }
        }
    }
}

/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
*/

