/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_luong;

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
        ArrayList<Department> res1 = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            Department pb = new Department();
            pb.input(sc);
            res1.add(pb);
        }
        int tt = sc.nextInt();
        ArrayList<Staff> res2 = new ArrayList<>();
        for(int i = 0; i < tt; i++) {
            Staff nv = new Staff();
            nv.input(sc);
            res2.add(nv);
        }
        ArrayList<Output> res3 = new ArrayList<>();
        for(Staff nv: res2) {
            Output op = new Output();
            String s = nv.code.substring(3);
            for(Department pb: res1) {
                if(s.compareTo(pb.codeRoom) == 0) {
                    op.code = nv.code;
                    op.codeRoom = pb.codeRoom;
                    op.name = nv.name;
                    op.nameRoom = pb.nameRoom;
                    op.salary = nv.salary*nv.wordDay*nv.getHsn()*1000;
                    break;
                }
            }
            res3.add(op);
        }
        String s = sc.next();
        for(Output op: res3) {
            if(s.compareTo(op.codeRoom) == 0) {
                System.out.println("Bang luong phong " + op.nameRoom + ':');
                break;
            }
        }
        for(Output op: res3) {
            if(s.compareTo(op.codeRoom) == 0) {
                System.out.println(op);
            }
        }
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
KH
*/
