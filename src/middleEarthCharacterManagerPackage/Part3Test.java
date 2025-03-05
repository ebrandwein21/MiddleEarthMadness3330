package middleEarthCharacterManagerPackage;

import MiddleEarthCharacterPackage.Orc;
import MiddleEarthCouncilPackage.MiddleEarthCouncil;
import MiddleEarthCharacterPackage.Human;

public class Part3Test {
	public static void main(String[] args) {
	
	Human human = new Human("joe", 1.0, 1.0);
	Orc orc = new Orc("doug", 1.0, 1.0);
	MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
	CharacterManager cm = council.getCharacterManager();
	System.out.println(cm.addCharacter(orc));
	System.out.println(cm.updateCharacter(orc, "doug", 10, 10));
	System.out.println(cm.getCharacter("doug"));
	System.out.println(cm.addCharacter(human));
	

	
	}
}
