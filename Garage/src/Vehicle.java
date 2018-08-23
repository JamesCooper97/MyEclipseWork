
public abstract class Vehicle {
	private String type;
	private int price;
	private int engineSize;
	private String numberPlate;
	
	public Vehicle (String type, int price, int engineSize, String numberPlate) {
		this.type = type;
		this.price = price;
		this.engineSize = engineSize;
		this.numberPlate = numberPlate;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getNumberPlate() {
		return this.numberPlate;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
