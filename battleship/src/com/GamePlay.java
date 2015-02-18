package com;

import java.util.ArrayList;
import java.util.List;

public class GamePlay implements Shoot {
	

	public static void main(String[] args) {
//		List<String> fields = readingShipsFromFile();
//		List<Ship> ships = loadShipPatterns(fields);
//		
//		for (Ship ship : ships) {
//			System.out.println(ship);
//		}
		
		
		Ship[] ships = new Ship[] {
	            new Ship(1),
	            new Ship(3),
	            new Ship(2),
	            new Ship(3),
	            new Ship(12)
	    };
	    BattleShipBoard battleshipBoard = new BattleShipBoard(20, 10);
	    battleshipBoard.place(ships);
	    battleshipBoard.printBoard();
	}

	private static List<String> readingShipsFromFile() {
		return FileHandler.loadEntireFile("ships");
	}
	
	public static List<Ship> loadShipPatterns(List<String> lines) {
		List<Ship> ships = new ArrayList<Ship>();
		int patternRowIndex = 0;
		boolean[][] currentPattern = new boolean[4][4];
		for (String line : lines) {
			if (patternRowIndex == 4) {
				int piecesOfThisType = Integer.parseInt(line);
				for (int i = 0; i < piecesOfThisType; i++) {
					ships.add(new Ship(currentPattern));
				}
				currentPattern = new boolean[4][4];
				patternRowIndex = 0;
			} else {
				for (int patternColumnIndex = 0; patternColumnIndex < line
						.length(); patternColumnIndex++) {
					char currentCharacter = line.charAt(patternColumnIndex);
					if (Character.toLowerCase(currentCharacter) == 'x') {
						currentPattern[patternRowIndex][patternColumnIndex] = true;
					} else {
						currentPattern[patternRowIndex][patternColumnIndex] = false;
					}
				}
				patternRowIndex++;
			}
		}
		return ships;
	}
	
	@Override
	public void shooting() {
		// TODO Auto-generated method stub
		
	}

}
