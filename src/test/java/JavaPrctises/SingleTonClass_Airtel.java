package JavaPrctises;

public class SingleTonClass_Airtel {

	static SingleTonClass_Airtel airtel;
	double balance = 0.0;

	private SingleTonClass_Airtel() {
		System.out.println("numberActivated");
	}

	void recharge(double amount) {

		System.out.println("Raching with amount : " + amount);
		balance = balance + amount;
		System.out.println("new updated balance is : " + balance);

	}
	
	static SingleTonClass_Airtel getAirtelObject() {
		
		if(airtel==null) {
			airtel= new SingleTonClass_Airtel();
		}
		
		return airtel;
	}

}
