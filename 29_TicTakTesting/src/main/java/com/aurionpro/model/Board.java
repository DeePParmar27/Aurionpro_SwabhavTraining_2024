package com.aurionpro.model;

import com.aurionpro.exception.cellAlredyMarkedExceprion;

public class Board {
	

public Cell[][] cells;

	public Board() {
		
		cells = new Cell[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.cells[i][j] = new Cell();
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cells[i][j].getMark()+"\t");
			}
			System.out.println(" ");
		}
	}
	
	
	public boolean isBoardFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(cells[i][j].getMark() == MarkType.EMPTY)
					return false ;
				    break ;
			}
		}
		return true  ;
		            
	}
	
	public void setCellMark(int i , int j , MarkType mark) {
//		try {
//			if(cells[i][j].getMark() != mark.EMPTY) 
//				throw new cellAlredyMarkedExceprion();
//			else {
//			cells[i][j].setMark(mark);
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		cells[i][j].setMark(mark);

	}
	
	public MarkType getCellMark(int i , int j ) {
		return cells[i][j].getMark();
	}

	
	

	
}
