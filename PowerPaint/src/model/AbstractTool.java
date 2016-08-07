/*
 * Mohamed Dahir
 */
package model;

/**
 * This is the parent abstract class of all tools.
 * @author Mohamed Dahir
 * @version 1.0.0.
 */
public abstract class AbstractTool implements DrawingTool  {

    /**returns the name of the tool.
     * @return the name of the tool. 
     */
    public String toString() {
        return this.getClass().getName();
    }
}
