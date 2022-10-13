/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_tien_dien_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<Family> res = new ArrayList<>();
        while(t-- > 0) {
            sc.nextLine();
            Family gd = new Family(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
            res.add(gd);
            
        }
        Collections.sort(res, (Family gd1, Family gd2) -> {
            if(gd1.getTotal() < gd2.getTotal()) return 1;
            return -1;
        });
        for(Family gd: res) {
            System.out.println(gd);
        }
    }
}
