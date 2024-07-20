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
class Obj {
    Object ObjReturning() {
        System.out.println("Obj");
        return new Obj();
    }

    public static void main(String[] args) {
        System.out.println(obj.ObjReturning());
        Obj obj = new Obj();
    }
}
