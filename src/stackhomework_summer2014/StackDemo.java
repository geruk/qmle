/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackhomework_summer2014;

import java.util.*;
public class StackDemo {
    public static void main(String[] args)
    {
        Stack<String> studentName   = new Stack<>(); // Note use of diamond operator. 
        Scanner keyboard = new Scanner(System.in);
        
        
        //1. First the user adds names to the stack using the push method.
        boolean done = false;
        while(!done)
        {System.out.println("\n\nAdd name, or type Q when done.");
            String newName = keyboard.next();
            if(newName.equalsIgnoreCase("Q")) done = true;
            else {studentName.push(newName); print(studentName);}
        } // end of while loop
        
        
        
        System.out.println("\nHere is how the default toString method treats your stack.");
        System.out.println(studentName);
        
        for(String student : studentName)
        System.out.printf("\nThe location of %s in the stack is: %d",  student , studentName.search(student) );

        
        //2. Then the user removes names by popping the stack.
        done = false;
        
        String student;
        while(!done) {
            System.out.println("\n\nType any key to pop the stack, or type Q when done.");
            String newName = keyboard.next();
            if(newName.equalsIgnoreCase("Q")) done = true;
            else {
                
                
                if (  !studentName.empty() ) studentName.pop();
                else { done = true;
                }
                print(studentName);
               // System.out.println("You just popped " + student);
            
            }
        } // end of while loop
    } // end of main method
    
    
    
    
    private static void print(Stack<String> myStack ) {
        int count = 1, sizeOfStack = myStack.size();
        System.out.println("\nYour stack has size: " + sizeOfStack);
        
        for (String myString : myStack) 
        {
            System.out.print(count + ". " + myString);
            if(count!=sizeOfStack) System.out.print( " -> ");
            else System.out.print( " :Last");
            count++;
        } // end of for loop
        
    } // end of method print
    
    
} // end of class