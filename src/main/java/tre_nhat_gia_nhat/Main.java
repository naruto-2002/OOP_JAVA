/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tre_nhat_gia_nhat;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<People> res = new ArrayList<>();
        while(t-- > 0) {
            People ng = new People();
            ng.input(sc);
            res.add(ng);
        }
        Collections.sort(res, (People ng1, People ng2) -> {
            if(ng1.date.compareTo(ng2.date) > 0) return  -1;
            return 1;
        });
        System.out.println(res.get(0).name + "\n" + res.get(res.size() - 1).name);
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/