/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public abstract class GeometricFigure 
{
    private Point cornerpoint;
	
    public GeometricFigure(Point cornerIn)
	{
		cornerpoint = cornerIn;
	}
	public GeometricFigure()
	{
		this(new Point());
	}
	public double area()
	{
		return 0.0;
	}
	
	
	public Point getCorner()
	{
		return cornerpoint;
	}
	
	public void setCorner(Point pointIn)
	{
		cornerpoint = pointIn;
	}
}
