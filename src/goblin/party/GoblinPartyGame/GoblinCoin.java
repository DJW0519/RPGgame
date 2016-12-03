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

   private final String DEFAULT_TYPE = "Blue";
   private final int DEFAULT_AMOUNT = 1;
   private int coinAmount;

   public GoblinCoin(){
       super(1);
       name = DEFAULT_TYPE;
       coinAmount = DEFAULT_AMOUNT;
   }
   public GoblinCoin(int amount, String type){
       super(1);
       coinAmount = amount;
       name = type;
   }

   public GoblinCoin(int amount){
       super(1);
       coinAmount = amount;
       name = "Blue";
   }

   public GoblinCoin(String type){
       super(1);
       name = type;
       coinAmount = 1;
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
