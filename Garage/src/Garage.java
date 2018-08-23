import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	public void addToGarage(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	public void priceCalculator() {
		for (Vehicle i : vehicles) {
			if (i instanceof Car) {
				int cost = i.getPrice();
				cost = cost / 5;
				System.out.println(i.getType() + " with number plate " + i.getNumberPlate() + " and the cost for fixing is " + cost);
			}
			if (i instanceof Car && i.getType().equals("peugeot")) {
				vehicles.remove(i);
			}
			if (i instanceof Car) {
				int cost = i.getPrice();
				cost = cost / 5;
				System.out.println(i.getType() + " with number plate " + i.getNumberPlate() + " and the cost for fixing is " + cost);
			}
		}
	}
}