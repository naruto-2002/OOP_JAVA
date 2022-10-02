/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xep_hang_hoc_sinh;

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
            if(sv1.medium < sv2.medium) return 1;
            return -1;
        });
        int rk = 1, previrk = 0;
        float previMedium = -1;
        for(Student sv : res) {
            if(sv.medium == previMedium) {
                sv.level = previrk;
            }else {
                sv.level = rk;
                previMedium = sv.medium;
                previrk = rk;
            }
            rk++;
        }
        
        Collections.sort(res, (Student sv1, Student sv2) -> {
            return sv1.code.compareTo(sv2.code);
        });
        
        for(Student sv : res) {
            System.out.println(sv);
        }
    }
}
/*
3
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
*/

