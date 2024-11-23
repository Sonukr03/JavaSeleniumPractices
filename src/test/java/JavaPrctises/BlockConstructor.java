package JavaPrctises;

public class BlockConstructor {
	
	{
		System.out.println("in non Static class block");
		
	//	BlockConstructor b2= new BlockConstructor();
	}
	
	static {
		System.out.println("in Static class block ");
	}
	
	public BlockConstructor()
	{
		System.out.println("in constructor");
	}

	public static void main(String[] args) {
		
		BlockConstructor b1= new BlockConstructor();
		
		System.out.println("first line of main method");
		
		{
			System.out.println("main non static block");
		}
		
		//BlockConstructor b1= new BlockConstructor();
		
		
		
		
		
		System.out.println("end main block");
	}
}
