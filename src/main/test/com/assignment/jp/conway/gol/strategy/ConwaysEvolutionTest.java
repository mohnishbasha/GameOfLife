package com.assignment.jp.conway.gol.strategy;

import com.assignment.jp.conway.gol.model.Community;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConwaysEvolutionTest {

    @Test
    public void testEvolutions() {

        ILife life = new InitialLife();
        Community community1 = new Community();
        community1.setCommunityGrid(life.birth());
        community1.buildCommunity();

        Community community2 = new Community();
        community2.setCommunityGrid(life.birth());
        community2.buildCommunity();

        IEvolution evolution = new ConwaysEvolution();
        assertEquals(evolution.runEvolution(community1.getAliveCells()), evolution.runEvolution(community2.getAliveCells()));
    }
}
