package com.qa.BattleShips;

public class ShipYard {

	private int xCord;
	private int yCord;
	private String name;

	public ShipYard(String name,int xCord, int yCord) {
		this.name = name;
		this.setxCord(xCord);
		this.setyCord(yCord);

	}

	public int getyCord() {
		return yCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public int getxCord() {
		return xCord;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
