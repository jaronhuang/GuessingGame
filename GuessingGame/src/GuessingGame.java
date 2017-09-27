/*
	Jaron Huang
	9/26/17
	Guessing Game
*/
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessingGame 
{
	public static void main(String[] args)
	{
		/* System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you " + s);
		*/
		int answer = (int)(Math.random() * 10 + 1);
		int guess = 0;
		while (guess != answer)
		{
				System.out.println("Guess the number");
				Scanner input = new Scanner(System.in);
				try
				{
					guess = input.nextInt();
					if (guess == answer)
					{
						System.out.println("You guessed the number!");
					}
					else
					{
						System.out.println("That is not the answer.");
					}
				}
				catch (InputMismatchException e) 
				{
					System.out.println("You made an error: " + e);
				}
		}
	}
	//HI. Nice to meet you:D
}
