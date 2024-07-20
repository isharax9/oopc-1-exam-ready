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
class BioData {

    String name;
    int Age;

    void setName(String SetName) {
        name = null;
        System.out.println(name);
        setAge1(40);
    }

    void setAge1(int Age2) {
        this.Age = Age2;
        System.out.println(Age);
    }

    public static void main(String[] args) {
        BioData bd = new BioData();
        bd.setName("ABC");
    }
}
