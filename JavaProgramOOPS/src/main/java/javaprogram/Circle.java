package javaprogram;

import java.util.Scanner;

public class Circle {
	
	double radius;
	double circumference;
	public Circle()
	{
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the radius of the circle :");
	      radius = sc.nextInt();
	
	}
    public Circle (double radius)
    
    {
    	this.radius=radius;
    }
    
    public void CalculateCircumference()

    {
    	circumference = Math.PI*2*radius;
        System.out.println("Circumference of the circle is :"+circumference);
    }
    
    public static void main(String[] args) {
    	Circle C1 = new Circle();
    	C1.CalculateCircumference();

	}

}
