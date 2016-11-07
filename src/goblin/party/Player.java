/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblin.party;

/**
 *
 * @author kristen
 */


public class Player extends Character {
    private String outfitColor;
    private String hairColor;
    private int[] goblinParty;
    private int[] goblinKills;

    //Constructor here

    public void addGoblin(Goblin goblinToAdd){
      //TODO
    }

    public boolean canAfford(){
        //TODO
    }


    //Polymorphism
    public void pickUpCoin(Coin foundCoin){
       //TODO
    }

    public void pickUpWeapon(Weapon foundWeapon){
        //TODO
    }

    public void pickUpPotion(Potion foundPotion){
        //TODO
    }

    public void giveCoinToGoblin(Goblin receivingGoblin){
        //TODO

    }

    public void switchWeapon(Weapon nextWeapon){
        //TODO
    }

    //polymorphism &&&&&&
    public void dropWeapon(){
        //TODO
    }

    public void dropPotion(){
        //TODO
    }

    public void takePotion(){
        //TODO
    }

    public void goblinKill(){
        //TODO
    }

    public void levelUp(){
        //TODO
    }

    public void collideWith(Environment e){
        //TODO
    }


}
