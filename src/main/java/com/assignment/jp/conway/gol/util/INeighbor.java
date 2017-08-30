package com.assignment.jp.conway.gol.util;

import com.assignment.jp.conway.gol.model.Cell;
import java.util.Set;

/*
Interface definition to find neighbors.
 */
public interface INeighbor {
    public Set<Cell> getNeighbours();
}

