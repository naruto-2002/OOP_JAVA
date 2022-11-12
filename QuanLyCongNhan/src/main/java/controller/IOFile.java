/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Cong Van
 */
public class IOFile {
    public static <T> List<T> read(String fname) {
        List<T> list = null;
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
            list = (ArrayList<T>) o.readObject();
            o.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static <T> void write(List<T> arr, String fname) {
            try {
                ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
                o.writeObject(arr);
                o.close();
            } catch (IOException e) {
                System.out.println(e);
            }
    }
}
