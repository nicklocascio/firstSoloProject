package firstSoloProject;
import java.util.Scanner;


public class display
	{

		public static void main(String[] args)
			{
				Choice();
				visualDisplay();
				
				
			}

		
		public static void visualDisplay(){
			
			System.out.println("________________");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("________________");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("________________");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("|    "+"|    "+"|    "+"|");
			System.out.println("________________");
			
		}
		
		public static void Choice(){
			System.out.println("Would you like to be X's or O's? " );
			Scanner userXorOinput = new Scanner(System.in);
			String userXorO = userXorOinput.nextLine();
			System.out.println("You have chosen " + userXorO);
			
			String userChoice = new String();
			String computerGiven = new String();
			
			if(userXorO.equals("X")){
				userChoice = "X";
				computerGiven = "Y";
			}else{
				userChoice = "Y";
				computerGiven = "X";
			}
			
			
			
		}
		
	}
	