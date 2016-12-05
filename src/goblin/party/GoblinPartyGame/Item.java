/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoblinPartyGame;

/**
 *
 * @author
 */
public abstract class Item {
	protected int size;
	protected String name;

	//Constructors
	public Item(int itemSize){
        	size = itemSize;
    	}
	
	 public Item(String itemName){
                name = itemName;
    	}
    
    	public Item(int itemSize, String itemName){
                size = itemSize;
                name = itemName;
    	}

	//Getter Methods
	public int getSize(){
		return size;
	}
	
        public String getItemName(){
                return name;
        }
        
	//Setter Methods
        public void changeSize(int itemSize){
                size = itemSize;
        }
        
        public void changeItemName(String itemName){
                name = itemName;
        }
}
