
package mensuration;
import java.util.*;
 class Mensuration 
{ 
 private double l,b,r;
  Scanner input=new Scanner(System.in);
  
  public double getLenghth(){
      return l;
  }
   public double getBreadth(){
      return b;
  }
   public double getRadius(){
      return r;
  }
  public double areaOfSquare(){
      double area=l*l;
      return area;
       }
  public double perimeterOfSquare(){
      double perimeter=4*l;
      return perimeter;
  } 
   public double areaOfRectangle(){
      double area=l*b;
      return area;
       }
   public double perimeterOfRectangle(){
      double perimeter=2*(l*b);
      return perimeter;
  } 
   public double areaOfCircle( ){
      double area=3.14*r*r;
      return area;
       }
  public double circumferenceofCircle(){
      double circumference=2*3.14*r;
      return circumference;
  } 
    public void setLength() {
        System.out.println("Enter length");
    l=input.nextDouble();
  } 
  public void setBreadth() {
      System.out.println("Enter breadth");
     b=input.nextDouble();
  } 
  public void setRadius() {
      System.out.println("Enter radius");
     r=input.nextDouble();
  } 
 } 
public class Main{ 
public static void main(String[] args) 
{ 
 
  Mensuration mens = new Mensuration();
  mens.setLength();
  mens.setBreadth();
  mens.setRadius();
  
  double areaSqr = mens.areaOfSquare();
  double areaRec = mens.areaOfRectangle();
  double perSqr = mens.perimeterOfSquare();
  double perRec = mens.perimeterOfRectangle();
  double areaCircle = mens.areaOfCircle(); 
  double circumCircle = mens.circumferenceofCircle(); 

  System.out.println("Area of rectangle: " +areaSqr); 
  System.out.println("Perimeter of rectangle: " +perSqr);
  System.out.println("Area of rectangle: " +areaRec); 
  System.out.println("Perimeter of rectangle: " +perRec); 
  System.out.println("Area of circle: " +areaCircle); 
  System.out.println("Circumference of circle: " +circumCircle); 
 } 
}