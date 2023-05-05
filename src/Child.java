
public class Child extends Parent {

		void m1()
		{
			System.out.println("Child m1()");  //overriding method
		}
		void m2()
		{
			System.out.println("Child m2()");  //direct method
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Child();
		p.m1();  //compile time : Parent  , Run time : Child   //here only m1 method called of child class, the how you call m2 method of child class?
		//p.m2();  //compile time : Parent  , Run time : Compiler error
		Child c = (Child)p;  //perform the typecasting to call m2 method here
		                     //parent reference variabe convert to the child type and it return child type object
		c.m2();
	}

}
