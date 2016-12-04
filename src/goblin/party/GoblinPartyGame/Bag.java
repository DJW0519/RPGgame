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

	public void veiwBag(){
		System.out.println("Bag Contents:\n");
		int i;

		for(i = 0; i < bagItems.size(); i++){
			System.out.println("%s\n", bagItems.get(i));
		}
		System.out.println("Green Coins: %i\n", numGreenCoins);
		System.out.println("Blue Coins: %i\n", numBlueCoins);
		System.out.println("Purple Coins: %i\n", numPurpleCoins);
	}
	public int removeItem(Item itemToRemove){
		if(bagItems.remove(itemToRemove)){
			return 0;
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

		if (newItem.getClass().getName() == "GoblinCoin"){

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
		return 0;
	}








}
