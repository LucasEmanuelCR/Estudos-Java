package freightStrategy;

public class VanFreight implements FreightStrategy {
	@Override
	public double calculatorPrice(double distance, double weight) {
		double freightCost = (1.00 * distance) + (0.20 + weight);
		return freightCost;
	}

}
