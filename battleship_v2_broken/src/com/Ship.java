package com;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ship {
	private HashMap<Point,Status> shipMap;
	
	public HashMap<Point,Status> shipLoad() {
		shipMap = new HashMap<Point,Status>();
		Point p=new Point(0,0);
		Status st=new Status(1,false,false);
		shipMap.put(p, st);
		p=new Point(1,0);
		st=new Status(1,false,false);
		shipMap.put(p, st);
		return shipMap;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Entry<Point,Status> entry : shipMap ) {
			
		}
		return "Ship [shipMap=" + shipMap + "]";
	}
	
	
 
 /* Danié
 public Ship(boolean height){
		this.ship =  new int [3][2];
		initTwoRow();
	 
 }
 
 public Ship(int length){
		this.ship =  new int [length][1];
		initRow();
	 
}

private void initRow() {
	for(int row=0;row<ship.length;row++){
		for(int column=0;column<ship[0].length;column++){
			ship[row][column] = 0;
		}
	}
}

private void initTwoRow() {
	for(int row=0;row<ship.length;row++){
		for(int column=0;column<ship[0].length;column++){
			ship[row][column] = 0;
		}
	}
	ship[0][0] = -1;
	ship[2][0] = -1;
	
}

public int[][] getShip() {
	return ship;
}*/
 

}