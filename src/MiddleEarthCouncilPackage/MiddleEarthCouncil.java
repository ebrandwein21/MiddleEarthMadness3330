package MiddleEarthCouncilPackage;

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
	
	
	
}
