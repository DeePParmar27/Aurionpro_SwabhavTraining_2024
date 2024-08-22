package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {

    private Board board;

    @BeforeEach
    void init() {
        board = new Board();
    }

    @Test
    void testSetAndGetCellMark() {
        // Set a mark and check if it is correctly set
        board.setCellMark(1, 1, MarkType.O);
        assertEquals(MarkType.O, board.getCellMark(1, 1));
    }
    
}
