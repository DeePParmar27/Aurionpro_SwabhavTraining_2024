package com.aurionpro.structural.Composite.test;

import com.aurionpro.structural.Composite.model.Components;
import com.aurionpro.structural.Composite.model.Composite;
import com.aurionpro.structural.Composite.model.Leaf;

public class compositeTest {
	public static void main(String[] args) {
		Components mouse = new Leaf(1000, "Mouse");
		Components key = new Leaf(1000, "KeyBoard");
		Components cpu = new Leaf(1000, "CPU");
		Components monitor = new Leaf(1000, "Monitor");
		
		Composite processor = new Composite("processor");
		Composite peri = new Composite("Peri");
		
                 peri.addComponents(mouse);
                 peri.addComponents(key);
                 peri.addComponents(monitor);
                 processor.addComponents(cpu);
                 
                 peri.showPrice();
                 
                 
	}

}
