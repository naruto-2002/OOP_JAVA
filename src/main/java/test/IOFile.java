/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Nguyen Cong Van
 */
public class IOFile {
    public static <T> List<T> read(String f) {
        List<T> list = null;
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(f));
            list = (List<T>) o.readObject();
            o.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static <T> void write(String f, List<T> list) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f));
            o.writeObject(list);
            o.close();
        } catch (Exception e) {
        }
    }
}
