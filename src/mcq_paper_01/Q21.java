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
class Aeroplane {

    public static void main(String[] args) {
        int Engine = 5;
        if (++Engine > 5 || ++Engine > 6) {
            Engine++;
        }
        System.out.println(Engine);
    }
}
