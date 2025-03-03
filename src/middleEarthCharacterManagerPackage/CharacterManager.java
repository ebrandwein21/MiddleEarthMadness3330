package middleEarthCharacterManagerPackage;

import MiddleEarthCharacter.MiddleEarthCharacter;

public class CharacterManager {
	
	MiddleEarthCharacter[] characters;
	int size;
	
	private CharacterManager(MiddleEarthCharacter[] characters, int size) {
		this.characters = characters;
		this.size = size;
	}
	
	boolean addCharacter(MiddleEarthCharacter c){
		return true;
	}
	
	MiddleEarthCharacter getCharacter(String name){
		return null;
	}
	
	boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power){
		return true;
	}
	
	boolean deleteCharacter(MiddleEarthCharacter character) {
		return true;
	}
	
	void displayAllCharacters() {
		
	}
	
	
	
}
