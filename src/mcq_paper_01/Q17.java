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
class A {

    void m1() {
        public int a; // 1
        protected int b; // 2
        private int c; // 3
        static int d; // 4
        transient int e; // 5
        volatile int f; // 6
        final int g = 1; // 7
    }
}


/*
Explanation
In Java, certain modifiers are only allowed in specific contexts. Let's go through each line:

public int a; // Line 1

public is an access modifier that cannot be used for local variables inside a method. This causes a compilation error.
protected int b; // Line 2

protected is also an access modifier that cannot be used for local variables inside a method. This causes a compilation error.
private int c; // Line 3

private is another access modifier that cannot be used for local variables inside a method. This causes a compilation error.
static int d; // Line 4

static cannot be used with local variables. It is used to define class-level variables or methods, not variables inside a method. This causes a compilation error.
transient int e; // Line 5

transient is a modifier used with instance variables to indicate that they should not be serialized. It cannot be used with local variables. This causes a compilation error.
volatile int f; // Line 6

volatile is a modifier used with instance variables to indicate that a variable's value will be modified by different threads. It cannot be used with local variables. This causes a compilation error.
final int g = 1; // Line 7

final can be used with local variables. It indicates that the variable's value cannot be changed once initialized. This line is valid and does not cause a compilation error.
Compilation Errors Identified
Line 1: public int a;
Line 2: protected int b;
Line 3: private int c;
Line 4: static int d;
Line 5: transient int e;
Line 6: volatile int f;
Key Points
Access modifiers (public, protected, private) cannot be used with local variables inside methods.
The static modifier cannot be used with local variables inside methods.
The transient and volatile modifiers cannot be used with local variables inside methods.
The final modifier can be used with local variables inside methods.
*/