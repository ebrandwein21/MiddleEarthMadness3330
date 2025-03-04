package MiddleEarthCharacterPackage;

public abstract class MiddleEarthCharacter {

	private String name;
	private double health;
	private double power;
	
	/**
	 * 
	 * this is a parameterized constructor that sets name, health and power to its current instance
	 * @param name, health, power
	 * name represents the name of the character (seperate from the race of the character as name is an identifier and race is a type) 
	 * health represents the amount of damage a character has (or hasn't taken, will start at 100 for all characters)
	 * power represents the amount of damage each attack will do to a character, this will vary between characters and the amount of power ones attack has is the exact amount of health the victim will lose
	 * 
	 */
	
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	 /**
	 * @return name
	 * returns the value of the name 
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * sets the name attribute so they can be stored and modified
	 * @param  name
	 * sets the string attribute name to the current instance of itself 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return health
	 * returns the amount of health a character has; 
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * sets the health attribute so they can be stored and modified, this was extremely hopeful while developing the attack method as we were able to update the health by setting the health to the initialized amount subtracted by the damage taken
	 * @param health
	 * sets the double value of health to the current instance of itself
	 */
	
	public void setHealth(double health) {
		this.health = health;
		}
	/**
	 * @return power
	 * returns the amount of power a character has; 
	 */
	
	public double getPower() {
		return power;
	}
	
	/**
	 * sets the power attribute so they can be stored and modified
	 * @param  power
	 * sets the double value of power to the current instance of itself
	 */
	
	public void setPower(double power) {
		this.power= power;
	}
	
	/**
	 * an abstract boolean method that can not be implemented on in the parent class but will be used in the subclasses to all achieve the same goal of determining attack values, but implemented slightly differently 
	 * @param  target
	 * initializes a variable of the MiddleEarthCharacter class called target that will represent the five subclasses(characters)
	 */
	
	 abstract boolean attack(MiddleEarthCharacter target);
	/**
	 * an abstract String method that can not be implemented on in the parent class, will be used to return each characters race for the target attribute in string form
	 * 
	 */
	 abstract String getRace();
	
	 /**
         * a concrete method that displays the name, health and power of each character
		 * the concrete method is called in the parent class because all the subclasses use the same exact method with no variation (at least for now)
		 */
	  void displayInfo() {

		System.out.println("Name" + " " + "=" + " " +  name);
		System.out.println("Health" + " " + "=" + " " + health);
		System.out.println("Power" + " " +  "=" + " " + power);	
	}
	 
}
