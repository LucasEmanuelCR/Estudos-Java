package freightStrategy;

public class CarFreight implements FreightStrategy{
	
	@Override
	public double calculatorPrice(double distance, double weight) {
		
		double fraghtCost = (0.5 + distance) + (0.08 * weight);
		
		return fraghtCost;
	}
	
}
