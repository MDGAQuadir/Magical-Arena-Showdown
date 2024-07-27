package com.quadir.Demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MagicalArenaTest {
    private Player playerA;
    private Player playerB;
    private Arena arena;

    @Before
    public void setUp() {
        playerA = new Player(50, 5, 10);
        playerB = new Player(100, 10, 5);
        arena = new Arena(playerA, playerB);
    }

    @Test
    public void testFight() {
        arena.startFight();
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }
}
