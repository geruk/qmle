/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackhomework_summer2014;

import java.util.Stack;


public class RocketTimer {
    
    
public static void main(String args[]) {
// Create a new, empty stack
Stack<Integer> rocketTimer = new Stack<>(); // Note use of the diamond operator. 
// Let's add some items to it
for (int i = 1; i <= 10; i++)
    {
        rocketTimer.push ( new Integer(i) ); // Wrap the primitive type int as Integers. 
    }


// Last in first out means reverse order
System.out.println ( "\n\nMajor Tom, you are cleared for takeOff!");
System.out.println ( "Commencing countdown, engines on!");
System.out.println ( "Check ignition and may gods love be with you.\n\n");

// In the homework, you will try various while loop controls. 
// Try size(), isEmpty(), contains() and search(). 

//while ( !rocketTimer.empty() )
while ( rocketTimer.size() > 0)
{
System.out.print ( rocketTimer.pop() );
System.out.print ( ',' );
} // end of while block


// Empty, launch the rocket.
System.out.println (" Blastoff!");
System.out.println ("\n\nHere am I sitting in my tin can far above the Moon");
System.out.println ("Planet Earth is blue and there's nothing I can do");
System.out.println ("\nCan you hear me, major Tom?\nCan you...\n");
} // end of main
} // end of class
