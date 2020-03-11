/*=============================================================================  
|   Source code:  TriangleTester.java
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
|  +-----------------------------------------------------------------------------  
|  
|  Description:  This program asks the user to input three (x,y) coordinate points
|				 which form a triangle. This input is sent to the Triangle class
|                to construct a triangle object formed by Point2D objects. These
|				 points are then displayed to the user alongside other information
|				 calculated about the triangle object by various methods. This 
|				 includes its side lengths, angles, perimeter, area, whether
|				 it is equilateral, whether it is a right triangle,
|				 its incenter point, and its centroid point.
|  
|        Input:  The user is required to enter six numbers to form three (x,y)
|			     coordinates in sequence, typing each number and then pressing 
|				 <return>. If the user fails to enter a number, an error will 
|				 display reminding the user to input a number. 
|  
|       Output:  The program will display an explanation of its purpose and prompt 
|				 the user for the input. After the last input, the program will
|				 display the points entered by the user, as well as the formed
|				 triangle's side lengths, angles, perimeter, area, whether
|				 it is equilateral, whether it is a right triangle,
|				 its incenter point, and its centroid point. All 
|                output is displayed in the console.  
|  
|      Process:  The program's steps are as follows:  
|  
|                1.  The program displays its purpose  
|                2.  The user is prompted to enter the coordinates of the
|					 triangle's points
|                3.  The user's input is validated, and sent to the Triangle
|					 class to construct a Triangle object 
|                4.  The expected output is called from Triangle methods and
|					 displayed in the console.
|  
|   Required Features Not Included:  All required features are included.  
|  
|   Known Bugs:  None; the program operates correctly. 
|
|   Extra Credit:  Completed. The program calculates and outputs the incenter
|				   and the centroid points of the constructed triangle.
|
|  *===========================================================================*/

import java.util.Scanner;	//Needed to receive user input

public class TriangleTester {

	public static void main(String[] args) 
	{
		double x1 = 0.0;	//Local variables used to store input for construction
		double y1 = 0.0;
		double x2 = 0.0;
		double y2 = 0.0;
		double x3 = 0.0;
		double y3 = 0.0;
	 	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the (x,y) coordinates of three points in the order"
							+ "(x1,y1) (x2,y2) (x3,y3)");
		System.out.println("Separate each coordinate with a <return>:");
		
		//Each input is individually validated
		while(!userInput.hasNextDouble()) {
			System.out.println("Error. Input must be a number:");
			userInput.next();
		}   //close while
		x1 = userInput.nextDouble();
		
		while(!userInput.hasNextDouble()) {
			System.out.println("Error. Input must be a number:");
			userInput.next();
		}   //close while
		y1 = userInput.nextDouble();
		
		while(!userInput.hasNextDouble()) {
			System.out.println("Error. Input must be a number:");
			userInput.next();
		}   //close while
		x2 = userInput.nextDouble();
		
		while(!userInput.hasNextDouble()) {
			System.out.println("Error. Input must be a number:");
			userInput.next();
		}   //close while
		y2 = userInput.nextDouble();
		
		while(!userInput.hasNextDouble()) {
			System.out.println("Error. Input must be a number:");
			userInput.next();
		}   //close while
		x3 = userInput.nextDouble();
		
		while(!userInput.hasNextDouble()) {
			System.out.println("Error. Input must be a number:");
			userInput.next();
		}   //close while
		y3 = userInput.nextDouble();
		
		System.out.println("");
		
		Triangle testingTriangle = new Triangle(x1,y1,x2,y2,x3,y3);
		
		System.out.print("Point 1 coordinates: (");
		System.out.printf("%.4f",testingTriangle.getPoint1X());
		System.out.print(", ");
		System.out.printf("%.4f",testingTriangle.getPoint1Y());
		System.out.println(")");
		
		System.out.print("Point 2 coordinates: (");
		System.out.printf("%.4f",testingTriangle.getPoint2X());
		System.out.print(", ");
		System.out.printf("%.4f",testingTriangle.getPoint2Y());
		System.out.println(")");
		
		System.out.print("Point 3 coordinates: (");
		System.out.printf("%.4f",testingTriangle.getPoint3X());
		System.out.print(", ");
		System.out.printf("%.4f",testingTriangle.getPoint3Y());
		System.out.println(")");
		System.out.println("");
		
		System.out.print("Side 1 length: ");
		System.out.printf("%.4f",testingTriangle.getSide1());
		System.out.println(" units");
		
		System.out.print("Side 2 length: ");
		System.out.printf("%.4f",testingTriangle.getSide2());
		System.out.println(" units");
		
		System.out.print("Side 3 length: ");
		System.out.printf("%.4f",testingTriangle.getSide3());
		System.out.println(" units");
		System.out.println("");
		
		System.out.println("Angle 1: " + testingTriangle.getAngle1() + " degrees");
		System.out.println("Angle 2: " + testingTriangle.getAngle2() + " degrees");
		System.out.println("Angle 3: " + testingTriangle.getAngle3() + " degrees");
		System.out.println("");
		
		System.out.print("The perimeter of the triangle is: ");
		System.out.printf("%.4f",testingTriangle.getPerimeter());
		System.out.println(" units");
		System.out.print("The area of the triangle is: ");
		System.out.printf("%.4f",testingTriangle.getArea());
		System.out.println(" square units");
		System.out.println("The triangle is Equilateral: "
							+ testingTriangle.getEquilateral());
		System.out.println("The triangle is Right-angled: "
							+ testingTriangle.getRightAngle());
		System.out.println("");
		
		System.out.print("Incenter of the triangle: (");
		System.out.printf("%.4f",testingTriangle.getIncenterX());
		System.out.print(", ");
		System.out.printf("%.4f",testingTriangle.getIncenterY());
		System.out.println(")");
		
		System.out.print("Centroid of the triangle: (");
		System.out.printf("%.4f",testingTriangle.getCentroidX());
		System.out.print(", ");
		System.out.printf("%.4f",testingTriangle.getCentroidY());
		System.out.println(")");
	}
}