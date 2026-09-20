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
		firePit firePit1 = new firePit();
		boat boat1 = new boat();
		Player player1 = new Player(false, false, false); //Values for whether we have duct tape, wooden boards, and a blanket
		
		
		//Backstory
		System.out.println("You woke up last week to find you won yourself a free cruise trip, and for once it wasn't a scam! You packed \nyour bags hopingfor a weekend of relaxation. The firt few nights of this cruise were a blast, but on the third \nnight a sudden and wicked stormed knocked you off the deck and into the sea. Tossing and turning oyu found yourself \nlosing consciousness. You awake alone, stranded on a desert island... lucky you. All hope is not lost however as \nthere stand a few structures that might just give you some hope of makinga raft to leave this forsaken place...\n");
		
		
		do { //Main game loop
			
			
			playerChoice = 0; //Resets the variable
			playerInput = "z";
			
			System.out.print("From the beach a few areas of note come to mind, a shack, a fire pit, and a boat. Where would you like to \ngo? (Enter 'shack', 'firepit', or 'boat'): ");
			playerInput = input.next();
		
			
			if (playerInput.equals("shack") == true) { //If the player wants to go to the shack
				
				do {
					
					shack1.description(); //Describes the scene of the shack
					playerChoice = input.nextInt(); //Players interact choice
				
				
					if (playerChoice == 1) { //1st option
					
						shack1.choice1();
					
						} else if (playerChoice == 2) { //2nd option
						
							shack1.choice2();
						
							} else if (playerChoice == 3) { //3rd option
							
								playerChoice = 0; //Resets the variable
								
								shack1.choice3();
								
								do {
								
									playerChoice = input.nextInt(); //Player input for the multiple choice section
									
									if (playerChoice == 1) { //If the player is correct
										
										System.out.println("Well I'll be, you got it right! I apologize for hostility and hope you enjoy your reward!");
										
										System.out.println("\nYou make your way back to the beach with your new found reward!\n");
										
										player1.ductTape = true;
										
										
										} else { //If the player is wrong
											
											System.out.println("Not quite young grasshopper, but I shall allow for another attempt.");
											
											}
									
									} while (playerChoice != 1);
								
								shackLeave = true; //Allows the loop to break
							
								} else if (playerChoice == 4) { //4th option
								
									shack1.choice4();
								
									} else if (playerChoice == 5) { //5th option
									
										shack1.choice5();
									
										} else if (playerChoice == 6) { //6th option
										
											shack1.choice6();
											
											shackLeave = true; //Allows the loop to break
										
											}
					
					} while (shackLeave == false); //Locks us in a loop until a certain option is picked
				
				shackLeave = false; //Changes the variable back 
				
			
				} else if (playerInput.equals("firepit") == true) { //If the player wants to go to the fire pit
					
					do {
						
						firePit1.description(); //Describes the scene of the fire pit
						playerChoice = input.nextInt(); //Players interact choice
					
					
						if (playerChoice == 1) { //1st option
						
							firePit1.choice1();
						
							} else if (playerChoice == 2) { //2nd option
							
								firePit1.choice2();
							
								} else if (playerChoice == 3) { //3rd option
									
									firePit1.choice3();
									
									
									} else if (playerChoice == 4) { //4th option
									
										firePit1.choice4();
									
										} else if (playerChoice == 5) { //5th option
											
											playerChoice = 0; //Resets the variable
										
											firePit1.choice5();
										
											do {
												
												playerChoice = input.nextInt(); //Player input for the multiple choice section
												
												if (playerChoice == 4) { //If the player is correct
													
													System.out.println("Hmmph, I knew I should have picked a harder question! A deal's a deal, take your scraps and scram!");
													
													System.out.println("\nYou make your way back to the beach with your new found reward!\n");
													
													player1.woodBoard = true; //Changes variable to add the item to our inventory
													
													
													} else { //If the player is wrong
														
														System.out.println("Pitiful, but I shall allow for another attempt, do not disappoint me.");
														
														}
												
												} while (playerChoice != 4);
											
											firePitLeave = true; //Allows the loop to break
										
											} else if (playerChoice == 6) { //6th option
											
												firePit1.choice6();
												
												firePitLeave = true; //Allows the loop to break
											
												}
					
						} while(firePitLeave == false); 
					
					firePitLeave = false; //Reverts the variable back
					
					
					} else if (playerInput.equals("boat") == true) { //If the player wants to go to the boat
						
						do {
							
							boat1.description(); //Describes the scene of the dock
							playerChoice = input.nextInt(); //Players interact choice
						
						
							if (playerChoice == 1) { //1st option
							
								boat1.choice1();
							
								} else if (playerChoice == 2) { //2nd option
								
									playerChoice = 0; //Resets the variable
									
									boat1.choice2();
									
									do {
										
										playerChoice = input.nextInt(); //Player input for the multiple choice section
										
										if (playerChoice == 3) { //If the player is correct
											
											System.out.println("Well ain't that something, you were correct! I guess you can have this one, thankfully I have a spare\". He reaches into the compartment under where he was sleeping, gets another blanket, and rolls back over. \n*You got a tarp!*");
											
											System.out.println("\nYou make your way back to the beach with your new found reward!\n");
											
											player1.blanket = true;
											
											
											} else { //If the player is wrong
												
												System.out.println("I'm sorry, can you repeat that, the waves were rather loud.");
												
												}
										
										} while (playerChoice != 3);
									
									boatLeave = true; //Allows the loop to break
								
									} else if (playerChoice == 3) { //3rd option
									
										boat1.choice3();
										
									
										} else if (playerChoice == 4) { //4th option
										
											boat1.choice4();
										
											} else if (playerChoice == 5) { //5th option
											
												boat1.choice5();
											
												} else if (playerChoice == 6) { //6th option
												
													boat1.choice6();
													
													boatLeave = true; //Allows the loop to break
												
													}
							
							} while (boatLeave == false); //Locks us in a loop until a certain option is picked
						
						boatLeave = false; //Changes the variable back 
						
						}
			
			if ((player1.ductTape == true) && (player1.woodBoard == true) && (player1.blanket == true)) {
				
				do {
					
					System.out.print("With all of your gathered materials you have everything you need to make a raft! (Type 'buildboat' to leave the island!): ");
					playerInput = input.next();
					
					} while (playerInput.equals("buildboat") != true ); //Locks the user in a loop until they build the boat
				
				win = true; //Gives the player the win condition
				}
			
		
			} while (win == false); //Continues till the player is announced a winner
		
		
		System.out.println("\nWith your cobbled together raft you were able to paddle off the island! Thank you for playing!"); //A congratulations to the player for winning

	}

}
