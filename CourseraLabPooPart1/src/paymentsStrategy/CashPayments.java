package paymentsStrategy;

public class CashPayments implements PaymentsStrategy{
	
	@Override
	public void pay(double amount) {
		System.out.println("Valor R$" + amount + " foi recebido pem DINHEIRO");
	}

}
