package MiddleEarthCharacter;

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
	
	public void setBook(String name) {
		this.name = name;
	}
	
	public double getHealth() {
		return health;
	}
	
	public void setAuthor(double health) {
		this.health = health;
	}
	
	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		this.power= power;
	}
	
	public boolean attack(MiddleEarthCharacter target) {
		
		
		return true; //placeholder for now
	}
	
	public String getRace()
	{
		return "hi"; //placeholder for now
	}
	
	void displayInfo() {
		
	}
	
	
	
	
}
