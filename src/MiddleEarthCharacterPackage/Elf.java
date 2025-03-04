package MiddleEarthCharacterPackage;

public class Elf extends MiddleEarthCharacter {

		String name;
		double health;
		double power;
		
		public Elf(String name, double health, double power) {
			super(name, health, power);
		}
		
		@Override
		 boolean attack(MiddleEarthCharacter target)
        {
			double damage;
			double specialPower = power * 1.5;

			if(target.getRace().equals("Dwarf") || target.getRace().equals("Elf"))
				{
				    return false;
				}
			if(target.getRace().equals("Orc"))
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
			return "Elf"; //placeholder for now
		}
		
		@Override
	     void displayInfo()
		{
			super.displayInfo();
		}
}
