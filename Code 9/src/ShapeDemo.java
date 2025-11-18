import java.util.Scanner;

abstract class Shape{
	abstract void printArea();
}

class Triangle extends Shape{
	double base,height;
	Triangle(double b,double h){
		this.base=b;
		this.height=h;
	}
	void printArea() {
		System.out.println("The area of the triangle is: "+ (0.5*base*height));
	}
}

class Rectangle extends Shape{
	double length,breadth;
	Rectangle(double l,double b){
		this.length=l;
		this.breadth=b;
	}
	void printArea() {
		System.out.println("The area of the rectangle is: "+ (length*breadth));
	}
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	void printArea() {
		System.out.println("The area of the circle is: "+ (3.14*radius*radius));
	}
}

public class ShapeDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose shape: 1-Rectangle 2-Triangle 3-Circle");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter width and height:");
                Rectangle s = new Rectangle(sc.nextDouble(), sc.nextDouble());
                s.printArea();
                break;
            case 2:
                System.out.println("Enter base and height:");
                Triangle s2 = new Triangle(sc.nextDouble(), sc.nextDouble());
                s2.printArea();
                break;
            case 3:
                System.out.println("Enter radius:");
                Circle s3 = new Circle(sc.nextDouble());
                s3.printArea();
                break;
            default:
                System.out.println("Invalid choice."); return;
        }
    }
	}
