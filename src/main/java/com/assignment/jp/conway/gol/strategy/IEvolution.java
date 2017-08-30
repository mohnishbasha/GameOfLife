package com.assignment.jp.conway.gol.strategy;

import com.assignment.jp.conway.gol.model.Cell;
import java.util.Set;

/*
Interface to define implementation for evolution rules.
 */
public interface IEvolution {
    public Set<Cell> runEvolution(Set<Cell> aliveCells);
}
