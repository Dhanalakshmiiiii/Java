abstract class Shape{
    abstract double calculateArea();
    
    void display(){
    	System.out.println("This is a shape");
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
    	this.length=length;
    	this.breadth=breadth;
    }
    double calculateArea(){
	return length*breadth;
    }
}
class Circle extends Shape{
   int radius;
   Circle(int radius){
   	this.radius=radius;
   }
   double calculateArea(){
   	return Math.PI*radius*radius;
   }
}

public class MainCirRect{
   public static void main(String args[]){
   	Shape rectangle=new Rectangle(5,3);
   	Shape circle=new Circle(4);
   	System.out.println("Arae of rectangle:"+rectangle.calculateArea());
   	rectangle.display();
   	System.out.println("Area of circle:"+circle.calculateArea());
   	circle.display();
   }
}    	
