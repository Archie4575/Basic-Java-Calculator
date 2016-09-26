import java.util.Scanner;

class Calculator {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		float n1 = reader.nextFloat();
		System.out.println("Enter your second number: ");
		float n2 = reader.nextFloat();
		System.out.println("What operation would you like to perform? ");
		Scanner operationChooser = new Scanner(System.in);
		String operation = operationChooser.nextLine();
		System.out.println("You chose " + operation + ".");
		operation = operation.toLowerCase();
		switch (operation) {
			case "addition" : float answer1 = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + answer1);
			break;
			case "subtraction" : float answer2 = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + answer2);
			break;
			case "multiplication" : float answer3 = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + answer3);
			break;
			case "division" : float answer4 = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + answer4);
			break;
			case "modulus" : float answer5 = n1 % n2;
			System.out.println(n1 + " % " + n2 + " = " + answer5);
			break;
			default : System.out.println("You did not enter a valid operation."); 
		}

	}
}