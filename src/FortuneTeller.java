import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("What is your birth month?");
		int month = input.nextInt();
		input.nextLine();
		
		System.out.println("What is your favorite ROYGBIV color? If you don't know what ROYGBIV is type help.");
		String color = input.nextLine();
		if (color.equalsIgnoreCase("help")){
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
		color = input.nextLine();	
		
		
		}
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		
			
		
		
		
		
		
				
		
		
		
		
		
		
		

		
				
	}

}
