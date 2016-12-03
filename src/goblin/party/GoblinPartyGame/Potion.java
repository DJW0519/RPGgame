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

  private final int DEFAULT_SIZE = 2;
  private final String DEFAULT_NAME = "Health Potion";
  private String potionType;
  private int potionValue;

   public Potion(int value, String type){
      super(2);
      name = DEFAULT_NAME;
      potionType = type;
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
  public void setPotionType(String type){
    potionType = type;
  }
  public void setPotionPicture( int[] pic){
    potionPicture = pic;
  }

  //gettters
  public int getPotionValue(){
    return potionValue;
  }
  public String getPotionType(){
    return potionType;
  }
  public int[] getPotionPicture(){
    return potionPicture;
  }

}
