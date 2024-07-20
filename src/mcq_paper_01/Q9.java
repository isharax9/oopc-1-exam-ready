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
class AB {

    static int i = 2000;
    int tot = 0;

    public static void main(String[] args) {
        AB ab = new AB();
        if (true) {
            byte b = 20;
            System.out.println(ab.tot);
        }
        ab.tot = i;
        System.out.println(i);
        System.out.println(ab.tot);
    }
}
/*
Explanation

Class AB Definition:

The class AB has a static integer variable i initialized to 2000.
It also has an instance variable tot initialized to 0.

Main Method:

Line 1: AB ab = new AB();
A new instance of the class AB is created and referenced by ab. At this point, ab.tot is 0.
Line 2: if (true) { ... }
This if statement always evaluates to true, so the code block inside it will always execute.
Line 3: byte b = 20;
A local variable b of type byte is declared and initialized to 20. This variable is not used elsewhere in the code.
Line 4: System.out.println(ab.tot);
The current value of ab.tot is printed. Since ab.tot was initialized to 0 and has not been changed yet, this prints 0.
Line 5: ab.tot = i;
The instance variable ab.tot is set to the value of the static variable i, which is 2000.
Line 6: System.out.println(i);
The static variable i is printed, which is 2000.
Line 7: System.out.println(ab.tot);
The current value of ab.tot is printed again. Since ab.tot was set to 2000, this prints 2000.
Final Output
The output of the code will be:

0
2000
2000

Key Points:
The static variable i is shared across all instances of the AB class and is initialized to 2000.
The instance variable tot is specific to each instance of the class.
The value of tot is initially 0 and is printed before it is changed.
After setting tot to the value of i (which is 2000), both i and tot are printed as 2000.
*/