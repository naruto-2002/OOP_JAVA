/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day_con_lien_tiep_co_tong_bang_k;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            int start = 0, end = 1;
            long sum = arr[0];
            int ok = 0;
            
            while(end <= arr.length) {
                while(sum > k && start < end - 1) {
                    sum -= arr[start];
                    start += 1;
                }
                if(sum == k) {
                    ok = 1;
                    break;
                }
                if(end < arr.length) {
                    sum += arr[end];
                }
                end += 1;
            }
            
           
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
