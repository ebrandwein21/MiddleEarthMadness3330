package MiddleEarthCharacter;

public abstract class Orc extends MiddleEarthCharacter {
	
		String name;
		double health;
		double power;
		MiddleEarthCharacter target;
		
		public Orc(String name, double health, double power, MiddleEarthCharacter target) {
			super(name, health, power);
			this.target = target;
		}
}
