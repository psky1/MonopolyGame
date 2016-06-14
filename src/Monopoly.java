import java.util.Random;

public class Monopoly
 {
    public static void main( String[] args )
    {
        
        Random rnd = new Random();
        
        
/*	        for (int i = 1; i <= 1; ++i)
	        {
	          int dieNumber1 = 1 + rnd.nextInt(6);
	          System.out.println("Your first die was : " + dieNumber1);
	        }
	        for (int i = 1; i <= 1; ++i)
	        {
	          int dieNumber2 = 1 + rnd.nextInt(6);
	          System.out.println("Your second die was : " + dieNumber2);
*/	        
	int numDoubles; 
	numDoubles = 0;
    int dieNumber1 = 1 + rnd.nextInt(6);
    int dieNumber2 = 1 + rnd.nextInt(6);
    System.out.println("Your first die was : " + dieNumber1);
    System.out.println("Your second die was : " + dieNumber2);
    
    while (dieNumber1 == dieNumber2){
    	numDoubles = numDoubles+1;
    	if (numDoubles == 3)
	        	    System.out.println("GO TO JAIL");
    	else {
        dieNumber1 = 1 + rnd.nextInt(6);
        dieNumber2 = 1 + rnd.nextInt(6);
        System.out.println("Your first die was : " + dieNumber1);
        System.out.println("Your second die was : " + dieNumber2);
    	}
        System.out.println("You are DONE");

    }
        
    
 }
 }
/*Create a program that will randomly select two numbers from 1-6 
(like rolling two dice). Show the dice rolls and end the program
UNLESS the program rolls doubles. If the program rolls doubles, 
then it should roll again, show the new roll and stop UNLESS the 
program rolls doubles again and so on. But on the third time you roll 
doubles, you don't get to roll again, on the third time you roll doubles, 
you go to jail!

The program should print the sum of the rolls and indicate if the user 
should stop or roll again or go to Jail. See the example output below.

User rolls  2  &  6
Move 8 Spaces and stop

User rolls  3  &  3
DOUBLES!
Move 6 Spaces and roll again getting...
User rolls 1 & 2
Move 3 Spaces and stop

User rolls  2  &  2
DOUBLES!
Move 4 Spaces and roll again getting...
User rolls 1 & 1
DOUBLES
Move 2 Spaces and roll again getting...
User rolls 6 & 6
DOUBLES
GO TO JAIL --->*/
