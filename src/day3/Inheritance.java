package day3;

class Shape{
	double pi=3.14;
	
	double getSquare(int r) {
		return r*r;
	}
}

class Circle extends Shape{
	
	void area(int r) {
		System.out.println(pi*getSquare(r));
	}
}
 class Sphere extends Circle{
	 void area(int r) {
		 System.out.println(4*pi*getSquare(r));
	 }
 }
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere c=new Sphere();
		c.area(5);

	}

}
