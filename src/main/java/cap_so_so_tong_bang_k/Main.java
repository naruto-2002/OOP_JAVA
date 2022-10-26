/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap_so_so_tong_bang_k;

import java.util.HashMap;
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
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n + 5];
            HashMap<Integer, Integer> mp = new HashMap<>();
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(!mp.containsKey(arr[i])) mp.put(arr[i], 0);
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            long res = 0;
            for(int i = 0; i < n; i++) {
                if(mp.get(k - arr[i]) != null) {
                    res += mp.get(k - arr[i]);
                    if(k == 2*arr[i]) res -= 1;
                }
            }
            System.out.println(res/2);
        }
    }
}
