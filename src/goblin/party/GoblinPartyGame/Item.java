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

	public int getSize(){
		return size;
	}
	
        public String getName(){
                return name;
        }
        
        public void changeSize(int itemSize){
                size = itemSize;
        }
        
        public void changeName(String itemName){
                name = itemName;
        }
}
