/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_triangle_1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Point {
    private float x, y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextFloat(), sc.nextFloat());
    }
    
    float distance(Point p) {
        return (float) Math.sqrt(Math.pow(getX() - p.getX(), 2) + Math.pow(getY() - p.getY(), 2));
    }
}
