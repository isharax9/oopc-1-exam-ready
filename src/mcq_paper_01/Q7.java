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
class Q7 {

    static double Temprage = 36.9;

    static void setValue() {
        Temprage = 2.0;
        setMarks();
    }

    static void setMarks() {
        Temprage = 3.0;
        System.out.println(Temprage);
    }

    static void setNumber() {
        Temprage = 4.0;
        System.out.println(Temprage);
    }

    public static void main(String[] args) {
        String name = "ABC";
        setMarks();
        setNumber();
        setValue();
    }
}

/*
Explanation
Class A Definition:

The class A has a static double variable Temprage initialized to 36.9.
It has three static methods:
setValue() sets Temprage to 2.0 and calls setMarks().
setMarks() sets Temprage to 3.0 and prints Temprage.
setNumber() sets Temprage to 4.0 and prints Temprage.
Main Method:

Line 1: String name = "ABC";
A local variable name is declared and initialized to "ABC". This variable is not used in the rest of the code.
Line 2: setMarks();
The setMarks() method is called. It sets Temprage to 3.0 and prints 3.0.
Line 3: setNumber();
The setNumber() method is called. It sets Temprage to 4.0 and prints 4.0.
Line 4: setValue();
The setValue() method is called. It sets Temprage to 2.0 and then calls setMarks().
Inside setMarks(), Temprage is set to 3.0 and 3.0 is printed.
Final Output
The sequence of method calls results in the following printed output:

Copy code
3.0
4.0
3.0
Summary
The first call to setMarks() prints 3.0.
The call to setNumber() prints 4.0.
The call to setValue() first sets Temprage to 2.0, then calls setMarks(), which sets Temprage to 3.0 and prints 3.0.
*/