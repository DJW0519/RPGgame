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
public class Goblin extends Character{
    private String goblinType;
    private String goblinColor;
    private int goblinCharge;
    //Using name to have extrinsic state for flyweight??
    //Could make goblin names be randomly generated in future.
    public Goblin(String goblinName, String goblinType, String goblinColor, int goblinCharge){
	super(goblinName);
	this.goblinType = goblinType;
	this.goblinColor = goblinColor;
	this.goblinCharge = goblinCharge;
    }
    public void assignGoblin(Player p){
        
    }
    public String getColor(){
	return goblinColor;
    }
    public int getCharge(){
	    return goblinCharge;
    }
    public String getType(){
        return goblinType;
    }
}
