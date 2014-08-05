/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackhomework_summer2014;

import java.util.*;
public class StackCalculator {
    
    
public static void main(String[] args) {
    
Stack<String> expression = new Stack<>(); // Note use of diamond operator
Scanner keyboard = new Scanner(System.in);

//1. First the user adds numbers and operators to create an expression
boolean done = false;
while(!done)
{ System.out.println("\n\nEnter an expression. Type = when done.");
String newTerm = keyboard.next();
if(newTerm.equalsIgnoreCase("=")) done = true;
else {expression.push(newTerm); }
} // end of while loop
print(expression);
//2. Print out the result.
System.out.println("\nYour expression = " + evaluate(expression) );
} // end of main method



private static void print(Stack<String> myStack ) {
int count = 1, sizeOfStack = myStack.size();
System.out.print("\nYour expression stack is: ");
for (String myString : myStack)
{System.out.print(myString + " ");
} // end of for loop
System.out.println("\n\n");
} // end of method print




private static double evaluate(Stack<String> myStack ) {
double result = 0;
int sizeOfStack = myStack.size();
String nextTerm = myStack.pop();
if(sizeOfStack==1) return Double.parseDouble(nextTerm);
if( nextTerm.equals("+") )
{nextTerm = myStack.pop(); result = Double.parseDouble(nextTerm) +
evaluate(myStack);}
if( nextTerm.equals("-") )
{nextTerm = myStack.pop(); result = -Double.parseDouble(nextTerm) +
evaluate(myStack);}
//3. Add more operators here.
return result;
} // end of method evaluate



} // end of class