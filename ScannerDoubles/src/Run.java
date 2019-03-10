import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a string to be read by scanner.nextLine(); on the next line:");
		//any valid string will be accepted here
		//examples: "cat" and "Hello, world!"
		String stringInputFromKeyboard = scanner.nextLine();
		System.out.println("Your input was: " + stringInputFromKeyboard);
		System.out.println("Now let's read a double with scanner.nextDouble(); on the next line:");
		//when using nextDouble(), we cannot guarantee that the input can be interpreted as a double
		//valid examples: -3 and 42.555555
		//invalid examples: "cat" and "33D"
		try {
			double doubleInputFromKeyboard = scanner.nextDouble();
			System.out.println("Your double was: " + doubleInputFromKeyboard);
		}
		catch(Exception exception) {
			System.out.println("Error: Unable to parse a double from your input.");
		}
		scanner.close();
	}
}