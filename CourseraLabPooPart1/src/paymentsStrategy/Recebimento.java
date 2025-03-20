package paymentsStrategy;

public class Recebimento {
	PaymentsStrategy paymentsStrategy;
	
	public void setPaymentsStrategy(PaymentsStrategy paymentsStrategy) {
		this.paymentsStrategy = paymentsStrategy;
	}
	
	public void checkout(double amount) {
		if (paymentsStrategy == null) {
			throw new IllegalStateException("Nenhuma estratégia de pagamento definida!");
		}
		paymentsStrategy.pay(amount);
	}

}
