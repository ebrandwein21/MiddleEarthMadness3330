package middleEarthCharacterManagerPackage;

import MiddleEarthCharacterPackage.MiddleEarthCharacter;
import MiddleEarthCharacterPackage.Orc;
import MiddleEarthCharacterPackage.Human;
import MiddleEarthCharacterPackage.Wizard;
import MiddleEarthCharacterPackage.Dwarf;
import MiddleEarthCharacterPackage.Elf;


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
	
	/**
      call a character by name by checking if the character name exists
	 * If the character name does not exist, return that the name is null, if the character does exist, print name 
	 * @param name
	 * the name we are printing
	 * @return null if the character name is empty or wrong
	 */
	
	
	MiddleEarthCharacter getCharacter(String name){
		  for(MiddleEarthCharacter newCharacter : characters)
			if(!name.equals(null))
			{
				 System.out.println(newCharacter.getName());
			} 
		return null;
	}
	
	
	/**
     update a character by changing its attributes and then checks if the character has been updated by comparing the updated attributes to the attributes assigned to the character 
	 * If the character does not exist, return that the name is false. if the character does exist and currently has different attributes then when first initialized, set these attributes and return true
	 * @param character, name, health, power
	 * the character and its updated attributes 
	 * @return false if the character is null, return true if character attributes have changed, returned false otherwise
	 */
	
	boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power){
		
		
		if(character == null)
		{
			return false;
		}
		if(!character.getName().equals(name) || character.getHealth() != health || character.getPower() != power) {
			character.setPower(power);
			character.setName(name);
			character.setHealth(health);
			return true;
		}
		return false;
	}
		
	boolean deleteCharacter(MiddleEarthCharacter character) {
		
		int index = 0;
		
		for(int i = 0; i < size; i++)
		{
			if(characters[i].getName() == character.getName())
			{
				index = i;
			}
		}
		characters[index] = null;
		
		for(int j = index; j < size - 1; j++)
		{
			//we want to delete the element at i and shift all elements to the the right left
			
			characters[j] = characters[j + 1];
			
		}
		size -= 1;
		return false;
		
	}
	
	public void displayAllCharacters() {
		for(MiddleEarthCharacter character : characters)
		{
			try {
		  System.out.println("name:" + " " + character.getName() + " " + "health:" + " " + character.getHealth() + " " + "power:" + " " + character.getPower());
			}
			catch(NullPointerException e)
			{
				System.out.print("NullPointerException caught");
			}
		}
	}
	
	
	
}
