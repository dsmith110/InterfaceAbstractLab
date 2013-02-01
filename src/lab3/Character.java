/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 * This is the main super class I came up with. It's abstract because
 * character is a generic type of object in the game. The properties such as 
 * name, health, exp, and isMale(wasn't sure where to put this) can apply to 
 * all characters (main character, enemies, bosses, NPCs). 
 * The abstract method implementation for weapon and skill points will be 
 * different for every character when instantiating the character.
 * 
 * @author  Dan Smith
 * @version 1.00
 */
public abstract class Character {
    private String name;
    private int health;
    private int exp;
    private boolean isMale;
    // Inventory array
    // I kept this here because you can modify the contents from the subclasses
    // with a method call to super
    private String tempItem;
    private String[] inventory;
    
    /*
     * These methods must be overridden in any class that 
     * extends Character. Made these abstract because when
     * a player makes a new character the starting weapon
     * will be different depending on class player chooses
     * eg.  Mage - staff
     *      Warrior - sword
     * also,
     * when an enemy type is instantiated the weapon and skill sets
     * will be different.
     */
    public abstract void setWeapon(String weapon);
    
    public abstract String getWeapon();

    public abstract void setSkillPts(int skillPts);
    
    public abstract int getSkillPts();
    
    /*
     * Concrete Getters and Setters for Character
     * ---------------------------------
     * I'm not sure if I should make the getters and setters final.
     * These will not change, so concrete inheritance will cut back on the 
     * time it takes to code. I've never seen them declared final in 
     * any sample code I've seen.
     */
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the exp
     */
    public int getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * @return the isMale
     */
    public boolean isIsMale() {
        return isMale;
    }

    /**
     * @param isMale the isMale to set
     */
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    /**
     * @return the tempItem
     */
    public String getTempItem() {
        return tempItem;
    }

    /**
     * @param tempItem the tempItem to set
     */
    public void setTempItem(String tempItem) {
        this.tempItem = tempItem;
    }

    /**
     * @return the inventory
     */
    public String[] getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(String tempItem) {
        // Needs logic implementation
        inventory[0] = tempItem;
    }
}
