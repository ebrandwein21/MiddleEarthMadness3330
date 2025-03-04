package MiddleEarthCharacterPackage;

public class Wizard extends MiddleEarthCharacter {

	    String name;
		double health;
		double power;
		
		public Wizard(String name, double health, double power) {
			super(name, health, power);
		}
		
		@Override
		public boolean attack(MiddleEarthCharacter target)
        {
			double damage;
			double specialPower = power * 1.5;

			if(target.getRace().equals("Human") || target.getRace().equals("Wizard"))
				{
				    return false;
				}
			if(target.getRace().equals("Dwarf"))
			{
				damage = getPower() + specialPower;
				target.setHealth(target.getHealth() - damage);	
			}
			damage = getPower();
			target.setHealth(target.getHealth() - damage);
			return true;
		}
		
		@Override
		String getRace()
		{
			return "Wizard"; //placeholder for now
		}
		
		@Override
	     void displayInfo()
		{
			super.displayInfo();
		}
}
