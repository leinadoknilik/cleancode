package com;

public class Ship {

	boolean[][] pattern;
	int size;

	public Ship(boolean[][] pattern) {
		this.pattern = pattern;
	}
	
	public Ship(int size) {
		this.size = size;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[0].length; j++) {
				if (pattern[i][j]) {
					sb.append("x");
				} else {
					sb.append("-");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
}