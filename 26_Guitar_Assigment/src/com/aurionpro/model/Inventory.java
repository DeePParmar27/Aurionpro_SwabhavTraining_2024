package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	List<guitar> guitars = new ArrayList<>();

	public List<guitar> getGuitars() {
		return guitars;
	}

	public void setGuitars(List<guitar> guitars) {
		this.guitars = guitars;
	}

	public void addGuitar(String serialNumber, Double price, builder builder, String model, type type, WOOD blackWood,
			WOOD topWood) {
		guitar g = new guitar(serialNumber, price, builder, model, type, blackWood, topWood);
		guitars.add(g);

	}

	public guitar search(guitar searchGuitar) {
		for (guitar g : guitars) {
			if (searchGuitar.getBuilder() != g.getBuilder()) {
				continue;
			}
			if (searchGuitar.getTopWood() != g.getTopWood()) {
				continue;
			}
			if (searchGuitar.getType() != g.getType()) {
				continue;
			}
			if (searchGuitar.getBlackWood() != g.getBlackWood()) {
				continue;
			}
			return g;
		}

		return null;
	}
}
