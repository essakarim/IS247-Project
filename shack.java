import java.util.*;

public class shack {
	
	//Creates a variable for a random number for later use
	int randomNumber;
	Random rand = new Random();

	public void description() { //Room descriptor
		
		System.out.println("\nAs you walk through the clearing you arrive at a damp, worn down shack with it's roof partially caved in. \nThe path leading to it is nothing but dirt with weeds blocking the path. You force open the door as dust \nfloods from the opening. Inside the building lay a few objects of interest. (Type 1-5 for what to interact \nwith): \n1) Cobwebs \n2) The Crushed Roof \n3) Tool Rack \n4) Wooden Planks \n5) Mouse Hole \n6)*EXIT BACK TO BEACH*\n");
	
		}
	
	public void choice1() { //1st option
		
		System.out.println("Cobwebs line the room like a blanket. This is only a home for spiders now. Unfortunately, there was nothing \nuseful for the raft.\n");
		
		}
	
	public void choice2() { //2nd option
		
		System.out.println("The dilapidated roof shines a ray of sunlight into this room. Without this hole in the ceiling, it would be \nsignificantly darker. Unfortunately, there was nothing useful for the raft.\n");
		
		}
	
	public void choice3() { //3rd option
		
		System.out.println("You see a set of wooden tools lining the left wall. Most of the tools are dryrotted beyond belief. You start \nto lose hope when your eyes lock onto an unused roll of duct tape! \n*Duct Tape added to inventory*\n");
		
		System.out.println("As you try to leave the room a large but sophisticated spider blocks the door. \"Did you really think you could \nraid our home without asking first??\", it screams. It takes a deep breath before composing itself. Maybe I was \na bit harsh young one. I may be able to overlook this transgression if you are able to answer a riddle of mine. \nAfterall, everything has a price. Now then, let me think..... AHA I GOT IT! Try this one on for size: \n");
		
		
		
		randomNumber = rand.nextInt(5) + 1; //Chooses a number 1-5
		
		if (randomNumber == 1) { //If RNG chooses 1
			
			System.out.println("What is the Earth's largest ocean?: \n1) The Pacific Ocean\n2) The Alantic Ocean\n3) The Indian Ocean\n4) The Arctic Ocean\n");
			
			} else if (randomNumber == 2) { //If RNG chooses 2 
				
				System.out.println("Roughly what percent of the earth is made up of water?: \n1) 70%\n2) 50%\n3) 10%\n4) 100%\n");
				
				} else if (randomNumber == 3) { //If RNG chooses 3
					
					System.out.println("What is Earth's largest mammal?: \n1) Whale\n2) Bear\n3) Rhino\n4) Spider\n");
					
					} else if (randomNumber == 4) { //If RNG chooses 4
						
						System.out.println("Which of the following is not considered a tropical fruit?: \n1) Pear\n2) Pineapple\n3) Coconut\n4) Guava\n");
						
						} else if (randomNumber == 5) { //If RNG chooses 5
							
							System.out.println("Which of the following is not a salt water fish?: \n1) Catfish\n2) Lionfish\n3) Clownfish\n4) Mahi Mahi");
							
							}
		
	
		}
	
	
	public void choice4() { //4th option
		
		System.out.println("You find a pile of old wooden boards! In your excitement you start to collect as many as your arms can carry \nbut start to notice that they are falling apart in your hands. They are dry rotted beyond saving. Unfortunately, \nthere was nothing useful for the raft.\n");
		
		}
	
	public void choice5() { //5th option
		
		System.out.println("There is a tiny hole in the corner of the room. Frightened eyes stare back at you in a meanacing way. It's \nprobably best to not go over to that side of the room. Unfortunatey, there was nothing useful for the raft.\n");
		
		}
	
	public void choice6() { //6th option
		
		System.out.println("You make your way back to the beach.\n");
		
		}
	
}
