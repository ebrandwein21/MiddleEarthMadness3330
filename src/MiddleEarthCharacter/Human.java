package MiddleEarthCharacter;

public abstract class Human extends MiddleEarthCharacter{

		String name;
		double health;
		double power;
		
		public Human(String name, double health, double power, MiddleEarthCharacter target) {
			super(name, health, power);
		}
		
		@Override
		 boolean attack(MiddleEarthCharacter target)
		{
			super.attack(target);
			return true; //placeholder for now
		}
		 @Override
		  String getRace()
			{
				return "Human"; //placeholder for now
			}
}

