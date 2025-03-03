package MiddleEarthCharacter;

public abstract class Wizard extends MiddleEarthCharacter {

	    String name;
		double health;
		double power;
		MiddleEarthCharacter target;
		
		public Wizard(String name, double health, double power, MiddleEarthCharacter target;) {
			super(name, health, power);
			this.target = target;
		}
}
