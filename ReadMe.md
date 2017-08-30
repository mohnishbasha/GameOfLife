# Conway’s Game of Life	Exercise

## Goal

The	goal of this exercise is to	calculate the next generation of Conway’s game of life
given any initial state. Take a look at the	following for some background on

Conway’s game of life:
http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life

## Background

    The	playing field for Conway’s game	of life consists of	a two dimensional grid of
    cells. Each cell is	identified as either alive or dead.	For	this exercise, let’s assume	the
    playing	field is an 8x6	grid of	cells (i.e. 8 columns, 6 rows).


## Rules
    The	challenge is to calculate the next state of	the	playing	field given	any	initial	grid
    state.	To find	the	next state,	follow these rules:

    Evolution Rules:
    1. Any live cell with fewer than two live neighbors	dies, as if	caused by underpopulation.
    2. Any live	cell with more than	three live neighbors dies, as if by	overcrowding.
    3. Any live	cell with two or three live	neighbors lives	on to the next generation.
    4. Any dead	cell with exactly three	live neighbors becomes a live cell.
    5. A cell’s	neighbors are those	cells which	are	horizontally, vertically or diagonally adjacent. Most cells
        will have eight neighbors. Cells placed on the edge	of the	grid will have fewer.

## Input	/	Output
Design	your	program	to accept	an	initial	8x6 grid	state	where	each	cell	is	identified
as	alive	or	dead.	Your	program	should	output	a	new	state	by	following	Conway’s
game	of	life	rules.	Your	program	should	display	the	new	state	of	the	playing	field.
You	may	choose	the	data	model for	representing	your	grid and	how	to	display	the
state	of	the	grid.	Here	is	a	very	simple	command	line	output	example:

Initial	state
```
 ......O.
 OOO...O.
 ......O.
 ........
 ...OO...
 ...OO...
```
 Updated state
.O......
.O...OOO
.O......
........
...OO...
...OO...

## System Requirement
* JDK 1.8
* Maven 2

## How to run

* Download the tar file to a directory.
* Extract tar: tar xvzf GameOfLife.tar.gz
* cd GameOfLife
* mvn package

## Run Game of life
* To run Game: $ java -jar target/gameoflife-1.0-SNAPSHOT.jar

## Run tests
* To run tests: mvn test

## Test Coverage
* 87% classes covered
* 84% lines covered

## Additional Feature
* Support arbitrarily sized	grids
