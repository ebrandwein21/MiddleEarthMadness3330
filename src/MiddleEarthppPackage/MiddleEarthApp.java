package MiddleEarthppPackage;

import MiddleEarthCouncilPackage.MiddleEarthCouncil;
import middleEarthCharacterManagerPackage.CharacterManager;

import java.util.Scanner;

public class MiddleEarthApp {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		CharacterManager cm = council.getCharacterManager();
		System.out.println("Hello, welcome to Middle Earth!");
		while(true){
			System.out.println("Would you like to: ");
			System.out.println("1. Add a new character");
			System.out.println("2. View all characters");
			System.out.println("3. Update a character");
			System.out.println("4. Delete a character");
			System.out.println("5. Exceucte all characters' attack actions");
			System.out.println("6. Exit");
			
			if(scanner.nextInt() == 1) {
				
			}
			if(scanner.nextInt() == 2) {
				
			}
			if(scanner.nextInt() == 3) {
				
			}
			if(scanner.nextInt() == 4) {
				
			}
			if(scanner.nextInt() == 5) {
				
			}
			if(scanner.nextInt() == 6) {
				break;
			}
		}
		scanner.close();
	}
		
}

