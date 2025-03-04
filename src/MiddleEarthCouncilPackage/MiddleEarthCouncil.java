package MiddleEarthCouncilPackage;

import middleEarthCharacterManagerPackage.CharacterManager;

public class MiddleEarthCouncil {
	 
	private static MiddleEarthCouncil instance;
	private static CharacterManager instance1;
	
	
	/**
	 * made constructor private (empty) to prevent more than one instance being made
	 */
	private MiddleEarthCouncil()
	{
		
	}
	
	/**
	 * this is a static instance of the class called getInstance,
	 * it checks if the instance is null and creates a new (and the only) instance of the class 
	 * @return instance
	 * this returns the instance of the class so it can be used 
	 */
	
	public static MiddleEarthCouncil getInstance()
	{
		if(instance == null) {
			instance = new MiddleEarthCouncil();
			
		}
		return instance;
	}
	
	/**
	 * this is an instance of the class called getCharacterManager,
	 * it checks if the instance is null and creates a new (and the only) instance of the class 
	 * @return instance1
	 * this returns the instance of the class so it can be used 
	 */
	public CharacterManager getCharacterManager() {
		if(instance1 == null) {
			instance1 = new CharacterManager();
		}
		return instance1;
	}
	
}
