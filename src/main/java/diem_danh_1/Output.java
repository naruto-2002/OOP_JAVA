/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diem_danh_1;

/**
 *
 * @author Nguyen Cong Van
 */
public class Output {
    String code, name, clas;
    int point;
    
    Output() {}
    
    public String toString() {
        return code + " " + name + " " + clas + " " + (point <= 0? "0 KDDK": point);
    }
}
