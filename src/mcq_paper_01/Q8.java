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
class Gun {

    int bulletCount;
    static Gun g = new Gun();

    public static void main(String[] args) {
        g.bulletCount = 10;
        Gun g2 = new Gun();
        System.out.println(g.bulletCount);
        g2.bulletCount = 20;
        System.out.println(Gun.g.bulletCount);
        
        
//        System.out.println(g2.bulletCount);
//this is will give new g2.bulletCount value
//        System.out.println(Gun.g2.bulletCount);
// this will lead to copiling error
    }
}

/*
Explanation
Class Gun Definition:

The class Gun has an instance variable bulletCount of type int.
There is a static instance of Gun named g, which is initialized when the class is loaded.
This means that g is created and g.bulletCount is initially 0 since it is not explicitly set during initialization.
Main Method:

Line 1: g.bulletCount = 10;
The static instance g's bulletCount is set to 10.
Line 2: Gun g2 = new Gun();
A new instance of Gun named g2 is created. This instance has its own bulletCount, initially set to 0 by default.
Line 3: System.out.println(g.bulletCount);
The value of g.bulletCount is printed. Since g.bulletCount was set to 10, this prints 10.
Line 4: g2.bulletCount = 20;
The instance g2's bulletCount is set to 20. This does not affect the static instance g.
Line 5: System.out.println(Gun.g.bulletCount);
The value of the static instance g's bulletCount is printed again. Since it was previously set to 10 and not changed afterward, this prints 10.
Final Output
The output of the code will be:

Copy code
10
10
Key Points
The static instance g is shared across all instances of the Gun class.
Setting g.bulletCount to 10 and then creating a new instance g2 does not affect the bulletCount of the static instance g.
Changing g2.bulletCount to 20 does not affect g.bulletCount.
The static reference Gun.g.bulletCount always refers to the bulletCount of the static instance g.
*/
