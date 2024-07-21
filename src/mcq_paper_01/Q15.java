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
class C {

    static void m(int i) {
        String s = "ISO-9001";
        System.out.println(s);
    }

    static void m2(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        C c = new C();
        c.m(100);
    }
}


/*
Explanation
Class C Definition:

The class C has two static methods: m and m2.
The m method takes an integer parameter i, assigns the string "ISO-9001" to a local variable s, and prints s.
The m2 method takes an integer parameter i and prints i.
Main Method:

The main method is the entry point of the program.
It creates an instance of the class C named c and calls the m method with the argument 100.
Detailed Execution Steps
Instance Creation and Method Call:

C c = new C();
An instance of the class C named c is created.
c.m(100);
The m method is called on the instance c with the argument 100.
Calling m:

Inside the m method, the local variable s is assigned the value "ISO-9001".
System.out.println(s); prints "ISO-9001".
Final Output
The output of the code will be:

ISO-9001

Key Points
The m method is called with the argument 100, but this argument is not used within the method.
The local variable s is assigned the value "ISO-9001" and is printed.
The method m2 is defined but never called, so it does not affect the output.
*/