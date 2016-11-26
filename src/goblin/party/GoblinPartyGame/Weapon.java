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
public class Weapon extends Item{
	private String weaponName;
    	private String weaponType;
    	private int weaponPower;
    	private int levelRequirement;
    	private int[] weaponPicture;

	public Weapon(int mySize){
		super(mySize);
	}
	    
    	public void setWeaponType(String type){
        	weaponType = type;
        
    	}
    
    	public void setWeaponPower(int power){
        	weaponPower = power;
    	}
    
   	 public void setLevelRequirement(int required){
        	levelRequirement = required;
    	}
    
    	public int checkLevelRequired(){
        	return levelRequirement;    
    	}
}
