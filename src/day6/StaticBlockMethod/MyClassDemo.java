package day6.StaticBlockMethod;

public class MyClassDemo {
	
	public static void main(String[] args) {

		MyClass o1 = new MyClass();
		System.out.println(o1);

		MyClass.display();

		MyClass o2 = new MyClass();
		System.out.println(o2);
		MyClass.display();
		MyClass o3 = new MyClass();
		System.out.println(o3);
		MyClass.display();
		
		MyClass o4 = new MyClass();
		System.out.println(o4);
		MyClass.display();
		
		

	}

}
