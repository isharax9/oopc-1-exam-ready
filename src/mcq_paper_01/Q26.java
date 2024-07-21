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
public class Q26 {

    public static void main(String[] args) {
        try {
            int i = 10 / 0;
        } catch (ArithmeticException s) {
            System.out.println("this is ok");
        } catch (Exception e) {
            System.out.println("ArithmeticException");
        }
    }
}
