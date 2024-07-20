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
    class Game {
    int health = 100;

    void shot() {
        health = health - 10;
    }

    void aid() {
        health = health + 10;
    }

    public static void main(String[] args) {
        Game g = new Game();
        g.aid();
        g.shot();
        System.out.println(g.health);
        g.shot();
        g.shot();
        System.out.println(g.health);
    }
}

