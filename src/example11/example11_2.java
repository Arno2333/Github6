package example11;

public class example11_2
        extends example11_1{
    private double radius;
    
    public example11_2() {
    }
    
    public example11_2(double radius) {
    	this.radius = radius;
    }
    
    public example11_2(double radius,String color,boolean filled) {
    	this.radius = radius;
    	setColor(color);
    	setFilled(filled);
    }
    
    public double getRadius() {
    	return radius;
    }
    
    public double getArea() {
    	return radius * radius * Math.PI;
    }
    
    public double getDiameter() { 
    	return 2 * radius;
    }
    
    public double getPerimeter() { 
    	return 2 * radius * Math.PI;
    }
    
    public void printCirclef() { 
    	System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

}
