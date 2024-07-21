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
class Vehicle1 {

    void engine() {
        System.out.println("Lorry Engine");
    }
}

class Lorry extends Vehicle1 {

    Lorry() {
    }
}

class DemoBatta extends Lorry {

    public static void main(String[] args) {
        DemoBatta DB = new DemoBatta();
        DB.engine();
    }
}
