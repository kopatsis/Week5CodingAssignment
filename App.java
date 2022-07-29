import java.util.Scanner;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String hello = "Hello";
		
		System.out.println("Test of AsteriskLogger and SpacedLogger with short string: ");
		presentAsterisk(hello);
		presentSpaced(hello);
		
		String longer = "This is a significantly longer String than hello";
		
		System.out.println("Test of AsteriskLogger and SpacedLogger with short string: ");
		presentAsterisk(longer);
		presentSpaced(longer);
		
		
		
		System.out.println("Now it's your turn:");
		
		int decision = 0;
		printOptions();
		decision = scanner.nextInt();
		if (decision == 1) {
			System.out.println("Enter String without spaces to use: ");
			String userStr = scanner.next();
			presentAsterisk(userStr);
		} else if (decision == 2) {
			System.out.println("Enter String without spaces to use: ");
			String userStr = scanner.next();
			presentSpaced(userStr);
		} else if (decision == 3) {
			System.out.println("Enter String without spaces to use: ");
			String userStr = scanner.next();
			presentAsterisk(userStr);
			presentSpaced(userStr);
		} else {
			System.out.println("Option not recognized, please restart program and choose valid option");
		}
		//Note that this is not a loop as this portion isn't required by the instructions but I wanted to add it
		//If I have time I will change this to be a loop similar to the menu app
		//Additionally as scanner.nextLine() was causing problems with the if statements, it's just .next()
		//I will also add the ability to use strings with spaces if I have time
		
	}
	
	private static void printOptions() {
		System.out.println("1) Use AsteriskLogger with a new String");
		System.out.println("2) Use SpacedLogger with a new String");
		System.out.println("3) Use both with a new String");

	}
	
	public static void presentSpaced(String Str) {
		SpacedLogger space = new SpacedLogger(Str);
		space.Log();
		space.Error();
		System.out.println(" ");
	}
	
	public static void presentAsterisk(String Str) {
		AsteriskLogger aster = new AsteriskLogger(Str);
		aster.Log();
		aster.Error();
		System.out.println(" ");
	}

}
