package com.aurionpro.model;

public class ResultAnalyzer {
	Board board ;
	ResultType result ;
	Player player ;
	public ResultAnalyzer(Board board, ResultType result) {
		this.board = board;
		this.result = result;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public ResultType getResult() {
		return result;
	}
	public void setResult(ResultType result) {
		this.result = result;
	}
	
//	public void columLineMatchO() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 3; i++) {
//			if (board.getCellMark(i, 0) == MarkType.O  && board.getCellMark(i, 1) == MarkType.O  && board.getCellMark(i, 2) == MarkType.O) {
//			   result = result.WIN ;
//				return;
//			}
//		}
//	}
//
//	
//	public void RowLineMatchO() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 3; i++) {
//			if (board.getCellMark(0, i) == MarkType.O  && board.getCellMark(1,i) == MarkType.O  && board.getCellMark(2,i) == MarkType.O) {
//				result = result.WIN ;
//				return;
//			}
//		}
//	}
//
//	
//	public void crossLineMatrixO() {
//		if(board.getCellMark(0, 0) == MarkType.O && board.getCellMark(1, 1) == MarkType.O && board.getCellMark(2, 2) == MarkType.O) {
//			result = result.WIN ;
//			return;
//		}
//		
//	}
//
//
//	public void crossLineReverseO() {
//		// TODO Auto-generated method stub
//		if(board.getCellMark(0, 2) == MarkType.O && board.getCellMark(1, 1) == MarkType.O && board.getCellMark(2, 0) == MarkType.O) {
//			result = result.WIN ;
//			return;
//		}
//	}
//	
//	public void columLineMatchX() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 3; i++) {
//			if (board.getCellMark(i, 0) == MarkType.X  && board.getCellMark(i, 1) == MarkType.X  && board.getCellMark(i, 2) == MarkType.X) {
//			   result = result.WIN ;
//				return;
//			}
//		}
//	}
//
//	
//	public void RowLineMatchX() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 3; i++) {
//			if (board.getCellMark(0, i) == MarkType.X  && board.getCellMark(1,i) == MarkType.X  && board.getCellMark(2,i) == MarkType.X) {
//				result = result.WIN ;
//				return;
//			}
//		}
//	}
//
//	
//	public void crossLineMatrixX() {
//		if(board.getCellMark(0, 0) == MarkType.X && board.getCellMark(1, 1) == MarkType.X && board.getCellMark(2, 2) == MarkType.X) {
//			result = result.WIN ;
//			return;
//		}
//		
//	}
//
//
//	public void crossLineReverseX() {
//		// TODO Auto-generated method stub
//		if(board.getCellMark(0, 2) == MarkType.X && board.getCellMark(1, 1) == MarkType.X && board.getCellMark(2, 0) == MarkType.X) {
//			result = result.WIN ;
//			return;
//		}
//	}
	
	public void columLineMatch(Player player) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			if (board.getCellMark( i, 0) == player.mark && board.getCellMark(i , 1) == player.mark && board.getCellMark(i , 2) == player.mark) {
				setResult(result.WIN);
				break;
			}
		}
	}

	public void RowLineMatch(Player player) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			if (board.getCellMark(0, i) == player.mark && board.getCellMark(1, i) == player.mark && board.getCellMark(2, i) == player.mark) {
				setResult(result.WIN);
				break;
			}
		}
	}


	public void crossLineMatrix(Player player) {
		if (board.getCellMark(0, 0) == player.mark && board.getCellMark(1, 1) == player.mark && board.getCellMark(2, 2) == player.mark) {
			setResult(result.WIN);
			return;
		}
		
	}


	public void crossLineReverse(Player player) {
		// TODO Auto-generated method stub
		if (board.getCellMark(0, 2) == player.mark && board.getCellMark(1, 1) == player.mark && board.getCellMark(2, 0) == player.mark) {
			setResult(result.WIN);
			return;
		}
	}

	
	ResultType analyzeResult(Player player) {

		
		columLineMatch(player);
		RowLineMatch(player);
		crossLineMatrix(player);
		crossLineReverse(player);
		
        if (getResult() == ResultType.WIN) {
            return ResultType.WIN;
        } else if (board.isBoardFull()) {
            return ResultType.DRAW;
        } else {
            return ResultType.PROCESS;
        }
		
	}


}
