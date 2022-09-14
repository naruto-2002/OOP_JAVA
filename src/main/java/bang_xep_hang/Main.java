/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_xep_hang;

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
            if(sv1.codeAC == sv2.codeAC) {
                if(sv1.submit == sv2.submit) {
                    return sv1.name.compareTo(sv2.name);
                }
                return sv1.submit - sv2.submit;
            }
            return sv2.codeAC - sv1.codeAC;
        });
        for(Student sv : res) {
            System.out.println(sv);
        }
    }
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/
