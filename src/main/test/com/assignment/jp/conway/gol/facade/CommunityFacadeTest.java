package com.assignment.jp.conway.gol.facade;

import com.assignment.jp.conway.gol.strategy.ILife;
import com.assignment.jp.conway.gol.strategy.InitialLife;
import com.assignment.jp.conway.gol.strategy.RandomLife;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;


public class CommunityFacadeTest {

    @Test
    public void testInitialLife() {
        ILife initialLife = new InitialLife();
        CommunityFacade facade1 = new CommunityFacade();
        CommunityFacade facade2 = new CommunityFacade();

        facade1.initiateLife(initialLife);
        facade2.initiateLife(initialLife);
        assertEquals( facade1.nextLife(), facade2.nextLife());
    }


    @Test
    public void testRandomLife() {
        ILife initialLife = new RandomLife();
        CommunityFacade facade1 = new CommunityFacade();
        CommunityFacade facade2 = new CommunityFacade();

        facade1.initiateLife(initialLife);
        facade2.initiateLife(initialLife);
        assertNotSame( facade1.nextLife(), facade2.nextLife());
    }
}
