/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;
import java.util.Scanner;
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
      Scanner keyboard = new Scanner(System.in);
      Random randNum = new Random();
      //user input
      String answer;
	
      GameHandler game = new GameHandler();
      //loop value
      boolean gameSwitch = true; //on

      //instanciate weapons
	String direction = "c";

	Player player1 = new Player("Ralphie");
      //opening prompt
    	System.out.println("You have entered the world of Goblins, you shall now choose where you would like to travel.");
	

      while(gameSwitch){
	     switch(direction)	{
	       case "c":       
        	System.out.println("North(n), South(s), East(e), West(w)");
        	direction = keyboard.nextLine();
		      break;	
        //if West
	      case "w":
		      game.goWest(player1);
	    	  direction = "c";
          break;
      	case "s":
		      game.goSouth(player1);
		      direction = "c";
		      break;
	     default:
		      System.out.println("Jibberish! You cannot perform that command! Try again.");
		      direction = "c";
		      break;
	       }
     }
          //end game
          gameSwitch = false;
    }

}
