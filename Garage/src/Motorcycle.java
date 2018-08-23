
public class Motorcycle extends Vehicle {
	private int reach;
	
	public Motorcycle(String type, String numberPlate, int price, int engineSize, int reach) {

		super(type,price,engineSize,numberPlate);
		
		this.reach = reach;

	}
}