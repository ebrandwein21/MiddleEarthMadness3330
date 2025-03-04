package MiddleEarthCharacter;

public abstract class Orc extends MiddleEarthCharacter {
	
		String name;
		double health;
		double power;
		
		public Orc(String name, double health, double power, MiddleEarthCharacter target) {
			super(name, health, power);
		}
		
		@Override
	    boolean attack(MiddleEarthCharacter target)
		{
			return true; //placeholder for now
		}
		
		@Override
		String getRace()
		{
			
			return "Orc"; //placeholder for now
		}
}

