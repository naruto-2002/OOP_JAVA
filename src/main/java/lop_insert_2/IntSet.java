/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_insert_2;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.sort;
import java.util.Collections;


/**
 *
 * @author Nguyen Cong Van
 */
public class IntSet {
    private int[] a = new int[1000];

    public IntSet(int [] a) {
        this.a = a;
    }
    
    IntSet intersection(IntSet b) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(Integer i: b.a) 
            arr1.add(i);
        sort(a);
        for(int i = 0; i < a.length; i++) {
           if(arr1.contains(a[i]) && !arr2.contains(a[i]))
               arr2.add(a[i]);
        }
        int[] res = new int[arr2.size()];
        for(int i = 0; i < arr2.size(); i++)
            res[i] = arr2.get(i);
        return new IntSet(res);
    }
    
    public String toString() {
        String s = "";
        for(Integer i: a)
            s += i + " ";
        return s;
    }
    
    
}
