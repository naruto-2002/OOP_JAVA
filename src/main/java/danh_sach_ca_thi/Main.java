/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_ca_thi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = sc.nextInt();
        ArrayList<Student> res = new ArrayList<>();
        while(t-- > 0) res.add(new Student(sc));
//        Collections.sort(list, new Comparator<Subjects>(){
//            @Override
//            public int compare(Subjects o1, Subjects o2) {
//                if(o1.getDate().equals(o2.getDate())){
//                    if(o1.getHour() == o2.getHour())
//                        return o1.getMinute() - o2.getMinute();
//                    return o1.getHour() - o2.getHour();
//                }else{
//                    if(o1.getYear() == o2.getYear()){
//                        if(o1.getMonth() == o2.getMonth())
//                            return o1.getDay() - o2.getDay();
//                        return o1.getMonth() - o2.getMonth();
//                    }else
//                        return o1.getYear() - o2.getYear();
//                }
//            }
//        });
        Collections.sort(res, (Student o1, Student o2) -> {
//            if(o1.date.compareTo(o2.date) == 0 && o1.hour.compareTo(o2.hour) == 0) {
//                return o1.getCode() - o2.getCode();
//            }
            if(o1.date.compareTo(o2.date) == 0) {
                if(o1.getHour() == o2.getHour()) 
                   return o1.getMinute() - o2.getMinute();
                return o1.getHour() - o2.getHour();
            }else {
                if(o1.getYear() == o2.getYear()) {
                    if(o1.getMonth() == o2.getMonth())
                        return o1.getDay() - o2.getDay();
                    return o1.getMonth() - o2.getMonth();
                }else 
                    return o1.getYear() - o2.getYear();
            }
            
        
        });
        for(Student hs: res) {
            System.out.println(hs);
        }
    }
}
