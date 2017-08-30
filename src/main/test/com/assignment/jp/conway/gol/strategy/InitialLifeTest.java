package com.assignment.jp.conway.gol.strategy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InitialLifeTest {

    @Test
    public void testInitialLife() {

        ILife life1 = new InitialLife();
        ILife life2 = new InitialLife();
        assertEquals(life1.birth(), life2.birth());
    }
}
