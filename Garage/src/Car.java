
public class Car extends Vehicle {
	private int gloveBox;
	
	public Car(String type, String numberPlate, int price, int engineSize, int gloveBox) {

		super(type,price,engineSize,numberPlate);
		
		this.gloveBox = gloveBox;
		
	}	
}
