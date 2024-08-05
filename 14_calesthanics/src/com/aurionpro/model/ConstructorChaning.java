package com.aurionpro.model;

public class ConstructorChaning {

	private int width ;
	private int depth ;
	private int height ;
	
   public ConstructorChaning() {
	   width = 10 ;
	   depth = 25 ;
	   height = 90 ;
   }
   
   @Override
public String toString() {
	return "ConstructorChaning [width=" + width + ", depth=" + depth + ", height=" + height + "]";
}

public ConstructorChaning(int width , int depth) {
	   this();
	   this.depth = depth ;
	   this.width = width ;
   }

}
