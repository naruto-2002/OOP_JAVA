/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuyen_dung;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static double getSo(String s) {
        return Double.parseDouble(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Staff> lnv = new ArrayList<>();
        double t = getSo(sc.nextLine());
        while(t-- > 0) {
            lnv.add(new Staff(sc.nextLine(), getSo(sc.nextLine()), getSo(sc.nextLine())));
        }
        sort(lnv);
        for(Staff nv: lnv) {
            System.out.println(nv);
        }
    }
}
/*
3
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
*/