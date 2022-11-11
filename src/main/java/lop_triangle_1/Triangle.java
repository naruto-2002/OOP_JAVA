/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_triangle_1;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author Nguyen Cong Van
 */
public class Triangle {
    private float c1, c2, c3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.c1 = p1.distance(p2);
        this.c2 = p1.distance(p3);
        this.c3 = p2.distance(p3);
    }

    public float getC1() {
        return c1;
    }

    public void setC1(float c1) {
        this.c1 = c1;
    }

    public float getC2() {
        return c2;
    }

    public void setC2(float c2) {
        this.c2 = c2;
    }

    public float getC3() {
        return c3;
    }

    public void setC3(float c3) {
        this.c3 = c3;
    }
    
    boolean valid() {
        return c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1;
    }
    
    String getPerimeter() {
        float CV = c1 + c2 + c3;
        return String.format("%.3f", CV);
    }
}
