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
class Nato {

    public static void main(String args[]) {
        char c = 'b';
        switch (c) {
            case 'a':
                System.out.print("1");
            case 'b':
                System.out.print("2");
            case 'c':
                System.out.print("3");
            default:
                System.out.print("4");
        }
    }
}



/*
Explanation
Variable Initialization:

char c = 'b';
The variable c is initialized with the character 'b'.
Switch Statement:

The switch statement checks the value of c and executes the corresponding case block.
In a switch statement, if a case matches and there are no break statements, the execution falls through to subsequent cases until it hits a break or the end of the switch block.
Cases and Fall-through:

case 'b': matches because c is 'b'.
Since there is no break statement, the execution falls through to the next cases and the default block.
Detailed Execution Steps
Switch Statement Execution:
case 'a': does not match because c is 'b'.
case 'b': matches.
System.out.print("2"); prints 2.
Execution falls through to the next case because there is no break statement.
case 'c':
System.out.print("3"); prints 3.
Execution falls through to the next block because there is no break statement.
default:
System.out.print("4"); prints 4.
Final Output
The output of the code will be:


234

Key Points
The switch statement checks the value of the variable c and executes the matching case block.
Without break statements, the execution falls through to subsequent case blocks.
The default block is executed if no other cases match or if there is a fall-through from a previous case.
*/