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

import java.util.*;

/**
 *
 * @author
 */


public class Player extends Character {
        private ArrayList<Goblin> party;
    	private int goblinKills;
	private Bag playerBag;

	public Player(String name){
		super(name);
		this.goblinKills = 0;
		this.playerBag = new Bag();
                this.setBasePower(5);
                party = new ArrayList<Goblin>();
	}

		
	// Returns 0 if Add was successful, 1 if not
    	public int pickUpItem(Item newItem){
		return playerBag.addItem(newItem);
    	}

    public void addGoblin(Goblin goblinToAdd){
      party.add(goblinToAdd);
      playerBag.viewBag();
    }


      public int payGoblin(int numCoins, String color){
		return playerBag.removeCoins(numCoins, color);
	}
    
      public void takePotion(Potion potion){
        int currentHealth = getHealthLevel();
        int addedHealth = potion.getPotionValue();
        setHealthLevel(currentHealth + addedHealth);
        playerBag.removeItem(potion);
      }

      public void levelUp(){
          int level = this.getSkillLevel();
          int health = this.getBaseHealth();
          int power = this.getBasePower();
          int bag = playerBag.getBagCapacity();
          System.out.println("You leveled up!");
          System.out.println("Level: " + level + " + 1");
          int newLevel = level + 1;
          setSkillLevel(newLevel);
          System.out.println("Base Health: " + health + " + 5");
          int newHealth = health + 5;
          setBaseHealth(newHealth);
          setHealthLevel(newHealth);
          System.out.println("Base Power: " + power + " + 2");
          int newPower = power + 2;
          setBasePower(newPower);
          System.out.println("Bag Capacity: " + bag + " + 5");
          int newBag = bag + 5;
          int increase = playerBag.increaseCapacity(newBag);
          if(increase == 0)
              System.out.println("Bag capacity cannot increase!");
      }
      
      public int getPartySize()
      {
          return party.size();
      }
      public Bag getPlayerBag(){
          return playerBag;
      }
}

