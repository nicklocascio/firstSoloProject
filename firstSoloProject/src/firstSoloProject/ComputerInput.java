package firstSoloProject;

import java.util.Random;

public class ComputerInput
	{

		
		
		public static void play(){
			int rRow = new Random().nextInt(3) + 0;
			int rCol = new Random().nextInt(3) + 0;

			
			if(Display.boardO[rRow][rCol].equals(" ")){
				Display.boardO[rRow][rCol] = Display.computerGiven;
				Display.visualDisplay();
			}else 
				play();		
		}
	}


	
