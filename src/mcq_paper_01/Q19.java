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
class Red {

    public static void main(String args[]) {
        String a = "A";
        String b = "B";
        System.out.print((("A" + "B") == "AB") + ",");
        System.out.print(("A" + "B") == (a + b));
    }
}


/*
Explanation
String Concatenation and Interning:

In Java, string literals and their concatenation at compile time are interned. This means they are stored in a common pool and shared.
When using the + operator with string literals, the result is computed at compile time, and the interned result is used.
Compile-Time Concatenation:

The expression "A" + "B" is a compile-time constant expression and results in the string "AB". This string is interned, meaning it is the same as the literal "AB".
Run-Time Concatenation:

The expression a + b where a and b are variables results in a new string object created at runtime.
Even though the content of the strings is the same ("AB"), the object reference is different from the interned "AB".
Detailed Execution Steps
First Print Statement:

("A" + "B") == "AB"
The left side ("A" + "B") is a compile-time constant and results in the interned string "AB".
The comparison ("A" + "B") == "AB" compares two interned strings, so it evaluates to true.
Second Print Statement:

("A" + "B") == (a + b)
The left side ("A" + "B") is a compile-time constant and results in the interned string "AB".
The right side (a + b) is a run-time expression and results in a new string object that is not interned.
The comparison ("A" + "B") == (a + b) compares an interned string with a non-interned string, so it evaluates to false.
Final Output
The output of the code will be:


true,false

Key Points
String literals and their compile-time concatenations are interned, resulting in shared instances.
Run-time string concatenations create new string objects, which are not automatically interned.
The == operator compares object references, not the content of the strings.
*/