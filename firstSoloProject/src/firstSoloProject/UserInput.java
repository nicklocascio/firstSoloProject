package firstSoloProject;
import java.util.Scanner;
@SuppressWarnings("resource")

public class UserInput
	{

//		display.boardO;
		static boolean Win = false;
		
		
		public static void locationChoice(){
			
				
				System.out.println("Where would you like to go?");
				Scanner locationInput = new Scanner(System.in);
				String location = locationInput.nextLine();
				
				if(location.equals("A1") && location != Display.computerGiven){
					Display.boardO[0][0] = Display.userChoice;			

					Display.visualDisplay();
					
				}else if(location.equals("A2"))
					Display.boardO[1][0] = Display.userChoice;
					Display.visualDisplay();
				}
				
				
			
			
			
		}
		
