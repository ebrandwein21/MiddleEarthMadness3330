package MiddleEarthCharacter;

public abstract class Wizard extends MiddleEarthCharacter {

	    String name;
		double health;
		double power;
		
		public Wizard(String name, double health, double power, MiddleEarthCharacter target) {
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
			
			return "Wizard"; //placeholder for now
		}
}
