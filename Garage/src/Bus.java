
public class Bus extends Vehicle {
	private int standingCap;
	
	public Bus(String type, int price, int engineSize, String numberPlate, int standingCap) {
		
		super(type,price,engineSize,numberPlate);
		
		this.standingCap = standingCap;
		
	}
}
