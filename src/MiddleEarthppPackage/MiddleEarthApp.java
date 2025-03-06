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
			
			while(true)
			{
			    userChoice = scanner.nextInt();
				if((userChoice < 1) || (userChoice > 6))
				{
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
			if(userChoice == 1) 
			{
				String name;
				double health;
				double power;
				
				System.out.println("What is your character's name?");
				name = scanner.next();
				
				System.out.println("How much health does your character have?");
				while(true) 
				{
					try 
					{
						health = scanner.nextDouble();
						break;
					} 
					catch (Exception e) 
					{
						System.out.println("Input must be a number");
						scanner.next();
				    }
			    }
				
				System.out.println("How much power does your character wield?");
				while(true) 
				{
					try 
					{
						power = scanner.nextDouble();
						break;
					} catch (Exception e) 
					{
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
				
				while(true)
				{
					raceChoice = scanner.nextInt();
					if((raceChoice < 1) || (raceChoice > 5))
					{
						System.out.println("Choice must be 1-5, try again!");
					}
					else 
					{
						break;
					}
				}
				if(raceChoice == 1) 
				{
					Dwarf d = new Dwarf(name, health, power);
					cm.addCharacter(d);
				}
				else if(raceChoice == 2) 
				{
					Elf e = new Elf(name, health, power);
					cm.addCharacter(e);
				}
				else if(raceChoice == 3) 
				{
					Human h = new Human(name, health, power);
					cm.addCharacter(h);
				}
				else if(raceChoice == 4) 
				{
					Orc o = new Orc(name, health, power);
					cm.addCharacter(o);
				}
				else if(raceChoice == 5) 
				{
					Wizard w = new Wizard(name, health, power);
					cm.addCharacter(w);
				}
				System.out.println("Successfully added " + name + "!");
				continue;
			}
			
			/*
			 * User Choice 2 displays all characters currently in character array if the amount of characters is more than 0 
			 */
			else if(userChoice == 2) 
			{
				if(cm.size > 0)
				{
				cm.displayAllCharacters();
				}
				else
				{
					System.out.println("there are no characters");
				}
			}
			
			/*
			 * User Choice 3 updates a character of the user's choice and allows them to change the character's name,
			 * HP, and power. The character will then be updated with this new information. 
			 */
			else if(userChoice == 3) 
			{
				MiddleEarthCharacter c;
				String name;
				int health;
				int power;
				
				System.out.println("Which character would you like to update?");
				while(true) 
				{
					c = cm.getCharacter(scanner.next());
					if(c == null) 
					{
						System.out.println("Try again");
					}
					else 
					{
						break;
					}
				}
				System.out.println("What would you like this character's new name to be?");
				name = scanner.next();
				
				System.out.println("What would you like this character's new health to be?");
				while(true)
				{
					try 
					{
						health = scanner.nextInt();
						break;
					} catch (Exception e)
					{
						System.out.println("Input must be a whole number");
						scanner.next();
					}
				}
				
				System.out.println("What would you like this character's new power to be?");
				while(true) 
				{
					try
					{
						power = scanner.nextInt();
						break;
					} catch (Exception e) 
					{
						System.out.println("Input must be a whole number");
						scanner.next();
					}
				}
				
				cm.updateCharacter(c, name, health, power);
				
			}	
			/*
			 * user choice four asks the user if the character would like to be deleted and will delete the character if the character is not null 
			 */
			
			else if(userChoice == 4) 
			{
				MiddleEarthCharacter c;
				
				System.out.println("would you like to delete a character?");
				while(true) 
				{
					c = cm.getCharacter(scanner.next());
					System.out.println("character to be deleted");
					if(c == null) {
						System.out.println("Try again");
				}
				else 
				{
				   break;
				}
			}
				cm.deleteCharacter(c);
			}
			/*
			 * user choice five asks the user if they would like to execute all attacks for the available character if there are two or more characters or available
			 * each character is looped through as an attacker [represented by i] or a target [represented by j]
			 */
			else if(userChoice == 5) 
			{
			    System.out.println("Would you like to execute all attacks?");
			    
			    if (cm.size < 2) 
			    {
			        System.out.println("Error: No characters or not enough characters to execute attacks.");
			    } 
			    else 
			    {
			        for(int i = 0; i < cm.size; i++) 
			        {
			            for (int j = 0; j < cm.size; j++) 
			            {
			                MiddleEarthCharacter attacking = cm.characters[i];
			                MiddleEarthCharacter targeted = cm.characters[j];
			                attacking.attack(targeted); 
			            }
			        }
			    }    
			}
			/*
			 * breaks if the user wants to quit
			 */
			else if (userChoice == 6) 
			{
			    scanner.close();	
			    break;
			}
			continue;
		}
	}
}
			
			
		