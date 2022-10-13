/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        
        res.add(1);
        res.add(3);
        res.add(2);
        res.add(0);
        
        Collections.sort(res);
        
        for(Integer i: res) {
            System.out.println(i);
        }
      
       
    }

}
