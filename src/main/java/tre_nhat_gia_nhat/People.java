/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tre_nhat_gia_nhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class People {
    String name;
    Date date;
    
    People() {}
    
    void input(Scanner sc) throws ParseException {
        name = sc.next();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        date = format.parse(sc.next());
        
    }
    
   
    
    @Override
    public String toString() {
        return name;
    }
}
