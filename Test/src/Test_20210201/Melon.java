package Test_20210201;

public class Melon extends Food {

	private String cultivation;
	private String farm;

	
	public Melon(int calorie, int price, int weight, String cultivation, String farm ) {
		super(calorie, price, weight);
		this.cultivation = cultivation;
		this.farm = farm;
	}


	public String getCultivation() {
		return cultivation;
	}


	public void setCultivation(String cultivation) {
		this.cultivation = cultivation;
	}


	public String getFarm() {
		return farm;
	}


	public void setFarm(String farm) {
		this.farm = farm;
	}


	@Override
	public String toString() {
		return "Melon [cultivation=" + cultivation + ", farm=" + farm + ", getCalorie()=" + getCalorie()
				+ ", getPrice()=" + getPrice() + ", getWeight()=" + getWeight() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	

	
	
	
	
	
}
