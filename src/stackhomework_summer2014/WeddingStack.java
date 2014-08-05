
package stackhomework_summer2014;

/*  Joseph and Mary plan an awesome wedding party. 
 * While Mary is away buying decorations, 
 * Joseph spies a stack of wedding invitations on the table 
 * and is shocked to see the name of a former boyfriend on the top of the stack. 
 * Rifling through the stack he spots a few additional questionable invitees. 
 * Help assure a smooth wedding by helping Joseph remove a few of the guests from the stack. 
 */

import java.util.Stack; 

public class WeddingStack
{
    public static void main(String args[])
    {
        // Mary has many friends she wants to invite to the wedding.
        // Here is an array holding the names of her friends.
        
String[] friendsOfMary = {"Anthony", "Eliot", "A-Rod", "Arnold", "Hugh", "Susan", "Roxie", "Lance", "Adonis"};
        
Stack<String>  weddingInvitation = new Stack<>(); // Note use of diamond operator. 
weddingInvitation.push("Mom");  weddingInvitation.push("Dad"); // Joseph has added just his Mom and Dad.
        
        
// 1. Using an enhanced for loop, add all Mary's friends to her stack of wedding invitations.
// Use the push method. Replace the null statement. 

for (String guest: friendsOfMary) weddingInvitation.push(guest);
        
        
System.out.println("\n\nHere is the stack of wedding invitations: \n\t" + weddingInvitation);
 

//2. Use the size() method to print out the number of people Mary has invited.
        
int numberOfGuests = weddingInvitation.size(); // Replace this stub. 
        
System.out.printf("\nMary has invited %d guests to their wedding.\n", numberOfGuests);
        


// 3. Use the peek() method to find and print out the name on the top of the stack.
// This is Mary's former boyfriend or "old flame". 
        
        String oldFlame = weddingInvitation.peek(); // Replace this stub using the peek method. 
        
        System.out.println("\nMary's old flame is named: " + oldFlame);
 
// Confirm peeking does not alter the stack.
 System.out.println("The stack of wedding invitations is still the same even after peeking: \n\t" + weddingInvitation);
       
        

 //4. Now Joseph will build up a stack of names of people who should NOT attend.
        
Stack<String>  disinvite = new Stack<>(); // Note use of diamond operator.
//a. Anthony, Arnold and Eliot have all been involved in political scandals.
// Add them to the stack of disinvitees using the push() method. 
        disinvite.push("Anthony");    // Disinvite the other two. 
        disinvite.push("Arnold");
        disinvite.push("Eliot");
        
//b. A-Rod and Lance have both been involved in doping scandals.
// Add them to the stack of disinvitees using the add() method,
// which is inherited from the Vector class. 
// Disinvite these guys as well  
        disinvite.add("A-Rod");
        disinvite.add("Lance");
        
//. Print out all names in the stack of people to disinvite from the wedding.
        System.out.println("\nJoseph wants to disinvite the following people: \n\t" + disinvite);
 
        

// 5. Use the removeAll() method to remove all the people in the Stack disinvite
// from the Stack weddingInvitation. 
        

        weddingInvitation.removeAll(disinvite);
        
        
        
        
 System.out.println("The remaining invitees are: \n\t" + weddingInvitation);

        
// 6. Woops - Joseph forget to remove the former boyfriend Adonis.
// Joseph suspects Mary never really got over loosing Adonis. 
// Better remove him now using the remove() method.
// Also toss out Hugh, who is a notorious playboy.
        weddingInvitation.remove("Adonis");
        weddingInvitation.remove("Hugh");
System.out.println("Now, the remaining invitees are just: \n\t" + weddingInvitation);
      

/*  When Mary gets home, she spots the now much smaller stack of wedding invitations.
After confronting the sneaky Joseph, Mary becomes furious and decides to call the wedding off!
Using a while loop, and the pop() method, toss each of the remaining wedding
invitations in the trash until the stack of invitations is empty. 
 
This step done for you!
*/       
        
        while( ! weddingInvitation.empty()  ) {     weddingInvitation.pop();    }
        
System.out.println("There should no longer be any remaining invitees. Indeed: \n\t" + weddingInvitation);
System.out.println("\nSee you later Joseph. I'm going back to Adonis! Looser!");

        
    } // end of main
    
} // end of class