/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_thuan_nghich_trong_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Cong Van
 */
public class IOFile {
    public static <T> List<T> read(String fname) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<T> list = new ArrayList<>();
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
        list = (List<T>) o.readObject();
        o.close();
        return list;
    }
    
    public static <T> void write(String fname, List<T> arr) throws FileNotFoundException, IOException {
        ObjectOutput o = new ObjectOutputStream(new FileOutputStream(fname));
        o.writeObject(arr);
        o.close();
    }
}
