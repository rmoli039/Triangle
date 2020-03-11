/*=======================================================================
|   Source code:  TriangleTester.java
|
|         Class:  Triangle 
|
|        Author:  Richard Molina
|    Student ID:  6140544
|    Assignment:  Program #2 - Triangle
|  
|            Course:  COP 3337 (Intermediate Programming)
|           Section:  U08
|        Instructor:  William Feild  
|          Due Date:  20 September 2018, at the beginning of class 
|
|	I hereby certify that this collective work is my own
|	and none of it is the work of any other person or entity.
|	______________________________________ [Signature]
|  
|     Language:  Java 
|  Compile/Run:   
| 		javac TriangleTester.java
|		java TriangleTester
| 
|        Purpose:  This class recieves input points from the tester, which the
|				   class uses to construct a triangle made up of three Point2D
|				   objects. The class also houses methods that the tester can
|				   call to calculate and return information about the triangle,
|			       This includes its side lengths, angles, perimeter, area,
|				   whether it is equilateral, whether it is a right triangle,
|				   its incenter point, and its centroid point.				
|
|  Inherits From:  None
|
|     Interfaces:  None
|
|  +-----------------------------------------------------------------------
|
|      Constants:  EPSILON is initialized as 0.0001, which is the desired
|				   standard of error to compare equlity of floating-point
|				   numbers. EPSILON is used to compare closeness for angle
|				   values that may not be exactly defined based on the
|				   coordinate points entered.
|
| +-----------------------------------------------------------------------
|
|     Constructors:  Point2D
|                     - Constructs three empty Point2D objects
|					 Triangle
|					  - Takes individual x and y points as input
|					  - Sets the location of the constructed Point2D objects
|					    to the coordinate inputs from the tester
|					  - Constructs a triangle with those three coordinates
|
|    Class Methods:  angle1(), angle2(), angle3()
|					  - Returns the angle at point1, point2, point3 (radians)
|
| Instance Methods:  getPoint1X(), getPoint2X(), getPoint3X()
|					  - Returns the x-coordinate of point1, point2, point3
|					 getPoint1Y(), getPoint2Y(), getPoint3Y()
|					  - Returns the y-coordinate of point1, point2, point3
|					 getSide1(), getSide2(), getSide3()
|					  - Returns the side length of side1, side2, side3
|					 getAngle1(), getAngle2(), getAngle3()
|					  - Returns the angle at point1, point2, point3 (degrees)
|					 getPerimeter()
|					  - Returns the triangle's perimeter in units
|					 getArea()
|					  - Returns the the triangle's area in square units
|					 getEquilateral()
|					  - Returns true/false whether the triangle is equilateral
|					 getRightAngle()
|					  - Returns true/false whether the triangle is a right triangle
|					 getIncenterX()
|					  - Returns the x-coordinate of the incenter of the triangle
|					 getIncenterY()
|					  - Returns the y-coordinate of the incenter of the triangle
|					 getCentroidX()
|					  - Returns the x-coordinate of the centroid of the triangle
|					 getCentroidY()
|					  - Returns the y-coordinate of the centroid of the triangle
|
|     Extra Credit:  Completed. The program calculates and outputs the incenter
|				     and the centroid points of the constructed triangle.
|
|  *===========================================================================*/

import java.lang.Math;   	    //Allows the use of the pow and trig functions
import java.awt.geom.Point2D;	//Allows the construction of Point2D onjects

public class Triangle
{
	private Point2D point1 = new Point2D.Double();
	private Point2D point2 = new Point2D.Double();
	private Point2D point3 = new Point2D.Double();
	private static final double EPSILON = 0.0001; 
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		point1.setLocation(x1, y1);
		point2.setLocation(x2, y2);
		point3.setLocation(x3, y3);
	}
	
	/*---------------------------- getPoint1X ----------------------------
    |  Method getPoint1X ()
    |
    |  Purpose:  Return the x-coordinate of point1.
    |
    |  @param	 
    |
    |  @return  the x-coordinate of point1
    *-------------------------------------------------------------------*/
	public double getPoint1X()
	{
		return point1.getX();
	}

	/*---------------------------- getPoint2X ----------------------------
    |  Method getPoint2X ()
    |
    |  Purpose:  Return the x-coordinate of point2.
    |
    |  @param	 
    |
    |  @return  the x-coordinate of point2
    *-------------------------------------------------------------------*/
	public double getPoint2X()
	{
		return point2.getX();
	}

	/*---------------------------- getPoint3X ----------------------------
    |  Method getPoint3X ()
    |
    |  Purpose:  Return the x-coordinate of point3.
    |
    |  @param	 
    |
    |  @return  the x-coordinate of point3
    *-------------------------------------------------------------------*/
	public double getPoint3X()
	{
		return point3.getX();
	}

	/*---------------------------- getPoint1Y ----------------------------
    |  Method getPoint1Y ()
    |
    |  Purpose:  Return the y-coordinate of point1.
    |
    |  @param	 
    |
    |  @return  the y-coordinate of point1
    *-------------------------------------------------------------------*/
	public double getPoint1Y()
	{
		return point1.getY();
	}

	/*---------------------------- getPoint2Y ----------------------------
    |  Method getPoint2Y ()
    |
    |  Purpose:  Return the y-coordinate of point2.
    |
    |  @param	 
    |
    |  @return  the y-coordinate of point2
    *-------------------------------------------------------------------*/
	public double getPoint2Y()
	{
		return point2.getY();
	}

	/*---------------------------- getPoint3Y ----------------------------
    |  Method getPoint3Y ()
    |
    |  Purpose:  Return the y-coordinate of point3.
    |
    |  @param	 
    |
    |  @return  the y-coordinate of point3
    *-------------------------------------------------------------------*/
	public double getPoint3Y()
	{
		return point3.getY();
	}
	
	/*---------------------------- getSide1 ----------------------------
    |  Method getSide1 ()
    |
    |  Purpose:  Calculate the length of the side opposite point1.
    |
    |  @param	 
    |
    |  @return  the length of Side 1 in units
    *-------------------------------------------------------------------*/
	public double getSide1()
	{
		return point2.distance(point3);
	}
	
	/*---------------------------- getSide2 ----------------------------
    |  Method getSide2 ()
    |
    |  Purpose:  Calculate the length of the side opposite point2.
    |
    |  @param	 
    |
    |  @return  the length of Side 2 in units
    *-------------------------------------------------------------------*/
	public double getSide2()
	{
		return point3.distance(point1);
	}
	
	/*---------------------------- getSide3 ----------------------------
    |  Method getSide3 ()
    |
    |  Purpose:  Calculate the length of the side opposite point3.
    |
    |  @param	 
    |
    |  @return  the length of Side 3 in units
    *-------------------------------------------------------------------*/
	public double getSide3()
	{
		return point1.distance(point2);
	}
	
	/*---------------------------- angle1 ----------------------------
    |  Method angle1 ()
    |
    |  Purpose:  Calculate the angle formed at point1.
    |
    |  @param	 
    |
    |  @return  the angle at point1 in radians
    *-------------------------------------------------------------------*/
	private double angle1()
	{
		//Prevents division by 0
		if(getSide1() != 0 && getSide2() != 0 && getSide3() != 0)
		{
			//The arccos formula to calculate an angle from three sides
			return Math.acos(((Math.pow(getSide2(), 2)) + (Math.pow(getSide3(), 2))
					- (Math.pow(getSide1(), 2))) / (2 * getSide2() * getSide3()));
		}   //close if
		else
		{
			return 0.0;
		}   //close else
	}
	
	/*---------------------------- angle2 ----------------------------
    |  Method angle2 ()
    |
    |  Purpose:  Calculate the angle formed at point2.
    |
    |  @param	 
    |
    |  @return  the angle at point2 in radians
    *-------------------------------------------------------------------*/
	private double angle2()
	{
		//Prevents division by 0
		if(getSide1() != 0 && getSide2() != 0 && getSide3() != 0)
		{
			//The arccos formula to calculate an angle from three sides
			return Math.acos(((Math.pow(getSide1(), 2)) + (Math.pow(getSide3(), 2)) 
					- (Math.pow(getSide2(), 2))) / (2 * getSide1() * getSide3()));
		}   //close if
		else
		{
			return 0.0;
		}   //close else
	}

	/*---------------------------- angle3 ----------------------------
    |  Method angle3 ()
    |
    |  Purpose:  Calculate the angle formed at point3.
    |
    |  @param	 
    |
    |  @return  the angle at point3 in radians
    *-------------------------------------------------------------------*/
	private double angle3()
	{
		//Prevents division by 0
		if(getSide1() != 0 && getSide2() != 0 && getSide3() != 0)
		{
			//The arccos formula to calculate an angle from three sides
			return Math.acos(((Math.pow(getSide1(), 2)) + (Math.pow(getSide2(), 2)) 
					- (Math.pow(getSide3(), 2))) / (2 * getSide1() * getSide2()));
		}   //close if
		else
		{
			return 0.0;
		}   //close else
	}
	
	/*---------------------------- getAngle1 ----------------------------
    |  Method getAngle1 ()
    |
    |  Purpose:  Return Angle 1 in rounded degrees
    |
    |  @param	 
    |
    |  @return  angle 1 in degrees
    *-------------------------------------------------------------------*/
	public int getAngle1()
	{
		return (int)Math.round(Math.toDegrees(angle1()));
	}

	/*---------------------------- getAngle2 ----------------------------
    |  Method getAngle2 ()
    |
    |  Purpose:  Return Angle 2 in rounded degrees
    |
    |  @param	 
    |
    |  @return  angle 2 in degrees
    *-------------------------------------------------------------------*/
	public int getAngle2()
	{
		return (int)Math.round(Math.toDegrees(angle2()));
	}

	/*---------------------------- getAngle3 ----------------------------
    |  Method getAngle3 ()
    |
    |  Purpose:  Return Angle 3 in rounded degrees
    |
    |  @param	 
    |
    |  @return  angle 3 in degrees
    *-------------------------------------------------------------------*/
	public int getAngle3()
	{
		return (int)Math.round(Math.toDegrees(angle3()));
	}
	
	/*---------------------------- getPerimeter ----------------------------
    |  Method getPerimeter ()
    |
    |  Purpose:  Calculate and return the sum of the triangle's sides
    |
    |  @param	 
    |
    |  @return  the triangle's perimeter in units
    *-------------------------------------------------------------------*/
	public double getPerimeter()
	{
		//The perimeter formula for all triangles
		return getSide1() + getSide2() + getSide3();
	}
	
	/*---------------------------- getArea ----------------------------
    |  Method getArea ()
    |
    |  Purpose:  Calculate and return the area of the triangle
    |
    |  @param	 
    |
    |  @return  the triangle's area in square units
    *-------------------------------------------------------------------*/
	public double getArea()
	{
		//The general area formula for all triangles
		return 0.5 * getSide1() * getSide2() * Math.sin(angle3());
	}
	
	/*---------------------------- getEquilateral ----------------------------
    |  Method getEquilateral ()
    |
    |  Purpose:  Determine if the triangle is equilateral within the margin 
    |            of error of EPSILON (4 decimal places)
    |
    |  @param	 
    |
    |  @return  true/false whether the triangle is equilateral
    *-------------------------------------------------------------------*/
	public boolean getEquilateral()
	{
		//Checks to see if all three angles are similar enough to be equal
		if (Math.abs(angle1() - angle2()) < EPSILON && 
				Math.abs(angle2() - angle3()) < EPSILON)
		{
			return true;
		}   //close if
		else
		{
			return false;
		}   //close else
	}
	
	/*---------------------------- getRightAngle ----------------------------
    |  Method getRightAngle ()
    |
    |  Purpose:  Determine if the triangle is a right triangle within the
    |			 margin of error of EPSILON (4 decimal places)
    |
    |  @param	 
    |
    |  @return  true/false whether the triangle is a right triangle
    *-------------------------------------------------------------------*/
	public boolean getRightAngle()
	{
		//Checks each angle to see if it is close enough to be 90 degrees
		if (Math.abs(90 - Math.toDegrees(angle1())) < EPSILON)
		{
			return true;
		}   //close if
		else if (Math.abs(90 - Math.toDegrees(angle2())) < EPSILON)
		{
			return true;
		}   //close else if
		else if (Math.abs(90 - Math.toDegrees(angle3())) < EPSILON)
		{
			return true;
		}   //close else if
		else
		{
			return false;
		}   //close else
	}
	
	/*---------------------------- getIncenterX ----------------------------
    |  Method getIncenterX ()
    |
    |  Purpose:  Calculate the x-coordinate of the incenter of the triangle
    |			 and return it
    |
    |  @param	 
    |
    |  @return  the x-coordinate of the incenter of the triangle
    *-------------------------------------------------------------------*/
	public double getIncenterX()
	{
		if(getPerimeter() != 0)   //Prevents division by 0
		{
			//Formula for the x-coordinate of the incenter of a triangle
			return (((getSide1() * getPoint1X()) + (getSide2() * getPoint2X()) 
					+ (getSide3() * getPoint3X())) / getPerimeter());
		}   //close if
		else
		{
			return 0.0;
		}   //close else
	}
	
	/*---------------------------- getIncenterY ----------------------------
    |  Method getIncenterY ()
    |
    |  Purpose:  Calculate the y-coordinate of the incenter of the triangle
    |			 and return it
    |
    |  @param	 
    |
    |  @return  the y-coordinate of the incenter of the triangle
    *-------------------------------------------------------------------*/
	public double getIncenterY()
	{
		if(getPerimeter() != 0)   //Prevents division by 0
		{
			//Formula for the y-coordinate of the incenter of a triangle
			return (((getSide1() * getPoint1Y()) + (getSide2() * getPoint2Y()) 
					+ (getSide3() * getPoint3Y())) / getPerimeter());
		}   //close if
		else
		{
			return 0.0;
		}   //close else
	}
	
	/*---------------------------- getCentroidX ----------------------------
    |  Method getCentroidX ()
    |
    |  Purpose:  Calculate the x-coordinate of the centroid of the triangle
    |			 and return it
    |
    |  @param	 
    |
    |  @return  the x-coordinate of the centroid of the triangle
    *-------------------------------------------------------------------*/
	public double getCentroidX()
	{
		//Formula for the x-coordinate of the centroid of a triangle
		return ((getPoint1X() + getPoint2X() + getPoint3X()) / 3);
	}
	
	/*---------------------------- getCentroidY ----------------------------
    |  Method getCentroidY ()
    |
    |  Purpose:  Calculate the y-coordinate of the centroid of the triangle
    |			 and return it
    |
    |  @param	 
    |
    |  @return  the y-coordinate of the centroid of the triangle
    *-------------------------------------------------------------------*/
	public double getCentroidY()
	{
		//Formula for the y-coordinate of the centroid of a triangle
		return ((getPoint1Y() + getPoint2Y() + getPoint3Y()) / 3);
	}
}