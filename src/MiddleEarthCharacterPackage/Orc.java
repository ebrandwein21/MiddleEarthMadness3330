package MiddleEarthCharacterPackage;

public class Orc extends MiddleEarthCharacter {
	
		String name;
		double health;
		double power;
		
		public Orc(String name, double health, double power) {
			super(name, health, power);
		}
		
		@Override
		public boolean attack(MiddleEarthCharacter target)
        {
			double damage;
			double specialPower = power * 1.5;

			if(target.getRace().equals("Orc") || target.getRace().equals("Elf"))
				{
				    return false;
				}
			if(target.getRace().equals("Human"))
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
			return "Orc"; //placeholder for now
		}
		
		@Override
		 void displayInfo()
		{
			super.displayInfo();
		}
}

