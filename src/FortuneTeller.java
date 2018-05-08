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
		
		int retirement;
		if (age %2 == 0) {
		 retirement = 24;
			
		}else {
		 retirement = 27; 
			
		}
		
		
		String location;
		if (siblings == 0) {
			location = "Punta Cuna, Domican Republic";
			
		}else if (siblings == 1) {
			location = "New Orleans, LA";
			
		}else if (siblings == 2) {
			location = "San Diego, CA";
		}else if (siblings == 3) {
			location = "Chicago, IL";
		}else if (siblings >3) {
			location = "Kellly's Island";
		}else {
			location = "Moscow, Russia";
		}
		
		
		
		String transportation;
		if (color.equalsIgnoreCase("red")){
		  transportation = "BMW";
		}
		else if (color.equalsIgnoreCase("orange")){
		   transportation = "helicopter";
		}else if (color.equalsIgnoreCase("yellow")) {
			transportation = "motorcycle";
		}else if (color.equalsIgnoreCase("green")){
			transportation = "skate board";
		}else if (color.equalsIgnoreCase("blue")){	
			transportation = "bike";
		}else if (color.equalsIgnoreCase("indigo")){
			transportation = "Uber";
		}else if (color.equalsIgnoreCase("violet")){
			transportation = "bus";
			}else {
				transportation = "walking";
			}
		
		
		
		
		   
		   String balance;
		   if (month >= 1 && month <=4){
		   balance = "$20,199.78";
		   }
		   else if (month >= 5 && month <=8){
		   balance = "$12,218.75";
		   }
		   else if (month >= 9 && month <=12){
			   balance = "$3,519,217.30";
		   }else{
			   balance = "0";
			   
		   }
		   
		  System.out.println("Hello " + firstName + " " + lastName + ". You will retire in " + retirement +  " years with "  + balance + " in the bank, with a vacation home in " + location + ", and travel by " + transportation + "." ); 
		  
		
			
		
	
		
		
		
		
		
		

		
				
	}

}
