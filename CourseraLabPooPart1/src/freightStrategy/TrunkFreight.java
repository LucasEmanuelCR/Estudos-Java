package freightStrategy;

public class TrunkFreight implements FreightStrategy {
	@Override
	public double calculatorPrice(double distance, double weight) {
		
		double freightCost = (2.00 + distance) + (0.1 * weight);
		
		return freightCost;
	}

}
