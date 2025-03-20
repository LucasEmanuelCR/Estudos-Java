package freightStrategy;

public class FreightCalculator {
	
	FreightStrategy freightStrategy;
	
	public void setFreightStrategy (FreightStrategy freightStrategy) {
		this.freightStrategy = freightStrategy;
	}
	public void checkout(double distance, double weight) {
		
		if(freightStrategy == null) {
			throw new IllegalStateException("Nenhuma estratégia de pagamento definida!");
		}
		
		double cost = freightStrategy.calculatorPrice(distance, weight);
		System.out.printf("O custo do frete é de R$%.2f\n", cost);
	}

}
