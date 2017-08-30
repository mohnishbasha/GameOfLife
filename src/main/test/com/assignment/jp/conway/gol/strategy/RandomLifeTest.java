package com.assignment.jp.conway.gol.strategy;

import org.junit.Test;
import static org.junit.Assert.assertNotSame;

public class RandomLifeTest {

    @Test
    public void testRandomLife() {

        ILife life1 = new RandomLife();
        ILife life2 = new RandomLife();
        assertNotSame(life1.birth(), life2.birth());
    }
}
