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

   private final int DEFAULT_AMOUNT = 1;
   private int coinAmount;

   public GoblinCoin(int amount, String type){
       super(1, type);
       coinAmount = amount;
   }

   public GoblinCoin(String type){
       super(1, type);
       coinAmount = DEFAULT_AMOUNT;
   }

   //setters
   public void setCoinAmount(int amount){
     coinAmount = amount;
   }

   //gettters
   public int getCoinAmount(){
     return coinAmount;
   }
 }
