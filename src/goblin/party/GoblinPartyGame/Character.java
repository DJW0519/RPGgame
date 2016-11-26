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
	private final int DEFAULT_HEALTH_LEVEL = 100;
	private final int MIN_SKILL_LEVEL = 1;
    	private String name;
    	private int healthLevel;
    	private int skillLevel;
//    private Weapon currentWeapon;

    	public Character(String name){
		this.healthLevel = DEFAULT_HEALTH_LEVEL;
		this.name = name;
		this.skillLevel = MIN_SKILL_LEVEL;
	
   	}

    public void characterDie(){
    }
    
    public void attack(Character opponent){
    }
    
    public void setHealthLevel(int newHealthLevel){

    }
    
    public void getHealthLevel(){



    }
}
