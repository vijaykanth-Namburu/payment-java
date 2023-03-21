package paymentmethod;

public class Result {

	public static void main(String[] args) {
		
		Cashpayment cp = new Cashpayment("Tshirt",886023190,700);
		cp.pay();
		Creditpayment crp = new Creditpayment("Sweater",8884567,400);
		crp.pay();

	}

}
