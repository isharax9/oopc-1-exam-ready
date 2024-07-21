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
class P {

    static void printS1() {
        System.out.print("P.printS1 ");
    }

    void printS2() {
        System.out.print("P.printS2 ");
    }

    void printS1S2() {
        printS1();
        printS2();
    }
}

class Q extends P {

    static void printS1() {
        System.out.print("Q.printS1 ");
    }

    void printS2() {
        System.out.print("Q.printS2 ");
    }

    public static void main(String[] args) {
        new Q().printS1S2();
    }
}

/*
Explanation
Class P Definition:

The class P has a static method printS1 which prints "P.printS1 ".
It has an instance method printS2 which prints "P.printS2 ".
It has another instance method printS1S2 which calls printS1() and printS2().
Class Q Definition:

The class Q extends P.
It overrides the static method printS1 to print "Q.printS1 ".
It overrides the instance method printS2 to print "Q.printS2 ".
Main Method:

The main method is the entry point of the program.
It creates a new instance of Q and calls the printS1S2 method on it.
Detailed Execution Steps
Instance Creation and Method Call:

new Q().printS1S2();
An instance of Q is created, and the printS1S2 method is called on this instance.
Calling printS1S2:

Inside the printS1S2 method of P, the printS1 method is called.
Since printS1 is a static method, it calls P.printS1() (not Q.printS1()), printing "P.printS1 ".
Calling printS2:

Next, the printS2 method is called.
Since printS2 is an instance method, it calls the overridden method in Q, printing "Q.printS2 ".

Final Output
The output of the code will be:

P.printS1 Q.printS2 

Key Points
Static methods are not polymorphic. They are resolved at compile time based on the reference type. In this case, printS1 from class P is called.
Instance methods are polymorphic. They are resolved at runtime based on the actual object type. Here, printS2 from class Q is called.
The printS1S2 method of class P calls the static printS1 method from class P and the overridden instance printS2 method from class Q.
*/