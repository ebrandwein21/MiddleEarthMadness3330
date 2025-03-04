package MiddleEarthCharacterPackage;

public abstract class MiddleEarthCharacter {

	private String name;
	private double health;
	private double power;
	
	/*
	 * this is a parameterized constructor that sets name, health and power to its current instance
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHealth() {
		return health;
	}
	
	public void setHealth(double health) {
		this.health = health;
		}
	
	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		this.power= power;
	}
	
	 abstract boolean attack(MiddleEarthCharacter target);
	
	 abstract String getRace();
	
	  void displayInfo() {

		System.out.println("Name" + " " + "=" + " " +  name);
		System.out.println("Health" + " " + "=" + " " + health);
		System.out.println("Power" + " " +  "=" + " " + power);	
	}
	 
	 
	 
	
	
	
	
}
