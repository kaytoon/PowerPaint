/*
 * Mohamed Dahir
 */
package model;

import java.awt.geom.Ellipse2D;

/**
 * The tool class responsible for drawing ellipses.
 * @author Mohamed Dahir
 * @version 1.0.0.
 *
 */
public class EllipseTool extends AbstractRectangular {
    /** Creates a ellipse.*/
    public EllipseTool() {
        super(new  Ellipse2D.Double());       
    }

}
