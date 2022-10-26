/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sap_xep_ma_tran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Matrix {
    private int n, m, col;
    private int[][] arr = new int[200][200];
    
    public Matrix(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();
        col = sc.nextInt() - 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
    public void slove() {
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            tmp.add(arr[i][col]);
        }
        Collections.sort(tmp);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(j == col) System.out.print(tmp.get(i) + " ");
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
