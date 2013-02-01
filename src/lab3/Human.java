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
public interface Human {
    /*
     * Methods I thought a main character that is a human would
     * have in a game. Intellect is intelligence not for magic.
     * I should refactor it.
     */
    public abstract void setIntellectPts(int intellectPts);
    public abstract void setIntimidationPts(int intimidationPts);
    
    public abstract int getIntellectPts();
    public abstract int getIntimidationPts();
}
