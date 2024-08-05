package com.aurionpro.test;

import com.aurionpro.model.Inventory;
import com.aurionpro.model.WOOD;
import com.aurionpro.model.builder;
import com.aurionpro.model.guitar;
import com.aurionpro.model.type;

public class guitarTest {
public static void main(String[] args) {
	Inventory inventory = new Inventory();
	inventory.addGuitar("1221", 1000.0, builder.FENDER, "", type.ACOUSTIC, WOOD.ADIRONDACK, WOOD.ALDER);
	inventory.addGuitar("1222", 1000.0, builder.GIBSON, "", type.ACOUSTIC, WOOD.BRAZILIAN_ROSEWOOD, WOOD.COCOBOLO);
	inventory.addGuitar("1223", 1000.0, builder.OLSON, "", type.ELECTRIC, WOOD.CEDAR, WOOD.INDIAN_ROSEWOOD);
	inventory.addGuitar("1224", 1000.0, builder.FENDER, "", type.ELECTRIC, WOOD.ADIRONDACK, WOOD.CEDAR);
	inventory.addGuitar("1225", 1000.0, builder.PRS, "", type.ACOUSTIC, WOOD.COCOBOLO, WOOD.BRAZILIAN_ROSEWOOD);
	

	guitar whatDeepLikes = new guitar("1221", 1000.0, builder.FENDER, "", type.ACOUSTIC, WOOD.ADIRONDACK, WOOD.ALDER);
	System.out.println(inventory.search(whatDeepLikes));
}
}
