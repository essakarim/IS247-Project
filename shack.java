public class shack {

	public void description() { //Room descriptor
		
		System.out.println("\nAs you walk through the clearing you arrive at a damp, worn down shack with it's roof partially caved in. \nThe path leading to it is nothing but dirt with weeds blocking the path. You force open the door as dust \nfloods from the opening. Inside the building lay a few objects of interest. (Type 1-5 for what to interact \nwith): \n1) Cobwebs \n2) The Crushed Roof \n3) Tool Rack \n4) Wooden Planks \n5) Mouse Hole \n6)*EXIT BACK TO BEACH*\n");
	
		}
	
	public void choice1() { //1st option
		
		System.out.println("Cobwebs line the room like a blanket. This is only a home for spiders now. Unfortunately, there was nothing \nuseful for the raft.");
		
		}
	
	public void choice2() { //2nd option
		
		System.out.println("The dilapidated roof shines a ray of sunlight into this room. Without this hole in the ceiling, it would be \nsignificantly darker. Unfortunately, there was nothing useful for the raft.");
		
		}
	
	public void choice3() { //3rd option
		
		System.out.println("You see a set of wooden tools lining the left wall. Most of the tools are dryrotted beyond belief. You start \nto lose hope when your eyes lock onto an unused roll of duct tape! \n*Duct Tape added to inventory*");
		
		}
	
	public void choice4() { //4th option
		
		System.out.println("You find a pile of old wooden boards! In your excitement you start to collect as many as your arms can carry \nbut start to notice that they are falling apart in your hands. They are dry rotted beyond saving. Unfortunately, \nthere was nothing useful for the raft.");
		
		}
	
	public void choice5() { //5th option
		
		System.out.println("There is a tiny hole in the corner of the room. Frightened eyes stare back at you in a meanacing way. It's \nprobably best to not go over to that side of the room. Unfortunatey, there was nothing useful for the raft.");
		
		}
	
	public void choice6() { //5th option
		
		System.out.println("You make your way back to the beach.");
		
		}
	
}
