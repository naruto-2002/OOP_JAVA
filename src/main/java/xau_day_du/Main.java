/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_day_du;

import java.util.Arrays;
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
            String s = sc.next();
            int k = sc.nextInt();
            int[] arr = new int[125];
            Arrays.fill(arr, 0);
            for(int i = 0; i < s.length(); i++) {
                int a = s.charAt(i);
                arr[a] = 1;
            }
            int cnt1 = 0, cnt2 = 0;
            for(int i = 97; i <= 122; i++) {
                if(arr[i] == 0) cnt1++;
                else cnt2++;
            }
            int l = s.length();
            if(l - cnt2 >= k && cnt1 <= k) System.out.println("YES");
            else System.out.println("NO");
            
        }
        
    }
}
//97 vs 122
