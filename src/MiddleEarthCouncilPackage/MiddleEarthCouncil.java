package MiddleEarthCouncilPackage;

import middleEarthCharacterManagerPackage.CharacterManager;

public class MiddleEarthCouncil {
	 
	private static MiddleEarthCouncil instance;
	
	private MiddleEarthCouncil()
	{
		
	}
	
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
