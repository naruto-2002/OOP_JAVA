/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_pair;

/**
 *
 * @author Nguyen Cong Van
 */
public class Pair<T1, T2> {
   private T1 first;
   private T2 second;

    public Pair() {
    }

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
   
    public boolean isPrime(Integer n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime() {
        return isPrime((Integer) this.first) && isPrime((Integer) this.second);
    }
    
   @Override
    public String toString() {
        String s = first + " " + second;
        return s;
    }
}
