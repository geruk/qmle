/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackhomework_summer2014;

/* Simple program to test if two stacks are equal */
import java.util.Stack;
public class StackEqualsDemo
{
    
    
public static void main(String args[])
{
    
    
String[] alphabet = {"A", "B", "C"};
// Now create two stacks holding the same elements.
// We will them confirm they are equal!
Stack<String> stack1 = new Stack<>(); // Note use of diamond operator. 
Stack<String> stack2 = new Stack<>(); // Note use of diamond operator. 


for (String letter: alphabet)
    {stack1.push(letter);
     stack2.push(letter);
    } // end of for loop

System.out.println("The first stack is: " + stack1);
System.out.println("The second stack is: " + stack2);

// Now test if they are equal.
if( stack1.equals(stack2) )
    {System.out.println("Yes, the stacks are equal.");}
else
    {System.out.println("Sorry, something went wrong."); }

} // end of main


} // end of class