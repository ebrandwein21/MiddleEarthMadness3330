package MiddleEarthCharacter;

public abstract class Orc extends MiddleEarthCharacter {
	
		String name;
		double health;
		double power;
		
		public Orc(String name, double health, double power) {
			super(name, health, power);
		}
}
