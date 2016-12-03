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

	public int getSize(){
		return size;
	}




}
