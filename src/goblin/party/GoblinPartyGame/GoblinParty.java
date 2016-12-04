/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Kristen Hanslik, Robert Kendl, John Murphy, Darren White
 */
public class GoblinParty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //user input
      Scanner keyboard = new Scanner(System.in);
      Random randNum = new Random();
      String answer;

      //loop value
      boolean gameSwitch = true; //on

      //instanciate weapons

      Weapon axe = new Weapon(15, "Axe", 8, 1);
      Weapon sword = new Weapon(10, "Sword", 5, 1);
      Weapon mase = new Weapon(12, "Mase", 6, 1);
      ArrayList<Item> weapons;
      weapons = new ArrayList<Item>();
      weapons.add(axe);
      weapons.add(sword);
      weapons.add(mase);
      int currentWeapon;


      //Create Player
      Player player1 = new Player("outfitColor", "HColor","Name");

      //opening prompt
    	System.out.println("You have entered the world of Goblins, you shall now choose where you would like to tavel.");

      while(gameSwitch){
        System.out.println("North(n), South(s), East(e), West(w)");
        answer = keyboard.nextLine();

        //if West
        if(answer.equals("w")){
            int randomInt = randNum.nextInt(3);
            System.out.println("You look down and see a " + weapons.get(randomInt).name + " just below the surface. Do you grab it?");
            answer = keyboard.nextLine();

            if(answer.equals("y")){
              if(player1.pickUpItem(weapons.get(randomInt)) == 0){
                System.out.println("You are now holding the " + weapons.get(randomInt).name);
                currentWeapon = randomInt;
              }
              else System.out.println("You do not have space for this weapon");
            }
          }
          //end game
          gameSwitch = false;
        }

    }
}
