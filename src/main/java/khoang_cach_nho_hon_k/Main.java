/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khoang_cach_nho_hon_k;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.sort;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static int lowerBound(int arr[],int key) {
        int index = Arrays.binarySearch(arr, key);
        if(index < 0) return Math.abs(index) - 2;
        else {
            while(index > 0) {
                if(arr[index] == key) index--;
                else return index;
            }
            return index;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            sort(arr);
            long res = 0;
            for(int i = 0; i < n - 1; i++) {
                res += lowerBound(arr, arr[i] + k) - i;
            }
            System.out.println(res);
        }
    }
}
