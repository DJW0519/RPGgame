package GoblinPartyGame;

public class Bag{
	
	private final int DEFAULT_CAPACITY = 50;
	private final int MAX_CAPACITY = 5000;
	public int capacity;
	public int roomUsed;
	public int numBlueCoins;
	public int numGreenCoins;
	public int numPurpleCoins;

    
	public Bag(){
		capacity = DEFAULT_CAPACITY;
		roomUsed = 0;
		numBlueCoins = 0;
		numGreenCoins = 0;
		numPurpleCoins = 0;
	}

	public void removeItem(Item itemToRemove){
		//TODO


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
		return 1;




	}








}
