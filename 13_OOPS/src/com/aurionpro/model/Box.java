package com.aurionpro.model;

public class Box {
	
	private int height ;
	private int width ;
	private int depth ;
	
	public void initialize() {
		height = 0 ;
		width = 0;
		depth = 0 ;
	}
	
	

	public Box(int height , int  width , int depth) {
	
	this.height = height ;
	this.width = width ;
	this.depth = depth ;
	}
	public void setWidth(int width ) {
		this.width = width ;
	}
	
	public void setHeight(int height ) {
		this.width = height ;
	}
	
	public void setDepth(int depth ) {
		this.depth = depth ;
	}
	
	public int getWidth() {
		return width ;
	}
	
	public int getHeight() {
		return height ;
	}
	
	public int getDepth() {
		return depth ;
	}

	public int calculateVolume() {
		return width*height*depth ;
	}

}
