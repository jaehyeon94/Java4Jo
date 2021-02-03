package Test_20210201;

public class Food {

	private int calorie;
	private int price;
	private int Weight;
	
	public Food(int calorie, int price, int weight) {
		this.calorie = calorie;
		this.price = price;
		Weight = weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (Weight != other.Weight)
			return false;
		if (calorie != other.calorie)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}

	@Override
	public String toString() {
		return "Food [calorie=" + calorie + ", price=" + price + ", Weight=" + Weight + "]";
	}
	
	
	
	
	
	
}
