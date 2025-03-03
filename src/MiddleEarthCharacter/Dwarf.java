package MiddleEarthCharacter;

public abstract class Dwarf extends MiddleEarthCharacter{
		String name;
		double health;
		double power;
		MiddleEarthCharacter target;
		
		public Dwarf(String name, double health, double power, MiddleEarthCharacter target) {
			super(name, health, power);
			this.target = target;
		}
}
