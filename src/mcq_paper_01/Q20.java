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
class q20 {

    public static void main(String[] args) {
        String s = (4 > 5) ? ("ABC") : ((5 > 6) ? ("DEF") : ("XYZ"));
        System.out.println(s);
    }
}


/*
Explanation
Ternary Operator:

The ternary operator ? : is a shorthand for an if-else statement. It takes three operands:
A condition that evaluates to a boolean.
A value to return if the condition is true.
A value to return if the condition is false.
Evaluation of the Ternary Operator:

The expression (4 > 5) is evaluated first.
Since 4 is not greater than 5, this condition is false.
Because the first condition is false, the expression after the colon : is evaluated:
The expression ((5 > 6) ? ("DEF") : ("XYZ")) is now evaluated.
The inner condition (5 > 6) is evaluated.
Since 5 is not greater than 6, this condition is false.
Because the inner condition is false, the value "XYZ" is returned.
Detailed Execution Steps
First Condition:

(4 > 5) evaluates to false.
The expression after the colon : is evaluated: ((5 > 6) ? ("DEF") : ("XYZ")).
Second Condition:

(5 > 6) evaluates to false.
The value "XYZ" is returned.
Assignment and Output:

The variable s is assigned the value "XYZ".
System.out.println(s); prints the value of s.
Final Output
The output of the code will be:


XYZ

Key Points
The ternary operator is used to choose between two values based on a condition.
The expression is evaluated from left to right, and each condition is checked in sequence.
If a condition is false, the next part of the expression is evaluated until a value is returned.
*/