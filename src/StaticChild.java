
public class StaticChild extends StaticParent {

	public static void m1()
	{
		System.out.println("static child m1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticChild sc = new StaticChild();
		sc.m1();
		StaticParent sp = new StaticChild();
		sp.m1();
	}

}
