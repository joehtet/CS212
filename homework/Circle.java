//*******************************************************************
// Joseph Htet - CS212 - Section C
// Homework 2
//*******************************************************************


public class Circle {
	private double r; // radius
    private final double pi = 3.14159;
    
    public Circle(double r) {
        this.r = r;
    }
 
  	public Circle() {
        this.r = 0;
  	}
  
  	public void setRadius(double r) {
    	this.r = r;
  	}
  
  	public double getRadius() {
    	return this.r; 
    }
  
  	public double getArea() {
    	return this.pi*this.r*this.r;
  	}
  
    public double getDiameter() {
        return this.r*2;
    }
  
  	public double getCircumference() {
   		return this.pi*this.getDiameter(); 
  	}
}
