package com.assignment.jp.conway.gol.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/*
Test Cases for Cell
 */
public class CellTest {

    @Test
    public void testAliveCell() {
        Cell cell = new Cell(0,0, true);
        assertEquals(cell.alive, true);
    }

    @Test
    public void testDeadCell() {
        Cell cell = new Cell(0,0, false);
        assertEquals(cell.alive, false);
    }

    @Test
    public void testSameCells() {
        Cell cell1 = new Cell(0,0, false);
        Cell cell2 = new Cell(0,0, false);
        assertEquals(cell1, cell2);
    }

    @Test
    public void testDifferentCells() {
        Cell cell1 = new Cell(0,0, false);
        Cell cell2 = new Cell(0,1, false);
        assertNotSame(cell1, cell2);
    }

    @Test
    public void testNeighbors() {
        Cell cell = new Cell(4,4, true);
        assertEquals(cell.getNeighbors().size(), 8);
    }
}
