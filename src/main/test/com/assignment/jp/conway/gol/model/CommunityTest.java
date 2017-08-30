package com.assignment.jp.conway.gol.model;

import com.assignment.jp.conway.gol.strategy.ConwaysEvolution;
import com.assignment.jp.conway.gol.strategy.IEvolution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/*
Test Cases for Community

 */
public class CommunityTest {

        // 6 * 8 pre-initializing this as per the assignment doc.
        // to be transformed into Community
        int [][] grid  = {
                { 0, 0, 0, 0, 0, 0, 1, 0 },
                { 1, 1, 1, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0 },
        };

        @Test
        public void testCommunities() {

            Community community1 = new Community();
            community1.setCommunityGrid(grid);
            community1.buildCommunity();

            Community community2 = new Community();
            community2.setCommunityGrid(grid);
            community2.buildCommunity();

            assertEquals(community1, community2);
        }


    @Test
    public void testEvolutions() {

        Community community1 = new Community();
        community1.setCommunityGrid(grid);
        community1.buildCommunity();

        Community community2 = new Community();
        community2.setCommunityGrid(grid);
        community2.buildCommunity();

        IEvolution evolution = new ConwaysEvolution();
        community1.setEvolution(evolution);
        community1.runEvolution();
        community2.setEvolution(evolution);
        community2.runEvolution();

        assertEquals(community1, community2);
    }





}
