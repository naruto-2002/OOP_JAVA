/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_thu_nhap_giao_vien;

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
        ArrayList<Teacher> res = new ArrayList<>();
        while(t-- > 0) {
            Teacher gv = new Teacher();
            gv.input(sc);
            res.add(gv);
        }
        int ht = 0, hp = 0;
        for(Teacher gv : res) {
            String s = gv.code.substring(0, 2);
            if(s.compareTo("HT") == 0){
                ht += 1;
                if(ht < 2) {
                    System.out.println(gv);
                }
            }
            else if(s.compareTo("HP") == 0){
                hp += 1;
                if(hp < 3) {
                    System.out.println(gv);
                }
            }else System.out.println(gv);
        }
    }
}
/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/