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
        int randCharge = randNum.nextInt(5);
        Goblin friendlyGoblin = new Goblin("John", "Good", colors.get(randColor), randCharge);
        
        GoblinCoin blueCoin = new GoblinCoin(5, "Blue");
        GoblinCoin greenCoin = new GoblinCoin(5, "Green");
        GoblinCoin purpleCoin = new GoblinCoin(5, "Purple");
        for(int i = 0; i < 5; i++){
            thePlayer.pickUpItem(blueCoin);
            thePlayer.pickUpItem(greenCoin);
            thePlayer.pickUpItem(purpleCoin);
        }
        
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
                + "Around his neck is a collar with a pendant reading 'Billy'. "
                + "He looks like he's ready for a fight. What do you do?:");
        System.out.println("1: Fight him");
        System.out.println("2: Run!");
        answer = keyboard.nextLine();
        if(answer.equals("1")){
            Goblin billy = new Goblin("Billy", "Goblin Body Builder", "Green", 10);
            int playerHealth = thePlayer.getHealthLevel();
            int billyHealth = billy.getHealthLevel();
            System.out.println("You choose to give the goblin the fight he desires. He squats down and "
            + "flexes his massive, veiny biceps. You ready your weapon.");
            while (playerHealth > 0){
                System.out.println("\nGoblin's Health: " + billyHealth);
                System.out.println("Your Health: " + playerHealth);
                System.out.println("\nWhat do you do?:" + "\n 1: Attack \n 2: Use Potion \n 3: Switch Weapon \n 4: Run");
                answer = keyboard.nextLine();
                switch (answer){
                    case "1": 
                            System.out.println("You attack Billy with your " + thePlayer.getWeaponName());
                            System.out.println("Base Power: " + thePlayer.getBasePower());
                            System.out.println("Weapon Power: " + thePlayer.getWeaponPower());
                            System.out.println("Party Power: " + thePlayer.getPartySize()* 2 + " (2 power per Goblin)");
                            int playerDamageDone = 
                            thePlayer.getBasePower() + thePlayer.getWeaponPower() + (thePlayer.getPartySize()* 2) ; 
                            System.out.println("You do " + playerDamageDone + " damage");
                            billyHealth -= playerDamageDone;
                            billy.setHealthLevel(billyHealth);
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
                            if(billyHealth <= 0){
                                billyHealth = 0;
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
                                
                            break;
                    case "3":
                            System.out.println("Your current weapon is\n:"); 
                            thePlayer.checkWeapon();
                            try {
                            Thread.sleep(2000);                 
                            } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            }
                            ArrayList<Weapon> weapons = playerBag.getWeapon();
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
                            break;
                        
                    case "4":
                            System.out.println("\nYou chicken out. His massive, sculpted body is " +
                            "way too much for you to handle. You go back to where you were before.\n");
                            billyHealth = 0;
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
                if(billyHealth == 0)
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
        Random randNum = (math.Random) * (getPartySize);
        Bag bag = player.getPlayerBag;
        System.out.println("You fell into a pit, not a very good move, idiot.");
        int CurrentHealth = thePlayer.getHealthLevel;
        if (CurrentHealth >= 5){
            thePlayer.setHealthLevel = (CurrentHealth - 5);
        } else {
            thePlayer.characterDeath;
        }
        for (int i = 0; i < bag.bagItems.size(); i++)
        {
              bag.removeItem(bag.bagItems.get(i));
        }
        party.remove(randNum);
        System.out.println("You lost a friendly goblin and all your weapons, you jabroni. You're bad at this.");
        System.out.println("Looks like there is nothing else to do here, luckily for you.");
        System.out.println("1: Go back to center.");
        System.out.println("2: Stay here for some ridiculous reason.");
        answer = keyboard.nextLine();
        if(answer.equals("1")){
            return;


    }
}

	public void goEast(Player thePlayer){
		Scanner keyboard = new Scanner(System.in);
		GoblinCoin gobCoin = new GoblinCoin(5, "Blue");
		String answer;
		System.out.println("You have found a Goblin Coin!");
		System.out.println("Do you want to pick it up? (y/n)");
		answer = keyboard.nextLine();
		
		if(answer.equals("y")){
			if(thePlayer.pickUpItem(gobCoin) == 0){
				System.out.print("You now have " + thePlayer.getNumGoblinCoins(gobCoin.getItemName()));
				System.out.println(" " + gobCoin.getItemName() + " Goblin Coins!");

			}
			else{
				System.out.println("You do not have enough room in your bag!");
				System.out.println("Would you like to delete items from your bag to pick it up? (y/n)");
				
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
