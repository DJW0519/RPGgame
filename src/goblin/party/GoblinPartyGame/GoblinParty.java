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
	System.out.println("Starting the Goblin Party Game...");
	
	//Testing out functions and classes
	Player testPlayer = new Player("outfitColor", "HColor","Name");
	GoblinCoin testGoblinCoin = new GoblinCoin(20);
	if(testPlayer.pickUpItem(testGoblinCoin) == 0){
		System.out.println("Add was successful");
	}
	else{
		System.out.println("Add was UNsuccessful");
	}
    }
    
}
