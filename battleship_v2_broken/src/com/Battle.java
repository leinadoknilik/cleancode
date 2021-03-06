package com;

import java.util.Random;

public class Battle implements Hit {
	static final int ROW = 10;
	static final int COLUMN = 10;
	static int[][] battlefield = new int[ROW][COLUMN];
	Random random = new Random();
	 static int[][] ships = new int[4][2];

	// Battlefield initialization
	public void initBattlefield() {
		for (int row = 0; row < ROW; row++)
			for (int column = 0; column < COLUMN; column++)
				battlefield[row][column] = -1;
	}

	// Ships initialization
	public void initShips() {

		for (int row = 0; row < battlefield.length; row++) {
			for (int colum = 0; colum < battlefield[0].length; colum++) {
				if (battlefield[row][colum]==0);
			}
		}

	}
	

	// Implement the shooting() from Hit interface
	public boolean shooting() {

		int shootedRow = random.nextInt(ROW);
		int shootedColumn = random.nextInt(COLUMN);
		
		System.out.println("Target field: [" + shootedRow + "]["
				+ shootedColumn + "]");
		
		if (battlefield[shootedRow][shootedColumn] == 0) {
			System.out.println("Enemy destroyed!");
			return true;
		} else {
			System.out.println("Enemy missed!");
			return false;
		}
	}
	
	 public static void showBoard(){
	        System.out.println("\t1 \t2 \t3 \t4 \t5\t6 \t7 \t8 \t9 \t10");
	        System.out.println();
	        
	        for(int row=0 ; row < ROW ; row++ ){
	            System.out.print((row+1)+"");
	            for(int column=0 ; column < COLUMN ; column++ ){
	                if(battlefield[row][column]==-1){
	                    System.out.print("\t"+"~");
	                }else if(battlefield[row][column]==0){
	                    System.out.print("\t"+"*");
	                }else if(battlefield[row][column]==1){
	                    System.out.print("\t"+"X");
	                }
	                
	            }
	            System.out.println();
	        }

	    }


}
