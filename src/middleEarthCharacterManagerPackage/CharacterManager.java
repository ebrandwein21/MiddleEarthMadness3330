package middleEarthCharacterManagerPackage;

import MiddleEarthCharacterPackage.MiddleEarthCharacter;

public class CharacterManager {
	
	MiddleEarthCharacter[] characters;
	int size;
	
	private CharacterManager(MiddleEarthCharacter[] characters, int size) {
		this.characters = characters;
		this.size = size;
	}
	
	boolean addCharacter(MiddleEarthCharacter c){
		if(characters.length == size){
			MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[2 * characters.length];
			System.arraycopy(c, 0, newArray, 0, size);
		}
		characters[size] = c;
		if(characters[size] == c) {
			size++;
			return true;
		}
		return false;
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
