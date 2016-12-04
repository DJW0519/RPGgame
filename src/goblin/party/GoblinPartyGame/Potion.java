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

public class Potion extends Item{

  private String potionType;
  private int potionValue;

   public Potion(int value, String type){
      super(2, type);
      potionValue = value;
  }
   public Potion (int value, String type, int itemSize, String itemName){
       super(itemSize, itemName);
       potionValue = value;
       potionType = type;
   }

  //setters
  public void setPotionValue(int val){
    potionValue = val;
  }

  //gettters
  public int getPotionValue(){
    return potionValue;
  }

}
