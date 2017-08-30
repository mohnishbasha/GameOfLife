package com.assignment.jp.conway.gol.util;

import com.assignment.jp.conway.gol.model.Cell;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CellNeighborTest {

    @Test
    public void testCellNeighbors() {

        Cell cell1 = new Cell(4,4,true);
        Cell cell2 = new Cell(4,4,true);
        CellNeighbor cellNeighbor1 = new CellNeighbor(cell1);
        CellNeighbor cellNeighbor2 = new CellNeighbor(cell2);
        assertEquals(cellNeighbor1.getNeighbours(), cellNeighbor2.getNeighbours());
    }
}
