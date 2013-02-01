/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 * I made this an interface because enemies and characters in the game could
 * be human. I envision that every human would have an algorithm that modifies
 * the interaction with other characters based on these.
 * -----------------------------------------------------------
 * @author  Dan Smith
 * @version 1.00
 */
public interface Human {
    /*
     * Intellect is intelligence, not for magic.
     * I should refactor it to clear up confusion.
     */
    public abstract void setIntellectPts(int intellectPts);
    public abstract void setIntimidationPts(int intimidationPts);
    
    public abstract int getIntellectPts();
    public abstract int getIntimidationPts();
}
