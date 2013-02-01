/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 * 
 * I made warrior an interface because not only can a player be a warrior,
 * but enemies and NPCs could also be a warrior. In combat these will factor 
 * into how battles will occur.
 * -----------------------------
 * @author  Dan Smith
 * @version 1.00
 */
public interface Warrior {
    
    /*
     * Methods must be implemented in any class that implements
     * Warrior
     */
    public abstract void setRage(int rage);
    public abstract void setStamina(int stamina);
    public abstract void setStrength(int strength);
    public abstract void setWarriorSkills(String skills);
    
    public abstract int getRage();
    public abstract int getStamina();
    public abstract int getStrength();
    public abstract String getWarriorSkills();
}
