package MiddleEarthCouncilPackage;

import middleEarthCharacterManagerPackage.CharacterManager;

public class MiddleEarthCouncil {
	 
	private static MiddleEarthCouncil instance;
	
	/**
	 * made constructor private (empty) to prevent more than one instance being made
	 */
	private MiddleEarthCouncil()
	{
		
	}
	
	/**
	 * this is a static instance of the class called getInstance, it checks if the instance is null and creates a new (and the only) instance of the class 
	 * @return instance
	 * this returns the instance of the class so it can be used 
	 */
	
	private static MiddleEarthCouncil getInstance()
	{
		if(instance == null) {
			instance = new MiddleEarthCouncil();
			
		}
		return instance;
	}
	
	//CharacterManager getCharacterManager() {
		//return CharacterManager; // Placeholder, not sure if entirely correct implementation 
	//}
	
}
