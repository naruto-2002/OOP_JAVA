/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bang_ke_tien_luong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Staff> res = new ArrayList<>();
        while(t-- > 0) {
             Staff nv = new Staff();
             nv.input(sc);
             res.add(nv);
        }
        long sum = 0;
        for(Staff nv : res) {
            sum += nv.getMoney();
            System.out.println(nv);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
*/
