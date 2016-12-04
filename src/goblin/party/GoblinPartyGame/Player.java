/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;

/**
 *
 * @author kristen
 */

public class Player extends Character {
	private String outfitColor;
	private String hairColor;
//    private Goblin[] goblinParty;
    	private int goblinKills;
	private Bag playerBag;

	public Player(String outfitColor, String hairColor, String name){
		super(name);
		this.outfitColor = outfitColor;
		this.hairColor = hairColor;
		this.goblinKills = 0;
		this.playerBag = new Bag();
	}

		
	// Returns 0 if Add was successful, 1 if not
    	public int pickUpItem(Item newItem){
		return playerBag.addItem(newItem);
    	}

   // public void addGoblin(Goblin goblinToAdd){
      //TODO
    //}

	public int payGoblin(int numCoins, String color){
		return playerBag.removeCoins(numCoins, color);
    

	}


   // public void switchWeapon(Weapon nextWeapon){
        //TODO
   // }

      public void takePotion(Potion potion){
        int currentHealth = this.getHealthLevel();
        int addedHealth = potion.getPotionValue();
        this.setHealthLevel(currentHealth + addedHealth);
        playerBag.removeItem(potion);
      }

      public void levelUp(){
        	//TODO
      }
}
