package middleEarthCharacterManagerPackage;

import MiddleEarthCharacterPackage.Orc;
import MiddleEarthCouncilPackage.MiddleEarthCouncil;
import MiddleEarthCharacterPackage.Human;

public class Part3Test {
	public static void main(String[] args) {
	
		//this is a test for part 3
	Human human = new Human("joe", 1.0, 1.0);
	Orc orc = new Orc("doug", 1.0, 1.0);
	MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
	CharacterManager cm = council.getCharacterManager();
	System.out.println(cm.addCharacter(human));
	System.out.println(cm.addCharacter(orc));
	System.out.println("doug");
	System.out.println(cm.updateCharacter(orc, "doug", 1, 1));
	System.out.println("joe");
	System.out.println(cm.updateCharacter(human, "joe", 1, 1));
	cm.displayAllCharacters();
	System.out.println(cm.deleteCharacter(orc));
	cm.displayAllCharacters();
	

	
	}
}
