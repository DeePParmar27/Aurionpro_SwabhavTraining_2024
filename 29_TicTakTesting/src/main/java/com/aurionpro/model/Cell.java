package com.aurionpro.model;

import com.aurionpro.exception.cellAlredyMarkedExceprion;

public class Cell {
	MarkType mark ;

	public Cell() {
		this.mark = mark.EMPTY;
	}
	
	public boolean isEmpty() {
		if(this.mark == mark.EMPTY) {
			return true ;
		}
		return false;	
	}

	public MarkType getMark() {
		return this.mark;
	}

	public void setMark(MarkType mark) {
//		try {
//			if(mark != mark.EMPTY)
//				throw new cellAlredyMarkedExceprion();
//			else {
//			this.mark =  mark ;
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		this.mark= mark;
		
	}
	
	
	
	
	

}
