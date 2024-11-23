package JavaPrctises;

public class SuperAndThis_Statement_Constructor {

	SuperAndThis_Statement_Constructor() {
		
		this("Hi");
		System.out.println("running zero Arg constructor");

	}

	SuperAndThis_Statement_Constructor(int a) {
		
		this();
		System.out.println("running int agr constructor..");

	}

	SuperAndThis_Statement_Constructor(String s) {

		System.out.println("runing string  arg constructor");
		
	}

	public static void main(String[] args) {

		System.out.println("main method started");

		SuperAndThis_Statement_Constructor s = new SuperAndThis_Statement_Constructor(2);

		System.out.println("main method ended");

	}

}
