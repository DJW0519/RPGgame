/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Kristen Hanslik, Robert Kendl, John Murphy, Darren White
 */
public class GameHandler {

    /**
     * @param args the command line arguments
     */


    public void goSouth(Player thePlayer){
      Scanner keyboard = new Scanner(System.in);
	String answer;
	Goblin friendlyGoblin = new Goblin("Robby", "Good", "Blue", 5);
	System.out.println("You encounter a friendly " + friendlyGoblin.getColor() + " Goblin!");
	System.out.print("Would you like to hire it for ");
	System.out.println(friendlyGoblin.getCharge() + " " + friendlyGoblin.getColor() + " coins? (y/n)");
	answer = keyboard.nextLine();
	if(answer.equals("y")){
		if(thePlayer.payGoblin(friendlyGoblin.getCharge(), friendlyGoblin.getColor()) == 0){
			System.out.println("Success! The Goblin has been added to your party!");
		}
		else{
			System.out.println("You do not have enough " + friendlyGoblin.getColor() + " coins!");
		}
	}
	while(true){
		System.out.println("Looks like there is nothing else to do here.");
		System.out.println("1: Go back to center");
		System.out.println("2: Stay here");
		answer = keyboard.nextLine();
		if(answer.equals("1")){
			return;
		}
	}
	

    }

    public void goWest(Player thePlayer){

      Scanner keyboard = new Scanner(System.in);
      Random randNum = new Random();
      Weapon axe = new Weapon(15, "Axe", 8, 1);
      Weapon sword = new Weapon(10, "Sword", 5, 1);
      Weapon mase = new Weapon(12, "Mase", 6, 1);
      ArrayList<Item> weapons;
      weapons = new ArrayList<Item>();
      weapons.add(axe);
      weapons.add(sword);
      weapons.add(mase);
      int currentWeapon;
	    String answer;
	    int randomInt = randNum.nextInt(3);
	    System.out.println("You look down and see a " + weapons.get(randomInt).name + " just below the surface. Do you grab it?");
	    answer = keyboard.nextLine();

	    if(answer.equals("y")){
	      if(thePlayer.pickUpItem(weapons.get(randomInt)) == 0){
		System.out.println("You are now holding the " + weapons.get(randomInt).name);
		currentWeapon = randomInt;
	      }
	      else System.out.println("You do not have space for this weapon");
	    }

	while(true){
		System.out.println("Looks like there is nothing else to do here.");
		System.out.println("1: Go back to center");
		System.out.println("2: Stay here");
		answer = keyboard.nextLine();
		if(answer.equals("1")){
			return;
		}
    	}
	
    }
}
