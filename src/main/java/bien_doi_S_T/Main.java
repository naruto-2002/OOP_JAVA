/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bien_doi_S_T;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Nguyen Cong Van
 */
public class Main {
    private static class Data{
        private int value, step;

        public Data() {
        }

        public Data(int value, int step) {
            this.value = value;
            this.step = step;
        }
    }
    private static int cbBD(int a, int b) {
        Queue<Data> q = new LinkedList<>();
        q.add(new Data(a, 0));
        boolean[] vs = new boolean[1000001];
        vs[a] = true;
        while(!q.isEmpty()) {
            Data tmp = q.poll();
            if(tmp.value == b) return tmp.step;
            if(vs[tmp.value - 1] == false && tmp.value - 1 > 0) {
                vs[tmp.value - 1] = true;
                q.add(new Data(tmp.value - 1, tmp.step + 1));
            }
            if(vs[tmp.value*2] == false && tmp.value < b) {
                vs[tmp.value*2] = true;
                q.add(new Data(tmp.value*2, tmp.step + 1));
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            System.out.println(cbBD(sc.nextInt(), sc.nextInt()));
        }
    }
}
