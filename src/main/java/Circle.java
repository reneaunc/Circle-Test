import java.util.*;

//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
    // add your instances here
    private double x;
    private double y;
    private double radius;
    // constructors
    // default constructor - to be modified
    public Circle() {}

    // customized constructor - to be modified
    public Circle(double xV, double yV, double radiusV) {
        setX(xV);
        setY(yV);
        setRadius(radiusV);
    }
    
    //--------------------------------------------------------
    // toString - return a String representation of
    //            this circle in the following format:
    //            center:(x,y)
    //            radius: r
    //--------------------------------------------------------
    public String toString() {
        String stringX = String.valueOf(x);
        String stringY = String.valueOf(y);
        String stringR = String.valueOf(radius);
        String stringValue = ("center:(" + stringX + "," + stringY + ") \n radius: " + stringR);
        return stringValue;
    }

    //----------------------------------------------
    // getX - returns the value of x
    //----------------------------------------------
    public double getX() {
        // you will remove this line
        return roundTo3(x);

    }
    

    //----------------------------------------------
    // getY - returns the value of y
    //----------------------------------------------
    public double getY() {
        // you will remove this line
        return roundTo3(y);
    }
    
    //----------------------------------------------
    // getRadius - returns the value of radius
    //----------------------------------------------
    public double getRadius() {
        // you will remove this line
        return roundTo3(radius);
    }

    //----------------------------------------------
    // setX - assigns a new value to x
    //----------------------------------------------
    public void setX(double xV) {
        this.x = roundTo3(xV);
    }
    

    //----------------------------------------------
    // setY - assigns a new value to y
    //----------------------------------------------
    public void setY(double yV) {
        this.y = roundTo3(yV);
    }   
    
    
    //----------------------------------------------
    // setRadius - assigns a new value to radius
    //----------------------------------------------
    public void setRadius(double radiusV) {
        if(radiusV >= 0) {
            this.radius = roundTo3(radiusV);
        }
    }
    //--------------------------------------------------------
    // diameter - calculates the diameter of the circle
    //--------------------------------------------------------
    public double diameter() {
        // you will remove this line
        double circleD = (getRadius() * 2);
        return roundTo3(circleD);
    }
    

    //--------------------------------------------------------
    // area - returns the area of the circle
    //--------------------------------------------------------
    public double area() {
        // you will remove this line
        double pirsq = (Math.PI * (Math.pow(getRadius(), 2)));
        return roundTo3(pirsq);
    }

    //--------------------------------------------------------
    // perimeter - returns the perimeter of the circle
    //--------------------------------------------------------
    public double perimeter() {
        // you will remove this line
        double circleP = (2 * Math.PI * getRadius());
        return roundTo3(circleP);
    }
    
    //--------------------------------------------------------
    // isUnitCircle - return true if the radius of this circle
    //                is 1 and its center is (0,0) and false
    //                otherwise.
    //--------------------------------------------------------
    public boolean isUnitCircle() {
        // you will remove this line
        if((getRadius() == 1) && ((getX() == 0) && (getY() == 0))) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean equals(Circle anotherCircle) {
        // you will remove this line
        if((anotherCircle.getRadius() == getRadius()) && ((getX() == anotherCircle.getX()) && (getY() == anotherCircle.getY()))){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isConcentric(Circle anotherCircle) {
        // you will remove this line
        if(((getX() == anotherCircle.getX()) && (getY() == anotherCircle.getY())) && (getRadius() != anotherCircle.getRadius())){
            return true;
        }
        else{
            return false;
        }
    }

    public double distance(Circle anotherCircle) {
        // you will remove this line
        double circleDis = Math.sqrt((Math.pow(getX() - anotherCircle.getX(), 2)) + (Math.pow(getY() - anotherCircle.getY(), 2)));
        return roundTo3(circleDis);
    }

    public boolean intersects(Circle anotherCircle) {
        // you will remove this line
        if(distance(anotherCircle) < (getRadius() + anotherCircle.getRadius())){
            return true;
        }
        else{
            return false;
        }
    }

    // you are welcome to add more helper methods if needed
    public double roundTo3(double value) {
        return (Math.round(value * 1000.0) / 1000.0);
    }
}
