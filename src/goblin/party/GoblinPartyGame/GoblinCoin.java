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
       super(amount, type);
   }

   public GoblinCoin(String type){
       super(1, type);
   }

   //setters
   public void setCoinAmount(int amount){
     size = amount;
   }

   //gettters
   public int getCoinAmount(){
     return size;
   }
 }
