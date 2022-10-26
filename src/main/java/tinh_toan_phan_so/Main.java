/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_toan_phan_so;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static long gcd(long a, long b) {
        while(a*b != 0) {
            if(a > b) {
                a %= b;
            }else {
                b %= a;
            }
        }
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            PhanSo A = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo B = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo AB = new PhanSo(B.getMau()*A.getTu() + A.getMau()*B.getTu(), A.getMau()*B.getMau());
            PhanSo C = new PhanSo(AB.getTu()*AB.getTu(), AB.getMau()*AB.getMau());
            PhanSo D = new PhanSo(A.getTu()*B.getTu()*C.getTu(), A.getMau()*B.getMau()*C.getMau());
            
            long tu1 = C.getTu(), mau1 = C.getMau();
            C.setTu(C.getTu()/gcd(tu1, mau1));
            C.setMau(C.getMau()/gcd(tu1, mau1));
            
            long tu2 = D.getTu(), mau2 = D.getMau();
            D.setTu(D.getTu()/gcd(tu2, mau2));
            D.setMau(D.getMau()/gcd(tu2, mau2));
            

            System.out.println(C + " " + D);
        }
        
    }
}
