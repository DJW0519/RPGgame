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
        //static int goblinNameCounter = 1;
        Random randNum = new Random();
        ArrayList<String> colors;
        colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Purple");
        
        int randColor = randNum.nextInt(3);
        int randCharge = randNum.nextInt(5)+1;
        Goblin friendlyGoblin = new Goblin("John", "Good", colors.get(randColor), randCharge);
        
        GoblinCoin blueCoin = new GoblinCoin(5, "Blue");
        GoblinCoin greenCoin = new GoblinCoin(5, "Green");
        GoblinCoin purpleCoin = new GoblinCoin(5, "Purple");
        
       Scanner keyboard = new Scanner(System.in);
	   String answer;
	   
	   System.out.println("You encounter a friendly " + friendlyGoblin.getColor() + " Goblin!");
	   System.out.print("Would you like to hire it for ");
	   System.out.println(friendlyGoblin.getCharge() + " " + friendlyGoblin.getColor() + " coins? (y/n)");
	   answer = keyboard.nextLine();
	   if(answer.equals("y")){
	       if(thePlayer.payGoblin(friendlyGoblin.getCharge(), friendlyGoblin.getColor()) == 0 ){
              thePlayer.addGoblin(friendlyGoblin);
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
    public void goNorth(Player thePlayer){
	Scanner keyboard = new Scanner(System.in);
        String answer;
        Bag playerBag = thePlayer.getPlayerBag();
	System.out.println("You stumble upon a large beefcake of a goblin. "
                + "Around his neck is a collar with a pendant reading 'Darren'. "
                + "He looks like he's ready for a fight. What do you do?:");
        System.out.println("1: Fight him");
        System.out.println("2: Run!");
        answer = keyboard.nextLine();
        if(answer.equals("1")){
            Goblin darren = new Goblin("Darren", "Goblin Body Builder", "Green", 10);
            int playerHealth = thePlayer.getHealthLevel();
            int darrenHealth = darren.getHealthLevel();
            System.out.println("You choose to give the goblin the fight he desires. He squats down and "
            + "flexes his massive, veiny biceps. You ready your weapon.");
            while (playerHealth > 0){
                System.out.println("\nGoblin's Health: " + darrenHealth);
                System.out.println("Your Health: " + playerHealth);
                System.out.println("\nWhat do you do?:" + "\n 1: Attack \n 2: Use Potion \n 3: Switch Weapon \n 4: Run");
                answer = keyboard.nextLine();
                switch (answer){
                    case "1": 
                            System.out.println("You attack Darren with your " + thePlayer.getWeaponName());
                            System.out.println("Base Power: " + thePlayer.getBasePower());
                            System.out.println("Weapon Power: " + thePlayer.getWeaponPower());
                            System.out.println("Party Power: " + thePlayer.getPartySize()* 2 + " (2 power per Goblin)");
                            int playerDamageDone = 
                            thePlayer.getBasePower() + thePlayer.getWeaponPower() + (thePlayer.getPartySize()* 2) ; 
                            System.out.println("You do " + playerDamageDone + " damage");
                            darrenHealth -= playerDamageDone;
                            darren.setHealthLevel(darrenHealth);
                            try {
                            Thread.sleep(2000);                 
                            } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            }
                            System.out.println("\nThe goblin hits you with a massive punch. You lose 10 health \n");
                            playerHealth -= 10;
                            thePlayer.setHealthLevel(playerHealth);
                            try {
                            Thread.sleep(1000);                 
                            } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            }
                            if(darrenHealth <= 0){
                                darrenHealth = 0;
                                System.out.println("\n You triumph over the massive goblin with one last blow. He falls over dead.\n");
                                thePlayer.levelUp();
				thePlayer.increaseGoblinKills();
                            }
                            break;
                            
                    case "2": 
                            System.out.println("You look in your bag for potions.");
                            try {
                            Thread.sleep(2000);                 
                            } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            }
                            ArrayList<Potion> potions = playerBag.getPotion();
                            if (potions.size() == 0){
                                System.out.println("\n No potions in your bag");
                            }
                            else{
                            for (int i = 0; i < potions.size(); i ++){
                                System.out.println((i+1) + ": " + potions.get(i).getItemName());
                            }
                            System.out.println("Choose what potion you want to drink: ");
                            answer = keyboard.nextLine();
                            int result = Integer.parseInt(answer);
                                if ((result - 1) <= potions.size()){
                                    Potion taken = potions.get(result - 1);
                                    thePlayer.takePotion(taken);
                                    System.out.println("You took the Potion, your health is restored");
                                    try {
                                Thread.sleep(2000);                 
                                } catch(InterruptedException ex) {
                                Thread.currentThread().interrupt();
                                }
                                    playerHealth = thePlayer.getHealthLevel();
                                }
                            }
                            break;
                    case "3":
                            System.out.println("Your current weapon is: \n"); 
                            thePlayer.checkWeapon();
                            try {
                            Thread.sleep(2000);                 
                            } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            }
                            ArrayList<Weapon> weapons = playerBag.getWeapon();
                            if (weapons.size() == 0){
                                System.out.println("\nNo suitable weapon found in your inventory");
                            }
                            else {
                                System.out.println("");
                            for (int i = 0; i < weapons.size(); i ++){
                                System.out.println((i+1) + ": " + weapons.get(i).getItemName());
                            }
                            System.out.println("Choose a weapon to use: ");
                            answer = keyboard.nextLine();
                            int newAnswer = Integer.parseInt(answer);
                            if((newAnswer - 1) <= weapons.size()){
                                Weapon switched = weapons.get(newAnswer - 1);
                                thePlayer.switchWeapon(switched);
                            }
                            }
                            break;
                        
                    case "4":
                            System.out.println("\nYou chicken out. His massive, sculpted body is " +
                            "way too much for you to handle. You go back to where you were before.\n");
                            darrenHealth = 0;
                            break;
                            
                    default: 
                            System.out.println("\nYou just sit there and do nothing, staring blankly out into space."
                            + "\nThe goblin waits patiently for a few minutes before it gets bored and punches you HARD.\nYou lose 10 health\n");
                            playerHealth -= 10;
                            thePlayer.setHealthLevel(playerHealth);
                            break;
                }
                if (playerHealth == 0){
                    System.out.println("\nThe goblin's last punch slams into your face one last time."
                            + " His rippling muscles have enough force to pierce through your head.\n");
                    System.out.println("YOU ARE DEAD!!! \n");
                }
                if(darrenHealth == 0)
                    break;
            }
        }
        else if (answer.equals("0")){
            System.out.println("You chicken out. His massive, sculpted body is " +
                    "way too much for you to handle. You go back to where you were before.");
        }
        else{
            System.out.println("You just sit there and do nothing, staring blankly out into space."
                    + "The goblin waits patiently for a few minutes before it gets bored and punches you HARD.");
            System.out.println("His punch is so strong that it knocks you back...in time.");
        }    
	}

    public void goWest(Player thePlayer){
       Scanner keyboard = new Scanner(System.in);
      Random randNum = new Random();
      Weapon axe = new Weapon(15, "Axe", 8, 1);
      Weapon sword = new Weapon(10, "Sword", 5, 1);
      Weapon mace = new Weapon(12, "Mace", 6, 1);
      ArrayList<Item> weapons;
      weapons = new ArrayList<Item>();
      weapons.add(axe);
      weapons.add(sword);
      weapons.add(mace);
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


        public void goSouthWest(Player thePlayer){
        Scanner keyboard = new Scanner(System.in);
        int randNum = (int) Math.random() * (thePlayer.getPartySize());
        Bag bag = thePlayer.getPlayerBag();
        System.out.println("You fell into a pit, not a very good move, idiot.");
        int CurrentHealth = thePlayer.getHealthLevel();
        if (CurrentHealth > 5){
            thePlayer.setHealthLevel(CurrentHealth - 5);
            System.out.println("You have lost 5 health, your health is now " + thePlayer.getHealthLevel());
            if (thePlayer.getPartySize() != 0){
                thePlayer.removePartyMember(0);
                System.out.println("You lost a friendly goblin and all your weapons, you jabroni. You're bad at this.");
            } else {
                System.out.println("You have lost all your weapons, you jabroni. You're bad at this.");
        }
        ArrayList <Weapon> weapons = bag.getWeapon();
        if (weapons.size() != 0){
            weapons.clear();
        }
        System.out.println("Looks like there is nothing else to do here, luckily for you.");
        System.out.println("1: Go back to center.");
        System.out.println("2: Stay here for some ridiculous reason.");
        String answer = keyboard.nextLine();
        if(answer.equals("1")){
            return;
    }    
        } else {
            thePlayer.characterDeath();
            return;
        }
        
}

	public void goEast(Player thePlayer){
		Scanner keyboard = new Scanner(System.in);
		Random randomNum = new Random();
		Random randomNum2 = new Random();
		String color;
		int numColor = randomNum.nextInt(3);
		switch(numColor){
			case 0:
				color = "Blue";
				break;
			case 1:
				color = "Green";
				break;
			case 2:
				color = "Purple";
				break;
			default:
				color = "Blue";
				break;


		}

		int numCoins = randomNum2.nextInt(20);
		GoblinCoin gobCoin = new GoblinCoin(numCoins, color);
		String answer;
		System.out.println("You have found a bundle of " + color + " " + numCoins + " Goblin Coins!");
		System.out.println("Do you want to pick it up? (y/n)");
		answer = keyboard.nextLine();
		
		if(answer.equals("y")){
			if(thePlayer.pickUpItem(gobCoin) == 0){
				System.out.print("You now have " + thePlayer.getNumGoblinCoins(gobCoin.getItemName()));
				System.out.println(" " + gobCoin.getItemName() + " Goblin Coins!");

			}
			else{
				System.out.println("You do not have enough room in your bag!");
				System.out.println("Would you like to delete something from your bag? (y/n)\n");
				answer = keyboard.nextLine();
				if(answer.equals("y")){
					thePlayer.playerInteractiveDiscard();


				}
				
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

}
