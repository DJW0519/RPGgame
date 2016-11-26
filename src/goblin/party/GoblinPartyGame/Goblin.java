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
    
    //Using name to have extrinsic state for flyweight??
    //Could make goblin names be randomly generated in future.
    public Goblin(String goblinName, String goblinType, String goblinColor){
	super(goblinName);
	this.goblinType = goblinType;
	this.goblinColor = goblinColor;
    }
    public void assignGoblin(Player p){
        
    }
}
