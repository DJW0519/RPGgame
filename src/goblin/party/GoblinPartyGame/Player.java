/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;
import java.util.Scanner;

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
  Scanner keyboard = new Scanner(System.in);
  private final int MIN_SKILL_LEVEL = 1;
  private ArrayList<Goblin> party;
  private int goblinKills;
	private Bag playerBag;
  private int skillLevel;
  private int basePower;
  private Weapon currentWeapon;
  private int goblinSpawn = 0;

	public Player(String name){
		super(name);
		this.goblinKills = 0;
		this.playerBag = new Bag();
    this.setBasePower(5);
    party = new ArrayList<Goblin>();
    this.skillLevel = MIN_SKILL_LEVEL;
    this.currentWeapon = new Weapon(0, "Fists", 0);
	}

		
	// Returns 0 if Add was successful, 1 if not
    	public int pickUpItem(Item newItem){
		return playerBag.addItem(newItem);
    	}

    public void addGoblin(Goblin goblinToAdd){
      String answer;
      if(getPartySize() <= 7){
         party.add(goblinToAdd);
         System.out.println("A " + goblinToAdd.name + " has been added to your party");
       }
      else {
        System.out.println("Your Goblin party is full! \n Would you like to edit your party?");
        answer = keyboard.nextLine();
        if(answer.equals("y")) this.editParty(goblinToAdd);
      }  
      
    }
    public void setGoblinSpawn(int spawn){
      goblinSpawn = spawn;
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
      public void editParty(Goblin newGoblin){
        int answer;
        for(int i = 0; i < party.size(); i++){
          System.out.println(i + ": " + party.get(i).name + "-> " + party.get(i).getColor());
        }
        System.out.println("What goblin would you like to replace your new golblin with?");
        answer = keyboard.nextInt();
        party.remove(answer);
        party.get(answer).setName("John");
        party.add(newGoblin);
        for(int i = 0; i < party.size(); i++){
          System.out.println(i + ": " + party.get(i).name + "-> " + party.get(i).getColor());
        }
      }
      public void checkWeapon(){
        System.out.println("Your current weapon is: " + currentWeapon.getItemName());
        System.out.println("Weapon Size: " + currentWeapon.getSize());
        System.out.println("Weapon Damage: " + currentWeapon.getWeaponPower());
        System.out.println("Level Requirement: " + currentWeapon.checkLevelRequired());
      }
      public void setSkillLevel(int newSkillLevel){
        skillLevel = newSkillLevel;
      }
      public void setBasePower(int newPower){
        basePower = newPower;
      }
      public int getBasePower(){
        return basePower;
      }
      public int getSkillLevel(){
        return skillLevel;
      }
    
      public String getWeaponName(){
        return currentWeapon.getItemName();
      }
    
      public int getWeaponPower(){
        return currentWeapon.getWeaponPower();
      }
    
      public void switchWeapon(Weapon nextWeapon){
        currentWeapon = nextWeapon;
      } 
      public int getGoblinSpawn(){
        return goblinSpawn;
      }
}

