/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_paper_01;

/**
 *
 * @author isharaLakshitha
 */
class D {

    staticint m1(int i) {
        return i; // 1
    }

    static void m2(int i) {
        return i; // 2
    }

    staticint m3(int i) {
        return; // 3
    }

    public static void main(String[] args) {
        System.out.print("" + m1(1) + m2(2) + m3(3)); //4
    }
}
