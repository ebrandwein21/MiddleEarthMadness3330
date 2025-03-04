package middleEarthCharacterManagerPackage;

import MiddleEarthCharacterPackage.Orc;
import MiddleEarthCouncilPackage.MiddleEarthCouncil;

public class Part3Test {
	public static void main(String[] args) {
	
	Orc orc = new Orc("Name", 1.0, 1.0);
	MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
	CharacterManager cm = council.getCharacterManager();
	System.out.println(cm.addCharacter(orc));
	
	}
}
