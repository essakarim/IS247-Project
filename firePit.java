import java.util.Random;
public class firePit {
		
	//Creates a variable for a random number for later use
	int randomNumber;
	Random rand = new Random();

	public void description() { //Room descriptor
			
		System.out.println("You stumble across an abandoned fire pit. Charcoal dust sits in the middle of the fire circle. The is no \nevidence from what you can tell that suggest this has been used recently. You hear a gentle breeze on \nthe air carrying the sea air. For a moment you almost feel at piece before you remember the accident. In \nfront of you lays an assorment of items. (Type 1-5 for what to interact with) \n1) A Pile of Stones \n2) A Step Ladder \n3) An Axe \n4) A Cup of Water\n5) A Pile of Wood \n6)*EXIT BACK TO BEACH*\n");
		
		}
		
	public void choice1() { //1st option
			
		System.out.println("The is a rock pile next to the pit. The stones look to be the same ones that the outer rim is made of. I guess \nsomeone was planning on making more for some reason?\n");
			
		}
		
	public void choice2() { //2nd option
			
		System.out.println("Here lies a metal step ladder. It could be useful for collecting coconuts, unfortunately its just ever so \nslightly too short to do the job. Unfortunatey, there was nothing useful for the raft./n");
		
		}
		
	public void choice3() { //3rd option
			
		System.out.println("There is an axe lodged into a stump nearby. This axe would be incredibly useful if it wasn't stuck. I guess \nyou were not the chosen one to remove it from the stump. How unfortunate. Unfortunatey, there was nothing useful for the raft.\n");	
			
			
		}
		
		
	public void choice4() { //4th option
			
		System.out.println("You see a cup of water. Their is sludge and gunk lining the rim of the glass. I really hope you don't plan \non drinking that. Unfortunatey, there was nothing useful for the raft\n");
		
		}
		
	public void choice5() { //5th option
			
		System.out.println("You see a pile of wood on a rack next to the fire pit. Amongst the other logs and twigs are sturdy \nwooden boards! This would make for a decent ship haul! Before you're able to fully celebrate you \nare caught in a daze as you see the firepit ignite. The fire continues to grow and grow until you can \nsee what look to be large eyes and a jagged mouth emerge from it. \"Who dares take my most precious meal!\", \nit proclaims. It looks down at you with the wooden boards in your hands. \"Why have you taken my most precious \nmeal? I have been saving that for a rainy day.\", it's voice booms. You try to explain your situation. The \ncreature ponders for a moment before coming to a decision. \"If you can answer my trivia question I will part \nwith some of my meal\". The fire creature ponders for but a moment before hitting you with this burning hot question,");
		
		randomNumber = rand.nextInt(5) + 1; //Chooses a number 1-5
		
		if (randomNumber == 1) { //If RNG chooses 1
				
			System.out.println("Who is the mascot to recently replace Smokey the bear?: \n1) Salley the Bear \n2) Yogi Bear \n3) Scortching Squid \n4) Ember the Fox \n");
			
			} else if (randomNumber == 2) { //If RNG chooses 2 
					
				System.out.println("Which of these is not flameable?: \n1) Wood \n2) Dry Leaves \n3) Cloth \n4) Water \n");
				
				} else if (randomNumber == 3) { //If RNG chooses 3
						
					System.out.println("How many times a year should you change your smoke alarm battery?: \n1) 7 Times \n2) 1 Time \n3) 5 Times \n4) 2 Times\n");
					
					} else if (randomNumber == 4) { //If RNG chooses 4
							
						System.out.println("Which is not a real type of fire extinguishers?: \n1) Type A \n2) Type C n\3) Type K \n4) Type Z \n");
						
						} else if (randomNumber == 5) { //If RNG chooses 5
								
							System.out.println("What is not part of the fire triangle?: \n1) Heat \n2) Oxygen \n3) Fuel \n4) Embers \n");
							
							}
			
		
		}
		
	public void choice6() { //6th option
			
		System.out.println("You make your way back to the beach.\n");
			
		}
		
}
