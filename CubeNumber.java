import java.util.Scanner;

/**
 * @author Arash
 * Write a program that displays the first n cubes. (The number n is entered by the user.)
 * In the example below, the user's input is underlined. 
 * How many cubes? 7
 
 * 1 cubed is 1
 * 2 cubed is 8
 * 3 cubed is 27
 * 4 cubed is 64
 * 5 cubed is 125
 * 6 cubed is 216
 * 7 cubed is 343
 */
public class CubeNumber 
{
	public static void main(String[] args) 
	{
		/** While Loop */
		 
		//variables
		int n;
		int counter = 1;
		
		//create scanner object
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many cubes? ");
		n = keyboard.nextInt();
		
		//calculations
		while(counter <= n)
		{
			System.out.println(counter + " cubed is " + counter*counter*counter); //Math.pow(base#, power#)
			counter++;
		}

		/**For Loop
		
		//create scanner object
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many cubes? ");
		int n = keyboard.nextInt();
		
		for (int counter=1; counter<=n; counter++) 
		{
			System.out.println(counter + " cubed is " + counter*counter*counter); //Math.pow(base#, power#)
		}
		*/
		
		keyboard.close();
	}

}
