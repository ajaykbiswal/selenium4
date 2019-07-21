package abstractDemo1;

public class InterfacebankDemo {
	
	public static void main(String[]args){
		
		HDFC hdfcbank=new HDFC();
		hdfcbank.deposit();
		
		ICCIC iccicbank=new ICCIC();
		iccicbank.deposit();
		
		
		
		
	}

}

 class HDFC implements interfacebank{

	public void withdraw() 
	{
		System.out.println("HDFC withdrawn implementation");
		
	}

	public void deposit() {
		
		System.out.println("HDFC deposit implementation");
	}

	public void CalculateInterest() {
		
		System.out.println("HDFC CalculateInterest implementation");
	}
	
}
 
 class ICCIC implements interfacebank{

	public void withdraw() {
		System.out.println("ICCIC withdrawn implementation");
		
	}

	public void deposit() {
		System.out.println("ICCIC deposit implementation");
		
	}

	public void CalculateInterest() {
		System.out.println("ICCIC CalculateInterest implementation");
		
	}
	 
 }