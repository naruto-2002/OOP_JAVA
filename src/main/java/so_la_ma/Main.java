/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_la_ma;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        
        int t = sc.nextInt();
        while(t-- > 0) {
            String[] ArrLama = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
            int[] ArrNumber = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
            String s = sc.next();
            int res = 0;
            for(int i=0;i<ArrLama.length;i++){
                while(s.startsWith(ArrLama[i])){
                    res += ArrNumber[i];
                    s = s.substring(ArrLama[i].length());
                    if("".equals(s)) break;
                }
            }
            System.out.println(res);
        }
        
        
    }
}
