/*
 * Mohamed Dahir
 */
package model;

import java.awt.Shape;
import java.awt.geom.RectangularShape;

/**
 * This class handle rectangular shapes (rectangles and ellipses).
 * @author Mohamed Dahir
 * @version 1.0.0.
 *
 */
public abstract class AbstractRectangular extends AbstractTool {

    /** This is my rectangular shape to be drawn. */
    private RectangularShape myRectangularShape;
    
    /** This is the starting x value of my rectangle. */
    private int myStartX;

    /** This is the starting y value of my rectangle. */
    private int myStartY;
    
    /**
     * This initializes the rectangular field.
     * @param theRectangularShape the rectangular shape to be drawn.
     */
    public AbstractRectangular(final RectangularShape theRectangularShape) {
        super();
        myRectangularShape = theRectangularShape;
    }

    @Override
    public Shape getShape() {
        
        return myRectangularShape;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Shape startingPoint(final int theStartX, final int theStartY) {
        myStartX = theStartX;
        myStartY = theStartY;
        
        myRectangularShape = (RectangularShape) myRectangularShape.clone();
        myRectangularShape.setFrameFromDiagonal(myStartX, myStartY, theStartX, theStartY);
        
        return myRectangularShape;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Shape endingPoint(final int theStartX, final int theStartY) {
       
        myRectangularShape.setFrameFromDiagonal(myStartX, myStartY, theStartX, theStartY);
        
        return myRectangularShape;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Shape finalPoint(final int theEndX, final int theEndY) {
        myRectangularShape.setFrameFromDiagonal(myStartX, myStartY, theEndX, theEndY);
        return (Shape) myRectangularShape.clone();
    }

}
