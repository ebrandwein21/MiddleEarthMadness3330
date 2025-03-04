package MiddleEarthCharacter;

public abstract class Elf extends MiddleEarthCharacter {

		String name;
		double health;
		double power;
		
		
		public Elf(String name, double health, double power, MiddleEarthCharacter target) {
			super(name, health, power);
		}
		
		@Override
		public boolean attack(MiddleEarthCharacter target)
		{
			
			return true; //placeholder for now
		}
		
		@Override
		String getRace()
		{
			
			return "Elf"; //placeholder for now
		}
}
