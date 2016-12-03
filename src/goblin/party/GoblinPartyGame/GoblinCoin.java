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

   private final String DEFAULT_TYPE = "blue";
   private final int DEFAULT_AMOUNT = 1;

   public GoblinCoin(){
       super(1);
       coinType = DEFAULT_TYPE;
       coinAmount = DEFAULT_AMOUNT;
   }
   public GoblinCoin(int amount, String type){
       super(1);
       coinAmount = amount;
       coinType = type;
   }

   public GoblinCoin(int amount){
       super(1);
       coinAmount = amount;
       coinType = "Blue";
   }

   public GoblinCoin(String type){
       super(1);
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
