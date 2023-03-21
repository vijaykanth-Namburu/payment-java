package paymentmethod;

public class Creditpayment implements Payment{
	
	public Creditpayment(String ordername, long orderid,long amount)
	{
		String on = ordername;
		System.out.println("Item name:"+on);
		
		long oi = orderid;
		System.out.println("Item id:"+oi);
		
				
		long cash = amount;
		System.out.println("Amount paid :"+cash);
	}
	
	public void pay() 
	{
		System.out.println("This is creditcard payment method");
	}
}