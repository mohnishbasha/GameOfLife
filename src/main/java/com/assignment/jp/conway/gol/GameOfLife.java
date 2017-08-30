package com.assignment.jp.conway.gol;

import com.assignment.jp.conway.gol.facade.CommunityFacade;
import com.assignment.jp.conway.gol.model.Cell;
import com.assignment.jp.conway.gol.model.Community;
import com.assignment.jp.conway.gol.strategy.*;

import java.util.Set;

/*

Background
    The	playing field for Conway’s game	of life consists of	a two dimensional grid of
    cells. Each cell is	identified as either alive or dead.	For	this exercise, let’s assume	the
    playing	field is an 8x6	grid of	cells (i.e. 8 columns, 6 rows).

    The	challenge is to calculate the next state of	the	playing	field given	any	initial	grid
    state.	To find	the	next state,	follow these rules:

    Evolution Rules:
    1. Any live cell with fewer than two live neighbors	dies, as if	caused by underpopulation.
    2. Any live	cell with more than	three live neighbors dies, as if by	overcrowding.
    3. Any live	cell with two or three live	neighbors lives	on to the next generation.
    4. Any dead	cell with exactly three	live neighbors becomes a live cell.
    5. A cell’s	neighbors are those	cells which	are	horizontally, vertically or diagonally adjacent. Most cells
        will have eight neighbors. Cells placed on the edge	of the	grid will have fewer.

 */

public class GameOfLife {

    public static void main (String [] args) {

        CommunityFacade facade = new CommunityFacade();

        System.out.println("-------- Base Input -------------");
        ILife initialLife = new InitialLife();
        facade.initiateLife(initialLife);
        System.out.println("-------- Output -------------");
        facade.nextLife();

        System.out.println("--------Random Input -------------");
        ILife randomLife = new RandomLife();
        facade.initiateLife(randomLife);
        System.out.println("-------- Output -------------");
        facade.nextLife();

    }

}
