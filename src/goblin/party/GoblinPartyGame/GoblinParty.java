/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;

/**
 *
 * @author Kristen Hanslik, Robert Kendl, John Murphy, Darren White
 */
public class GoblinParty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //user input
      Scanner keyboard = New Scanner(System.in);

    	System.out.println("Starting the Goblin Party Game...");

    	//Testing out functions and classes
    	Player testPlayer = new Player("outfitColor", "HColor","Name");
    	GoblinCoin testGoblinCoin = new GoblinCoin(20);
      Weapon axe = new Weapon(2, "Axe", 5, 1);
      if (testPlayer.pickUpItem(axe) == 0) {
        System.out.println("Weapon added");

      }
    	if(testPlayer.pickUpItem(testGoblinCoin) == 0){
    		System.out.println("Add was successful");
    	}
    	else{
    		System.out.println("Add was UNsuccessful");
    	}
    }

}
