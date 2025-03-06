package MiddleEarthppPackage;

import MiddleEarthCouncilPackage.MiddleEarthCouncil;
import middleEarthCharacterManagerPackage.CharacterManager;

import java.util.Scanner;

import MiddleEarthCharacterPackage.Dwarf;
import MiddleEarthCharacterPackage.Elf;
import MiddleEarthCharacterPackage.Human;
import MiddleEarthCharacterPackage.MiddleEarthCharacter;
import MiddleEarthCharacterPackage.Orc;
import MiddleEarthCharacterPackage.Wizard;

public class MiddleEarthApp {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		CharacterManager cm = council.getCharacterManager();
		System.out.println("Hello, welcome to Middle Earth!");
		
		while(true){
			int userChoice;
			System.out.println("Would you like to: ");
			System.out.println("1. Add a new character");
			System.out.println("2. View all characters");
			System.out.println("3. Update a character");
			System.out.println("4. Delete a character");
			System.out.println("5. Exceucte all characters' attack actions");
			System.out.println("6. Exit");
			
			while(true){
				 userChoice = scanner.nextInt();
				if((userChoice < 1) || (userChoice > 6)){
					System.out.println("Choice must be 1-6, try again!");
				}
				else {
					break;
				}
			}
			
			/*
			 * User choice 1 asks the user for information about the character they wish to add including: Race, name, HP, and Power.
			 * It will then create a character of this description and add it to the character manager.
			 */
			if(userChoice == 1) {
				String name;
				double health;
				double power;
				
				System.out.println("What is your character's name?");
				name = scanner.next();
				
				System.out.println("How much health does your character have?");
				while(true) {
					try {
						health = scanner.nextDouble();
						break;
					} catch (Exception e) {
						System.out.println("Input must be a number");
						scanner.next();
					}
				}
				
				System.out.println("How much power does your character wield?");
				while(true) {
					try {
						power = scanner.nextDouble();
						break;
					} catch (Exception e) {
						System.out.println("Input must be a number");
						scanner.next();
					}
				}
				
				System.out.println("What race would you like your character to be?");
				
				int raceChoice;
				System.out.println("1. Dwarf");
				System.out.println("2. Elf");
				System.out.println("3. Human");
				System.out.println("4. Orc");
				System.out.println("5. Wizard");
				
				while(true){
					raceChoice = scanner.nextInt();
					if((raceChoice < 1) || (raceChoice > 5)){
						System.out.println("Choice must be 1-5, try again!");
					}
					else {
						break;
					}
				}
				if(raceChoice == 1) {
					Dwarf d = new Dwarf(name, health, power);
					cm.addCharacter(d);
				}
				else if(raceChoice == 2) {
					Elf e = new Elf(name, health, power);
					cm.addCharacter(e);
				}
				else if(raceChoice == 3) {
					Human h = new Human(name, health, power);
					cm.addCharacter(h);
				}
				else if(raceChoice == 4) {
					Orc o = new Orc(name, health, power);
					cm.addCharacter(o);
				}
				else if(raceChoice == 5) {
					Wizard w = new Wizard(name, health, power);
					cm.addCharacter(w);
				}
				System.out.println("Successfully added " + name + "!");
				continue;
			}
			
			/*
			 * User Choice 2 displays all characters currently in character array
			 */
			else if(userChoice == 2) {
				cm.displayAllCharacters();
			}
			else if(userChoice == 3) {
				
			}
			else if(userChoice == 4) {
				
			}
			else if(userChoice == 5) {
				
			}
			else if(userChoice == 6) {
				break;
			}
			continue;
		}
		scanner.close();
	}	
}
		


