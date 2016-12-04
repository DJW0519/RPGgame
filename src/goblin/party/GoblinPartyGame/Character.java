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
	private final int DEFAULT_HEALTH_LEVEL = 50;
	private final int MIN_SKILL_LEVEL = 1;
    	protected String name;
        private int baseHealth;
    	private int healthLevel;
    	private int skillLevel;
        private int basePower;
        private Weapon currentWeapon;

    	public Character(String name){
		this.healthLevel = DEFAULT_HEALTH_LEVEL;
                this.baseHealth = DEFAULT_HEALTH_LEVEL;
		this.name = name;
		this.skillLevel = MIN_SKILL_LEVEL;
                this.currentWeapon = new Weapon(0, "Fists", 0);
	
   	}

    public void characterDie(){
    
    }
    
    public void attack(Character opponent){
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
    public void setBaseHealth(int newBaseHealth){
        baseHealth = newBaseHealth;
    }
    public void setBasePower(int newPower){
        basePower = newPower;
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
}
