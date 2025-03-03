package MiddleEarthCharacter;

public abstract class Elf extends MiddleEarthCharacter {

		String name;
		double health;
		double power;
		MiddleEarthCharacter target;
		
		public Elf(String name, double health, double power, MiddleEarthCharacter target) {
			super(name, health, power);
			this.target = target;
		}
}
