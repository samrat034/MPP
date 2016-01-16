package Lab3;

public class FedEx extends MailSystem {

	public FedEx(String description, double weight, String zone) {
		super(description, weight, zone);
		
	}
	
	public double calculateCost(){
		double cost=0.0;
		if(getZone()=="IA" || getZone()=="MT" || getZone()=="OR" || getZone()=="CA"){
			cost=0.35*getWeight();
			
		}else if(getZone()=="TX" || getZone()=="UT"){
			cost=0.30*getWeight();
		}else if(getZone()=="FL" || getZone()=="MA" || getZone()=="OH"){
			
			cost=0.55*getWeight();
		}else{
			cost=0.43*getWeight();
		}
		
		return cost;
	}
	

}
