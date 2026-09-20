import java.util.Random;

public class boat {

	//Creates a variable for a random number for later use
	int randomNumber;
	Random rand = new Random();

	public void description() { //Room descriptor
		
		System.out.println("\nAs you make your way around the island you come across a dock, and what's more is that dock has a small boat \non it! You rush to the drivers seat and turn the key but no luck, the battery is dead. You grumble to yourself \nbut what can you do when your luck is all dried up. The boat does have some supplies on it though that you make \nnote of. (Type 1-5 for what to interact with) \n1) Canned food\n2) A Blanket\n3) A Gas Can\n4) A Silver Locket \n5) A Plastic Water Bottle \n6)*EXIT BACK TO BEACH*\n");
			
		}
	
	public void choice1() { //1st option
		
		System.out.println("You look in a storage compartment and find an assortment of different canned foods. You have a sudden realization \nthat with this much food you should be set for at least a few weeks! You reach down to grab a can and it's empty.... \nthey're all empty.... rats. Unfortunatey, there was nothing useful for the raft.");
		
		}
	
	public void choice2() { //2nd option
		
		System.out.println("You see a blanket resting on a cushioned bench. After staring at the material for a little while you realize that this blanket is more akin to a tarp. This would make an excellent sail! You reach down to grab it but realize there's a man wrapped up in it!?! He wakes up from his unbelieveably deep nap. \"Huh... who's there\" he says while wiping the sleep from his eyes. \"Why are you trying to take another mans blanket, not cool man\". You try to explain your situation and after a few minutes he seems to calm down. \"So you're trying to make a boat huh? Well why didn't you just say so\", he proclaims. \"How about this, if you can answer my trivia question I'll just give you mine, sound fair\"? With no other options you agree to his terms.");
		
		randomNumber = rand.nextInt(5) + 1; //Chooses a number 1-5
		
		if (randomNumber == 1) { //If RNG chooses 1
			
			System.out.println("What was the famous ship that crashed into an iceberg?: \n1) The Lavender Lass \n2) The Patriot \n3) The Titanic \n4) The Blue Whale\n");
			
			} else if (randomNumber == 2) { //If RNG chooses 2 
				
				System.out.println("What do sailors call the right side of their ship instead of right?: \n1) Port \n2) The Right Side \n3) Starboard \n4) Skipper\n");
				
				} else if (randomNumber == 3) { //If RNG chooses 3
					
					System.out.println("Who played captain Jack Sparrow in the Pirates of the Carribean series?: \n1) Keira Knightley \n2) Geoffrey Rush\n3) Johnny Depp\n4) Orlando Bloom");
					
					} else if (randomNumber == 4) { //If RNG chooses 4
						
						System.out.println("What are the theives of the high seas called?: \n1) Bandits \n2) Stealers \n3) Pirates \n4) Robbers");
						
						} else if (randomNumber == 5) { //If RNG chooses 5
							
							System.out.println("What was a common illness tied to people who sailed the seas regularly?: \n1) The Flu \n2 Pollen Allergies \n3) Scurvy \n4) The Bubonic Plague");
							
							}
		
		}
	
	public void choice3() { //3rd option
		
		System.out.println("This would have been great.... if the ship worked. The can had about a cup of gasoline in it, so probably not actually. \nUnfortunatey, there was nothing useful for the raft.");
	
		}
	
	
	public void choice4() { //4th option
		
		System.out.println("You see a silver locket sitting next to the captain's seat. When you open it up you see a picture of a golden \nretriever. On the back of the picture it reads, \"gone but not forgotten, my best first mate, we miss you Skipper\"");
		
		}
	
	public void choice5() { //5th option
		
		System.out.println("It's a water bottle.... I don't know what you want me to add. Unfortunatey, there was nothing useful for the raft.");
		
		}
	
	public void choice6() { //6th option
		
		System.out.println("You make your way back to the beach.\n");
		
		}
	
}


