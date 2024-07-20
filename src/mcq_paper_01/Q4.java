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
class A {

    void m() {
    }
    int i = 50;

    public static void main(String[] args) {
        A a = new A();
        A a2 = a;
        A a3 = new A();
        a.i = 500;
        a2.i = 300;
        a3.i = 200;
        System.out.println(a.i);
        System.out.println(a2.i);
        System.out.println(a3.i);
    }
}
