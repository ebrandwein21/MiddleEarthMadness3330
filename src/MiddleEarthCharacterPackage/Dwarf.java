package MiddleEarthCharacterPackage;


public class Dwarf extends MiddleEarthCharacter{
		String name;
		double health;
		double power;
		
		public Dwarf(String name, double health, double power) {
			super(name, health, power);
		}
		
		@Override
		public boolean attack(MiddleEarthCharacter target)
         {
			double damage;
			double specialPower = power * 1.5;
			
			if(target.getRace().equals("Wizard") || target.getRace().equals("Dwarf"))
				{
				    return false;
				}
			if(target.getRace().equals("Elf"))
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
			
			return "Dwarf"; //placeholder for now
		}
		
		@Override
		  void displayInfo()
		{
			super.displayInfo();
				
		}
}

