/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_intset;

import java.util.TreeSet;

/**
 *
 * @author Nguyen Cong Van
 */
public class IntSet {
    private int[] arr;

    public IntSet() {
    }

    public IntSet(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    IntSet union(IntSet s) {
        TreeSet<Integer> ans = new TreeSet<>();
        for(int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        for(int i = 0; i < s.arr.length; i++) {
            ans.add(s.arr[i]);
        }
        int[] res = new int[ans.size()];
        int cnt = 0;
        for(Integer x: ans) {
            res[cnt++] = x;
        }
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < arr.length; i++) {
            s = s + arr[i] + " ";
        }
        return s;
    }
    
    
}
