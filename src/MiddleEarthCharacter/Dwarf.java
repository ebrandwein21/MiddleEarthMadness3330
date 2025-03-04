package MiddleEarthCharacter;

public abstract class Dwarf extends MiddleEarthCharacter{
		String name;
		double health;
		double power;
		
		public Dwarf(String name, double health, double power, MiddleEarthCharacter target) {
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
			
			return "Dwarf"; //placeholder for now
		}
}

