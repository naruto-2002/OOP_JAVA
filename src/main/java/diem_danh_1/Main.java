/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem_danh_1;

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
        ArrayList<Student> res1 = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            Student sv = new Student();
            sv.input(sc);
            res1.add(sv);
        }
        ArrayList<Attendance> res2 = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            Attendance dd = new Attendance();
            dd.input(sc);
            res2.add(dd);
        }
        ArrayList<Output> res3 = new ArrayList<>();
        for(Student sv: res1) {
            Output op = new Output();
            op.code = sv.code;
            op.name = sv.name;
            op.clas = sv.clas;
            for(Attendance dd: res2) {
                if(dd.code.compareTo(sv.code) == 0) {
                    op.point = dd.getPoint();
                    break;
                }
            }
            res3.add(op);
        }
        String s = sc.next();
        for(Output op:  res3) {
            if(op.clas.compareTo(s) == 0) {
                System.out.println(op);
            }
        }
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B
*/
