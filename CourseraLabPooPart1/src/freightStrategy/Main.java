package freightStrategy;

public class Main {
	public static void main(String[] args) {
		FreightCalculator freightCalculator = new FreightCalculator();
		
		freightCalculator.setFreightStrategy(new CarFreight());
		freightCalculator.checkout(100, 600);

		freightCalculator.setFreightStrategy(new TrunkFreight());
		freightCalculator.checkout(100, 600);
		
		freightCalculator.setFreightStrategy(new VanFreight());
		freightCalculator.checkout(100, 600);
		
	}

}
