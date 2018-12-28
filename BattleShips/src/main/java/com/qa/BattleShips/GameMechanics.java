package com.qa.BattleShips;

import java.util.*;;

public class GameMechanics {

	private int varX = 0;
	private int varY = 0;
	private boolean outOfBounds;

	List<ShipYard> objectList = new ArrayList<ShipYard>();

	public void shipAdd(ShipYard ship) {

		objectList.add(ship);
	}

	public void ShipPlace(ShipYard ship, int newX, int newY) {

		for (ShipYard ship1part : objectList) {
			if (ship.getName().equals(ship1part.getName())) {

				ship1part.setxCord(newX);
				ship1part.setyCord(newY);

			}

		}

	}

	public boolean validCheck() {

		for (ShipYard ship1Part : objectList) {

			/*
			 * if (ship1Part.getxCord() > 3 || ship1Part.getyCord() > 3) {
			 * System.out.println("Out of bounds"); return false; }
			 */

			for (ShipYard ship2Part : objectList) {

				if ((ship1Part.getxCord() == ship2Part.getxCord() && ship1Part.getyCord() == ship2Part.getyCord())
						&& (!ship1Part.getName().equals(ship2Part.getName()))) {
					System.out.println(ship1Part.getxCord());
					System.out.println(ship1Part.getyCord());
					System.out.println(ship2Part.getxCord());
					System.out.println(ship2Part.getyCord());
					System.out.println("Invalid placement");
					return false;
				}

				else
					return true;
			}

		}

		return true;

	}

	public int getVarX() {
		return varX;
	}

	public void setVarX(int varX) {
		this.varX = varX;
	}

	public int getVarY() {
		return varY;
	}

	public void setVarY(int varY) {
		this.varY = varY;
	}

}
