package MiddleEarthCharacter;

public abstract class Human extends MiddleEarthCharacter{

		String name;
		double health;
		double power;
		MiddleEarthCharacter target;
		
		public Human(String name, double health, double power, MiddleEarthCharacter target) {
			super(name, health, power);
			this.target = target; 
		}
}
