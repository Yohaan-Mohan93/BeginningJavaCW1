/* Name: Yohaan Mohan
 * Student Number: 160291137
 */

import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String name = "";
                
                
                /*
                 *The behaviour of the program changes drastically when the scanner.nextLine()
                 * is uncommented. The uncommenting causes the program to crash. The behaviour
                 * with the line commented is that the program will print out to the console the number and 
                 * name which you enter. The behaviour without the comment will make the program crash because
                 * the method nextLine() returns a value and without a variable to hold the data, it will crash.
                 */
		System.out.print("Enter a number> ");
		num = scanner.nextInt();
//		scanner.nextLine();
                
		System.out.println("You entered '" + num + "'. " + num + "x2 = " + num*2);

		System.out.print("What's your name? ");
		name = scanner.nextLine();

		System.out.println("Hello " + name + "! Your name starts with the letter " + name.charAt(0) + ".");

		scanner.close();
	}
}
