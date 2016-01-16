package Lab3;

public class USMail extends MailSystem  {
	
	public USMail(String description, double weight, String zone) {
		super(description, weight, zone);
		
	}

	public double calculateCost(){
		double cost=0.0;
		if(getWeight()<3){
			cost=1;
		}
		cost=0.55*getWeight();
		return cost;
	}

}
