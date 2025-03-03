package MiddleEarthCharacter;

public abstract class Human extends MiddleEarthCharacter{

		String name;
		double health;
		double power;
		
		public Human(String name, double health, double power) {
			super(name, health, power);
		}
}
