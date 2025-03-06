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
      getCharacter runs through the characters array searching for the name parameter, regardless of case.
	 * @param name
	 * the name we are searching for
	 * @return If the name is found, the method will return the found character.
	 * If not, it will print that the name was not found and return null.
	 */
	
	public MiddleEarthCharacter getCharacter(String name){
		  for(int i = 0; i < size; i++) {
			if(name.equalsIgnoreCase(characters[i].getName())){
				 return characters[i];
			}
		  }
		System.out.println("Couldn't find character");
		return null;
	}
	
	
	/**
     update a character by changing its attributes and then checks if the character has been updated by comparing the updated attributes to the attributes assigned to the character 
	 * If the character does not exist, return that the name is false. if the character does exist and currently has different attributes then when first initialized, set these attributes and return true
	 * @param character, name, health, power
	 * the character and its updated attributes 
	 * @return false if the character is null, return true if character attributes have changed, returned false otherwise
	 */
	
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power){
		
		
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
	/**
    
     Deletes a character by iterating over the elements to get the index of the element that the user chooses to be deleted, sets it to null and then
	 * the elements to the right of the deleted character are then shifted to the left by one and the size of the array is also shrunk by 1. 
	 * @param character
	 * the character is used to help ensure the correct element is deleted
	 * @return true if the deletion is successful 
	 */	
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		
		int index = -1;
		
		for(int i = 0; i < size; i++)
		{
			if(characters[i].getName().equalsIgnoreCase(character.getName()))
			{
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			return false;
		}
		
		for(int j = index; j < size - 1; j++)
		{			
			characters[j] = characters[j + 1];
		}
<<<<<<< HEAD
		characters[size - 1] = null;
		size--;
=======
		characters[size -1] = null;
		size -= 1;
>>>>>>> 96fed8114e4825ade1faa829856e17339ca3b070
		return true;
	}
	
	/*
	
	 * Displays all characters in the characters list by checking iterating over the characters list and ensuring if the character is not null
	 */	
	public void displayAllCharacters() {
		for(MiddleEarthCharacter character : characters)
		{
			if(character != null)
			{
		  System.out.println("name:" + " " + character.getName() + " " + "health:" + " " + character.getHealth() + " " + "power:" + " " + character.getPower());
			}
			
		}
	}
}
	
	
	

