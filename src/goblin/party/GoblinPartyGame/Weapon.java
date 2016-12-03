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
    private String weaponName;
    private String weaponType;
    private int weaponPower;
    private int levelRequirement;
    private int[] weaponPicture;

    //setters
    public void setWeaponType(String type){
        weaponType = type;
    }
    public void setWeaponName(String name){
        weaponName = name;
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
    public String getWeaponName(){
        return weaponName;
    }
    public int getWeaponPower(){
        return weaponPower;
    }
    public int[] getweaponPicture(){
        return weaponPicture;
    }

}
