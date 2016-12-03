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
  private int[] potionPicture;
  private int temp;

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
