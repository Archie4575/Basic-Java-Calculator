import java.util.Scanner;

class Calculator {
	public static void main (String[] args) {
		boolean cont = false;
		do {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter your first number: ");
			float n1 = reader.nextFloat();
			System.out.println("Enter your second number: ");
			float n2 = reader.nextFloat();
			boolean ta;
			do {
				ta = false;
				System.out.println("What operation would you like to perform? ");
				Scanner operationChooser = new Scanner(System.in);
				String operation = operationChooser.nextLine();
				System.out.println("You chose " + operation + ".");
				operation = operation.toLowerCase();
				if (operation == "add" || operation == "addition" || operation == "+") {
					operation = "addition";
				}
				else if (operation == "subtract" || operation == "minus" || operation == "subtraction" || operation == "-") {
					operation = "subtraction";	
				}
				else if (operation == "multiply" || operation == "multiplication" || operation == "*" || operation == "x") {
					operation = "multiplication";
				}
				else if (operation == "divide" || operation == "division" || operation == "/" || operation == "÷") {
					operation = "division";
				}
				else if (operation == "modulus" || operation == "%") {
					operation = "modulus";
				}
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
					default : System.out.println("You did not enter a valid operation. Please try again. ");
					ta = true;
				}
			} while ( ta == true );
			boolean reaskCont;
			do {
				reaskCont = false;
				System.out.println("Would you like to perform another calculation? ");
				Scanner continuationRequest = new Scanner(System.in);
				String continuationConsent = continuationRequest.nextLine();
				continuationConsent = continuationConsent.toLowerCase();
				switch (continuationConsent) {
					case "yes" :
					cont = true; break;
					case "no" :
					System.exit(0); break;
					default :
					System.out.println("That answer is invalid.");
					reaskCont = true;
					cont = false; break;
				}
			} while (reaskCont);
		} while (cont == true);




	}
}