package day3;
class Student5{
	static int count=0;
	void method5(){
		System.out.println("I'm COnstructor");
		count++;
	}
}
public class StudyStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student5 obj=new Student5();
         obj.method5();
         obj.method5();
         obj.method5();
         
        System.out.println(Student5.count);
        
	}

}
