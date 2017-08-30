package com.assignment.jp.conway.gol.facade;

import com.assignment.jp.conway.gol.model.Cell;
import com.assignment.jp.conway.gol.model.Community;
import com.assignment.jp.conway.gol.strategy.ConwaysEvolution;
import com.assignment.jp.conway.gol.strategy.IEvolution;
import com.assignment.jp.conway.gol.strategy.ILife;
import java.util.Set;

/*
Community Facade hides complexities of life evolution and
provides an interface to generate life.
 */
public class CommunityFacade {

    private Community community;
    private ILife life;

    public CommunityFacade() {
        community = new Community();
    }

    public Set<Cell> initiateLife(ILife life) {
        this.life = life;
        community.setCommunityGrid(life.birth());
        community.buildCommunity();
        return community.getAliveCells();
    }

    public Set<Cell> nextLife() {
        IEvolution evolution = new ConwaysEvolution();
        community.setEvolution(evolution);
        community.runEvolution();
        return community.getAliveCells();
    }

}
