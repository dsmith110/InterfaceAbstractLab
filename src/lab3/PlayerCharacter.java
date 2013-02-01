/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author  Dan Smith
 * @version 1.00
 */
public class PlayerCharacter extends Character implements Human, Warrior {
    // Properties needed for Character super class
    private String weapon;
    
    // Properties needed for Human interface
    private int intellectPts;
    private int intimidationPts;
    
    // Properties needed for Warrior interface
    private int strength;
    private int stamina;
    private String skills;
    private String[] skillsArray;
    
    // Methods from abstract character class
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public String getWeapon() {
        return weapon;
    }
    
    // Methods from Human interface
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
    
    // Methods from Warrior interface
    public void setStrength(int strength) {
        // Warrior gets strength bonus
        this.strength = strength + 5;
    }
    public void setWarriorSkills(String skills) {
        // Method will set skills to skills array
    }
    
    public int getStrength() {
        return strength;
    }
    
    public String getWarriorSkills() {
        return skills;
    }
    
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    
    public int getStamina() {
        return stamina;
    }
}
