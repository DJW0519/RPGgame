package GoblinPartyGame;

import java.lang.*;
import java.util.*;

public class Bag{
	
	private final int DEFAULT_CAPACITY = 50;
	private final int MAX_CAPACITY = 5000;
	public int capacity;
	public int roomUsed;
	public int numBlueCoins;
	public int numGreenCoins;
	public int numPurpleCoins;
	private ArrayList<Item> bagItems;
	private int numBagItems;

    
	public Bag(){
		capacity = DEFAULT_CAPACITY;
		roomUsed = 0;
		numBlueCoins = 0;
		numGreenCoins = 0;
		numPurpleCoins = 0;
		bagItems = new ArrayList<Item>();
	}

	public void viewBag(){
		System.out.println("Bag Contents:\n");
		int i;
		System.out.println("	Green Coins: " + numGreenCoins);
		System.out.println("	Blue Coins: " + numBlueCoins);
		System.out.println("	Purple Coins: " + numPurpleCoins + "\n");

		System.out.println("	WEAPONS: ");

		for(i = 0; i < bagItems.size(); i++){
			System.out.println("	- " + bagItems.get(i).name+ "\n");
		}

		System.out.println("	POTIONS: \n");
	}
	public int removeItem(Item itemToRemove){
		if(bagItems.remove(itemToRemove)){
			return 0;
		}
		return 1;		

	}
	public int removeCoins(int numCoins, String color ){
		switch(color){
			case "Blue":
				if(numBlueCoins >= numCoins){
					numBlueCoins -= numCoins;
					roomUsed--;
					return 0;
				}
				break;
			case "Green":
				if(numGreenCoins >= numCoins){
					numGreenCoins -= numCoins;
					roomUsed--;
					return 0;
				}
				break;
			case "Purple":
				if(numPurpleCoins >= numCoins){
					numPurpleCoins -= numCoins;
					roomUsed --;
					return 0;
				}
				break;
			default:
				System.out.println("That color of coin does not exist!");
				return 1;
		}

		return 1;
	}

	public int getRoomUsed(){
		return roomUsed;
	}

	public int increaseCapacity(int amtToAdd){
		if(this.capacity + amtToAdd > MAX_CAPACITY){
			return 1;
		}
		
		this.capacity = this.capacity + amtToAdd;
		return 1;
	}

	public int addItem(Item newItem){
		if(roomUsed + newItem.getSize() > capacity) return 1;
		
		roomUsed += newItem.getSize();
		System.out.println("Goblin Coin " + newItem.getClass().getName() + "\n");
		if (newItem.getClass().getName() == "GoblinPartyGame.GoblinCoin"){

			if(newItem.getItemName() == "Blue"){
				numBlueCoins += newItem.getSize();
			}
			else if(newItem.getItemName() == "Green"){
				numGreenCoins+= newItem.getSize();
			}
			else{
				numPurpleCoins += newItem.getSize();
			}
			
		}
		else {
			bagItems.add(newItem);
			System.out.println("In addItem...");
		}
		viewBag();
		return 0;
	}
	
	public int getBagCapacity(){
            return capacity;
        }







}

