/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;

/**
 *
 * @author
 */
public abstract class Character{
	private final int DEFAULT_HEALTH_LEVEL = 35;
    	protected String name;
        private int baseHealth;
    	private int healthLevel;
    	

    	public Character(String name){
		  this.healthLevel = DEFAULT_HEALTH_LEVEL;
          this.baseHealth = DEFAULT_HEALTH_LEVEL;
		  this.name = name;
   	}

    public void attack(Character opponent){
    }
    public void setBaseHealth(int newBaseHealth){
        baseHealth = newBaseHealth;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setHealthLevel(int newHealthLevel){
        if (newHealthLevel > baseHealth)
            healthLevel = baseHealth;
        else
            healthLevel = newHealthLevel;
    }
    public int getHealthLevel(){
        return healthLevel;
    }
    
    public int getBaseHealth(){
        return baseHealth;
    }
    
}
