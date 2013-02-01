/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author dskrilla24
 */
public abstract class Character {
    private String name;
    private int health;
    private int exp;
    private boolean isMale;
    
    public abstract void setWeapon();
    
    public abstract void setStamina();
    
    public abstract void setSkills();
}
