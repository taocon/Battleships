package com.qa.BattleShips;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BattleShipsTest {

	GameMechanics player1 = new GameMechanics();
	ShipYard small1Back = new ShipYard("smallback1", 0, 0);
	ShipYard small1Front = new ShipYard("smallfront1", 1, 0);
	ShipYard small2Back = new ShipYard("smallback1", 2, 3);
	ShipYard small2Front = new ShipYard("smallfront1", 3, 3);

	@Before
	public void setUp() {
		player1.shipAdd(small1Back);
		player1.shipAdd(small1Front);
		player1.ShipPlace(small1Back, 1, 1);
		player1.ShipPlace(small1Front, 1, 1);

	}

	@Test
	public void shipExistTest() {

		System.out.println("Ship hitbox at (" + small1Back.getxCord() + "," + small1Back.getyCord() + ") ,("
				+ small1Front.getxCord() + "," + small1Front.getyCord() + ")");
		System.out.println(player1.objectList.size());
		assertEquals(2, player1.objectList.size());
	}

	@Test
	public void shipValidTest() {

assertEquals(true,player1.validCheck());
	}

}
