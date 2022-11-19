/**
 * 
 */
package week1.day1;

/**
 * @author Vaidyanathan
 * @class  05-Nov-2022
 */
public class Car {

	/**
	 * @param args
	 */
	public void driveCar() {
		System.out.println("Driving a car...");
		
	}
	
	public void applyBrake() {
		System.out.println("Applied Brake");
	}
	
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBrake();

	}

}
