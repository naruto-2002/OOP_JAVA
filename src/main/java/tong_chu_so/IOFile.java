/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_chu_so;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Cong Van
 */
public class IOFile {
    public static<T> ArrayList<T> read(String fname) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<T> arr = new ArrayList<>();
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
        arr = (ArrayList<T>)o.readObject();
        o.close();
        return arr;
    }
    
    public static<T> void write(String fname, ArrayList<T> arr) throws FileNotFoundException, IOException {
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
        o.writeObject(arr);
        o.close();
    }
}
