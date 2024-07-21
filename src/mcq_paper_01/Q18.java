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
class Bike {

    final int speedlimit  = 90;

    void run() {
        speedlimit = 400; //compilation errror here
        System.out.println(speedlimit);
    }

    public static void main(String args[]) {
        Bike obj = new Bike();
        obj.run();
    }
}
