/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinh_luong;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Department {
    String codeRoom, nameRoom;
    
    Department() {}
    
    void input(Scanner sc) {
        codeRoom = sc.next();
        nameRoom = sc.nextLine();
    }
}
