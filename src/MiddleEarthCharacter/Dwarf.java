package MiddleEarthCharacter;

public abstract class Dwarf extends MiddleEarthCharacter{
		String name;
		double health;
		double power;
		
		public Dwarf(String name, double health, double power) {
			super(name, health, power);
		}
}
