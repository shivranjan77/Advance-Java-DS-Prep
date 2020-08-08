package day3;

abstract class A{
	int maxSpeed=340;
	abstract void method1();
	abstract void brake();
}
abstract class Bmw extends A{
	void method1() {
		System.out.println("Car is Accelerating"+maxSpeed);
	}
	/*void brake() {
		System.out.println("Car is braking");
	}*/
	
}
class BmwNew extends Bmw{
	void brake() {
		System.out.println("Car Is braking new"+maxSpeed);
	}
}

public class StudyAbstraction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BmwNew obj=new BmwNew();
		obj.method1();
		obj.brake();
		

	}

}
