package paymentsStrategy;

public class CreditCardPayment implements PaymentsStrategy{
	
	@Override
	public void pay(double amount) {
		System.out.println("Valor de R$" + amount + " foi recebido no CRÉDITO");
	}
}
