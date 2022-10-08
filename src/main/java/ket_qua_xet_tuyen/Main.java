/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ket_qua_xet_tuyen;

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
        ArrayList<Person> res = new ArrayList<>();
        while(t-- > 0) {
            Person ng = new Person();
            ng.input(sc);
            res.add(ng);
        }
        Collections.sort(res, (Person ng1, Person ng2) -> {
            if(ng1.medium < ng2.medium) return 1;
            else if(ng1.medium == ng2.medium) {
                if(ng1.code.compareTo(ng2.code) > 0) return 1;
            }
            return -1;
        });
        for(Person ng: res) {
            System.out.println(ng);
        }
    }
}

/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
*/
