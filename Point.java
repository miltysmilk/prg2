/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public class Point 
{
 
	double xposition;
	double yposition;

    public Point(double xposition, double yposition) {
        this.xposition = xposition;
        this.yposition = yposition;
    }
	
	
        public Point()
	{
		this(0.0, 0.0);
	}
	@Override
	public String toString()
	{
		return "(" + xposition + ", " + yposition + ")";
	}   
}
