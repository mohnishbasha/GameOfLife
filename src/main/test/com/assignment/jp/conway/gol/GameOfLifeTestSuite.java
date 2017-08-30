package com.assignment.jp.conway.gol;


import com.assignment.jp.conway.gol.facade.CommunityFacadeTest;
import com.assignment.jp.conway.gol.model.CellTest;
import com.assignment.jp.conway.gol.model.CommunityTest;
import com.assignment.jp.conway.gol.strategy.ConwaysEvolutionTest;
import com.assignment.jp.conway.gol.strategy.InitialLifeTest;
import com.assignment.jp.conway.gol.strategy.RandomLifeTest;
import com.assignment.jp.conway.gol.util.CellNeighborTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CellTest.class,
        CommunityTest.class,
        CellNeighborTest.class,
        CommunityFacadeTest.class,
        ConwaysEvolutionTest.class,
        InitialLifeTest.class,
        RandomLifeTest.class,
})

public class GameOfLifeTestSuite {


}
