/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stractured_Que_05_paper03;

/**
 *
 * @author isharaLakshitha
 */
public class DivisibilityCheck {

    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Numbers divisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Numbers divisible by both 3 and 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}


