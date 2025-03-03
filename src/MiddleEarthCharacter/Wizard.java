package MiddleEarthCharacter;

public abstract class Wizard extends MiddleEarthCharacter {

	String name;
		double health;
		double power;
		
		public Wizard(String name, double health, double power) {
			super(name, health, power);
		}
}
