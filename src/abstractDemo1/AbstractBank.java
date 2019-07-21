package abstractDemo1;

public class AbstractBank {
	
	public static void main(String[] args){
		
		System.out.println("HDFC BANK DETAILS....");
		HdfcC hdfcbank=new HdfcC();
		hdfcbank.withdraw();
		hdfcbank.deposit();
		hdfcbank.calculateinterset();
		System.out.println(" ");
		System.out.println("ICCIC BANK DETAILS....");
		ICCICB iccicbank=new ICCICB();
		iccicbank.withdraw();
		iccicbank.deposit();
		iccicbank.calculateinterset();
		
	}
	
}	
	
	
	abstract class bank{
		
		public void withdraw(){
			
			System.out.println("Common--WithDraw Fucntionality");
		}
		
		public void deposit(){
			
			System.out.println("Common--Deposit Fucntionality");
		}
		
	  abstract void calculateinterset();
	}

	
	class HdfcC extends bank
	{

		public void calculateinterset() {
			
			System.out.println("Differ--HDFC-calculateinterset functionality");
		}

		
		
	}
	
	class ICCICB extends bank
	{

		public void calculateinterset() {
			
			System.out.println("Differ--ICCIC-calculateinterset functionality");
		}

		
		
	}
	
	
	
	

