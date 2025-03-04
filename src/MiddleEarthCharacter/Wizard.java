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
			
			if(target.getRace().equals("Human") || target.getRace().equals("Wizard"))
				{
				    return false;
				}
			if(target.getRace().equals("Dwarf"))
			{
				power = power * 1.5;
			}
			return true;
		}
		
		@Override
		String getRace()
		{
			
			return "Wizard"; //placeholder for now
		}
}
