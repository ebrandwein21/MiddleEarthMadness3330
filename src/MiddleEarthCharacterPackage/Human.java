package MiddleEarthCharacterPackage;

public class Human extends MiddleEarthCharacter{

		String name;
		double health;
		double power;
		
		public Human(String name, double health, double power) {
			super(name, health, power);
		}
		
		@Override
		public boolean attack(MiddleEarthCharacter target)
        {
			double damage;
			double specialPower = power * 1.5;
			
			if(target.getRace().equals("Orc") || target.getRace().equals("Human"))
				{
				    return false;
				}
			if(target.getRace().equals("Wizard"))
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
				return "Human"; //placeholder for now
			}
		 
		 @Override
		   void displayInfo()
			{
			    super.displayInfo();
			}
}

