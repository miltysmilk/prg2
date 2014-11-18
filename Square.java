/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public class Square extends Rectangle implements properties
{

    public Square(double width, double height, Point cornerIn) 
    {
        super(width, height, cornerIn);
    }

    
    public Square(double length)
    {
        super(length);
    }
 
    public void setWidth(double widthIn)
    {
        
    }

    @Override
    public String toString()
    {
        return "Square{" + '}';
    }

    @Override
    public double perimeterOfSquare() 
    {
        return 0.0;
    }
    public double getArea(double area)
    {
        return 0.0;
    }
}
