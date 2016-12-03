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
  
   public GoblinCoin(int amount, String type){
       coinAmount = amount;
       coinType = type;
   }
   
   public GoblinCoin(int amount){
       coinAmount = amount;
       coinType = "Blue";
   }
   
   public GoblinCoin(String type){
       coinType = type;
       coinAmount = 1;
   }

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
