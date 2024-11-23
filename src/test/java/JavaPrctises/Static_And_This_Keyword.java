package JavaPrctises;

public class Static_And_This_Keyword {

	static int a = 10;

	int b = 20;

	void test() {

		int a = 30;
		int b = 40;
		System.out.println(a);
		System.out.println(b);

		System.out.println(Static_And_This_Keyword.a);
		System.out.println(this.b);

	}

}

//sub class

class Demo2 extends Static_And_This_Keyword {

	static int a = 50;

	int b = 60;

	void view() {

		int a = 70;
		int b = 80;

		// local variables
		System.out.println(a);
		System.out.println(b);

		// Accessing global variables of current class
		System.out.println(Demo2.a);
		System.out.println(this.b);

		// accessing global variable of super class
		System.out.println(Static_And_This_Keyword.a);
		System.out.println(super.b);

	}

}
