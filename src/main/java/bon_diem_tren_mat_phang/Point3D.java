/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bon_diem_tren_mat_phang;

/**
 *
 * @author Nguyen Cong Van
 */
public class Point3D {
    private int x, y, z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        Point3D p12 = new Point3D(p1.getX() - p2.getX(), p1.getY() - p2.getY(), p1.getZ() - p2.getZ());
        Point3D p13 = new Point3D(p1.getX() - p3.getX(), p1.getY() - p3.getY(), p1.getZ() - p3.getZ());
        Point3D p14 = new Point3D(p1.getX() - p4.getX(), p1.getY() - p4.getY(), p1.getZ() - p4.getZ());
        
        Point3D p = new Point3D(p12.getY()*p13.getZ() - p13.getY()*p12.getZ(),
                p12.getZ()*p13.getX() - p13.getZ()*p12.getX(),
                p12.getX()*p13.getY() - p13.getX()*p12.getY());
        int res = p.getX()*p14.getX() + p.getY()*p14.getY() + p.getZ()*p14.getZ();
        return res == 0;
    }
    
    
    
    
    
}
