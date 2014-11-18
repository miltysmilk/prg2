/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public class Rectangle extends GeometricFigure
{
    double width;
    double height;

    public Rectangle(double height)
    {
        this.height = height;
    }

    public Rectangle(double width, double height, Point cornerIn) {
        super(cornerIn);
        this.width = width;
        this.height = height;
    }

   
    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getArea()
    {
        return 0.0;
    }
}
