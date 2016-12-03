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

 public class GoblinCoin extends Item{

   private String coinType;
   private int coinAmount;

   //setters
   public void setCoinType(String type){
     coinType = type;
   }
   public void setCoinAmount(int amount){
     coinAmount = amount;
   }

   //gettters
   public String getCoinType(){
     return coinType;
   }
   public int getCoinAmount(){
     return coinAmount;
   }
 }
