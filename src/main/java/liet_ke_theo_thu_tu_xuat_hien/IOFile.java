/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liet_ke_theo_thu_tu_xuat_hien;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Cong Van
 */
public class IOFile {
    public static <T> ArrayList<T> read(String fname) throws IOException, ClassNotFoundException {
        ArrayList<T> arr = new ArrayList<>();
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
        arr = (ArrayList<T>) o.readObject();
        o.close();
        return arr;
    }
}
