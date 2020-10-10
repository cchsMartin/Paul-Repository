/* 1. Color
 * 2. Model
 * 3. Speed
 */
public class car {
	private String color = "Red";
	private String type = "Sports";
	private int gas;
	
	public car() {
		gas = 120;
	}
	
	public void newGas() {
		gas = gas - 8;
		
	}
	public int returnSpeed() {
		return gas;
	}
	
	public void carModelSports() {
		String sport = type;
	}
	
	public void carModelTruck() {
		String truck = type;
	}
	/*
	public void carColorRed() {
		String selectedColor = color;
	}
	
	public void carColorBlue() {
		String blue = color;
	}
	public void carColorBlack() {
		String black = color;
	}
	public void carColorWhite() {
		String white = color;
	}
	*/
	public void displayVal() {
		System.out.println("The Color of the Car is: " + color);
		System.out.println("The Car Type is: " + type);
		
	}
	public void displayOldGas() {
		System.out.println("The Amount of Gas in the Previous Trip was: " + gas + " Miles.");
	}
	
	public void displayGas() {
		System.out.println("The Current Amount of gas in the car is: " + gas + " Miles.");
	}
	 
}
