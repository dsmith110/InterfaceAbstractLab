/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 * This is how I would see the player character class. It could have
 * many more methods. This is just the start of a basic outline.
 * ------------------------------------------------------------
 * @author  Dan Smith
 * @version 1.00
 */
public class PlayerCharacter extends Character implements Human, Warrior {
    // Properties needed for Character super class abstract methods
    private String weapon;
    private int skillPts;
    
    // Properties needed for Human interface implementation
    private int intellectPts;
    private int intimidationPts;
    
    // Properties needed for Warrior interface implementation
    private int rage;
    private int strength;
    private int stamina;
    private String skills;
    private String[] skillsArray;
    
    // Methods from abstract character class. These all look the same,
    // but if this was a game build they would have different logic in them.
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public String getWeapon() {
        return weapon;
    }
    
    public int getSkillPts() {
        return skillPts;
    }

    public void setSkillPts(int skillPts) {
        this.skillPts = skillPts;
    }
    
    // Methods from Human interface. 
    // These methods would be unique to a player that selects the human race
    // No other race would have these statistics
    public void setIntellectPts(int intellectPts) {
        this.intellectPts = intellectPts;
    }
    
    public int getIntellectPts() {
        return intellectPts;
    }
    
    public void setIntimidationPts(int intimidationPts) {
        this.intimidationPts = intimidationPts;
    }
    
    public int getIntimidationPts() {
        return intimidationPts;
    }
    
    // Methods from Warrior interface.
    // Unique to a player that selects to play as a warrior. No other class
    // would use rage, get strength bonuses, and have warrior skill set.
    public void setRage(int rage) {
        
    }
    
    public void setStrength(int strength) {
        // Warrior gets strength bonus
        this.strength = strength + 5;
    }
    
    public void setWarriorSkills(String skills) {
        // Method will set skills to skills array
    }
    
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    
    public int getRage() {
        return rage;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public String getWarriorSkills() {
        return skills;
    }
    
    public int getStamina() {
        return stamina;
    }
}
