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
class Planes {

    String p1 = "TomCat";
    String p2 = "MI17";
    String p3 = "MIG 29";

    public static void main(String[] args) {
        Planes pla = new Planes();
        pla.p1 = pla.p2;
        System.out.println(pla.p1);
        System.out.println(pla.p2);
        System.out.println(pla.p3);
    }
}
