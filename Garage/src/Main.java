
public class Main {

	public static void main(String[] args) {
		//Do Something
		
		Car peugeot = new Car("peugeot", "X191 TCP", 500, 1200, 6);
		Car toyota = new Car("toyota", "TP01 7GH", 600, 2000, 5);
		
		Garage Veh = new Garage();
		
		Veh.addToGarage(peugeot);
		Veh.priceCalculator();
	}
}
