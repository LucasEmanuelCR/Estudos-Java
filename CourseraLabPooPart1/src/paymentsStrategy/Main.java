package paymentsStrategy;

public class Main {
	public static void main(String[] args) {
		
		Recebimento rec = new Recebimento();
		
		
		// rec.checkout(100);
		
		//Realizando um recebimento em dinheiro
		rec.setPaymentsStrategy(new CashPayments());
		rec.checkout(100);
		
		rec.setPaymentsStrategy(new CreditCardPayment());
		rec.checkout(200);
		
	}

}
