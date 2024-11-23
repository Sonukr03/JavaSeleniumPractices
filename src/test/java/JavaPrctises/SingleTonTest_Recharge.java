package JavaPrctises;

public class SingleTonTest_Recharge {
	
	public static void main(String[] args) {
		
		SingleTonClass_Airtel amazone= SingleTonClass_Airtel.getAirtelObject();
		System.out.println("amazone "+ amazone);
		amazone.recharge(200.0);
		
		SingleTonClass_Airtel phonePe= SingleTonClass_Airtel.getAirtelObject();
		System.out.println("phonePe "+phonePe);
		phonePe.recharge(400.0);
		
	}

}
