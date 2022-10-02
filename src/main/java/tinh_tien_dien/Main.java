/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tien_dien;

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
        ArrayList<Custom> res = new ArrayList<>();
        while(t-- > 0) {
            Custom kh = new Custom();
            kh.input(sc);
            res.add(kh);
        }
        Collections.sort(res, (Custom kh1, Custom kh2) -> {
            if(kh1.getTotal() < kh2.getTotal()) return 1;
            return -1;
        });
        for(Custom kh : res) {
            System.out.println(kh);
        }
    }
}

/*
3
KD
400
555
NN
58
400
CN
150
700
*/
