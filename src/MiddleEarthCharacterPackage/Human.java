package MiddleEarthCharacterPackage;

public class Human extends MiddleEarthCharacter{

		String name;
		double health;
		double power;
		
		public Human(String name, double health, double power) {
			super(name, health, power);
		}
		
		/**
		 * 
		 * first initializes a double variable damage and a double variable specialPower that is 1.5x stronger than the default effectiveness of the attack, then checks if the target can be fought against by verifying the target's race
		 * if the target is incompatible with the character, return false and do not deal any damage to the target, if the target is extra suceptible to our attacks, multiply the damage by 1.5x and update the health to the new target's health status following the attack
		 * if the target is neither extra susceptible to the attack nor incompatible, deal the normal amount of damage and update the damage to reflect the attack aftermath
		 * 
		 * @param target
		 * represents a character who we are potentially attacking
		 * 
		 * @return 
		 * If the  target is ineffective against our attacks return false(Orc and Human), 
		 * if the target is extremely susceptible to our attacks (Wizard), give 1.5x damage, if the target is normal effectiveness against our attacks, return true (Dwarf and Elf)
		 */
		
		@Override
		 boolean attack(MiddleEarthCharacter target)
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
		
		/*
		 * @return "Human"
		 * returns the race of the character in string form (in this case Human), this is used in the attack method as well, to identify and differentiate each character
		 */
		 @Override
		  String getRace()
			{
				return "Human"; //placeholder for now
			}
		 /*
			 * left the concrete method in subclasses the same as parent method (at least for now) because they all implement the same thing as the parent class and overwriting the parent class causes the values to null
			 * calls the display method of the parent class with the super keyword
			 */
		 @Override
		  public void displayInfo()
			{
			    super.displayInfo();
			}
}

