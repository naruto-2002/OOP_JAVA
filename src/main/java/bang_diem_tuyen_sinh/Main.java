/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_diem_tuyen_sinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student> res = new ArrayList<>();
        while(t-- > 0) {
            Student sv = new Student();
            sv.input(sc);
            res.add(sv);
        }
        Collections.sort(res, (Student sv1, Student sv2) -> {
            if(sv1.total < sv2.total) return 1;
            else if(sv1.total == sv2.total) {
                if(sv1.code.compareTo(sv2.code) > 0) return 1;
            }
            return -1;
        });
        for(Student sv : res) {
            System.out.println(sv);
        }
    }
}
/*
2
KV3A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
*/
