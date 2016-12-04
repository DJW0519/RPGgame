/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;

/**
 *
 * @John Murphy
 */

public class Weapon extends Item{
    
    private String weaponType;
    private int weaponPower;
    private int levelRequirement;

    public Weapon(){
        super(1);
    }
    public Weapon(int size, String name, String type, int power, int levelReq){
      super(size, name);
      weaponType = type;
      weaponPower = power;
      levelRequirement = levelReq;
    }
    public Weapon(int size, String name, int power){
        super(size, name);
        weaponPower = power;
        levelRequirement = 0;
    }


    //setters
    public void setWeaponType(String type){
        weaponType = type;
    }
    public void setWeaponPower(int power){
        weaponPower = power;
    }
    public void setLevelRequirement(int required){
        levelRequirement = required;
    }

    //gettters
    public int checkLevelRequired(){
        return levelRequirement;
    }
    public String getWeaponType(){
        return weaponType;
    }
    public int getWeaponPower(){
        return weaponPower;
    }
}
