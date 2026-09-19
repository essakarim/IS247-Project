import java.util.*;

public class Game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		//Initializing variables
		boolean win = false;
		boolean shackLeave = false;
		boolean firePitLeave = false;
		boolean boatLeave = false;
		String playerInput = "z";
		int playerChoice;
		
		//Creating new objects
		shack shack1 = new shack();
		
		
		//CREATE A BACKSTORY
		
		do { //Main game loop
			
			
			playerChoice = 0; //Resets the variable
			
			System.out.print("From the beach a few areas of note come to mind, a shack, a fire pit, and a boat. Where would you like to \ngo? (Enter 'shack', 'fire pit', or 'boat'): ");
			playerInput = input.nextLine();
		
			
			if (playerInput.equals("shack") == true) { //If the player wants to go to the shack
				
				do {
					
					shack1.description(); //Describes the scene of the shack
					playerChoice = input.nextInt(); //Players interact choice
				
				
					if (playerChoice == 1) { //1st option
					
						shack1.choice1();
					
						} else if (playerChoice == 2) { //2nd option
						
							shack1.choice2();
						
							} else if (playerChoice == 3) { //3rd option
							
								shack1.choice3();
								
								shackLeave = true; //Allows the loop to break
							
								} else if (playerChoice == 4) { //4th option
								
									shack1.choice4();
								
									} else if (playerChoice == 5) { //5th option
									
										shack1.choice5();
									
										} else if (playerChoice == 6) { //6th option
										
											shack1.choice6();
											
											shackLeave = true; //Allows the loop to break
										
											}
					
					} while (shackLeave == false);
				
			
				} else if (playerInput.equals("fire pit") == true) { //If the player wants to go to the fire pit
					
					do {
					
					
					
					
						} while(firePitLeave == false); 
					
					
					} else if (playerInput.equals("boat") == true) { //If the player wants to go to the boat
						
						do {
							
							
							
							
						
							} while(boatLeave == false); 
						
						}
			
			win = true;
		
			} while (win == false); //Continues till the player is announced a winner
		
		
		System.out.println("\nWith your cobbled together raft you were able to paddle off the island! Thank you for playing!");

	}

}
