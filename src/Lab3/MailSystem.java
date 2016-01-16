package Lab3;

public abstract class MailSystem implements IMailSystem{
	private String description;
	private double weight;
	private String zone;
	
	//public abstract double calculateCost();

	public MailSystem(String description, double weight, String zone) {
		super();
		this.description = description;
		this.weight = weight;
		this.zone = zone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	

}
