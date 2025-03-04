package middleEarthCharacterManagerPackage;

import MiddleEarthCharacterPackage.MiddleEarthCharacter;
import MiddleEarthCharacterPackage.Orc;

public class CharacterManager {
	
	MiddleEarthCharacter[] characters;
	int size;
	
	public CharacterManager() {
		
	}
	
	//Below constructor is commented out because not sure yet if it will be needed in final version.
	
	
//	/**
//	 * 
//	 * this is a parameterized constructor that sets characters and size to its current instance
//	 * @param characters, size
//	 * Characters represents the character array and size represents the size of the array.
//	 */
//	public CharacterManager(MiddleEarthCharacter[] characters, int size) {
//		this.characters = characters;
//		this.size = size;
//	}
	
	
	
	/**
	 * This is a method allowing the user to add a character to the character array. If the array is null,
	 * it will instantiate a new array and if it is full it will create a new one double the size and copy
	 * the information over.
	 * @param c
	 * Character the user would like to add to the array.
	 * @return True on success and false on failure.
	 */
	public boolean addCharacter(MiddleEarthCharacter c){
		if(characters == null) {
			MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[1];
			characters = newArray;
		}
		if(characters.length == size){
			MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[2 * characters.length];
			System.arraycopy(characters, 0, newArray, 0, size);
			characters = newArray;
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
