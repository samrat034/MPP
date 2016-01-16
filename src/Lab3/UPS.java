package Lab3;

public class UPS extends MailSystem  {
	
	public UPS(String description, double weight, String zone) {
		super(description, weight, zone);
		
		
	}

	public double calculateCost(){
		double cost=0.0;
		cost= 0.45*getWeight();
		return cost;
		
	}

}
