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
public abstract class Character {
    private String name;
    private int health;
    private int exp;
    private boolean isMale;
    private int skillPts;
    // Inventory array
    private String tempItem;
    private String[] inventory;
    
    /*
     * These methods must be overridden in any class that 
     * extends Character. Made these abstract because when
     * a player makes a new character the starting weapon
     * will be different depending on class player chooses
     * eg.  Mage - staff
     *      Warrior - sword
     */
    public abstract void setWeapon(String weapon);
    
    public abstract String getWeapon();

    /*
     * Getters and Setters for Character
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
     * @return the skillPts
     */
    public int getSkillPts() {
        return skillPts;
    }

    /**
     * @param skillPts the skillPts to set
     */
    public void setSkillPts(int skillPts) {
        this.skillPts = skillPts;
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
