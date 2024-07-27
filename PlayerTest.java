package  com.quadir.Demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player(50, 5, 10);
    }

    @Test
    public void testInitialValues() {
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testSetHealth() {
        player.setHealth(40);
        assertEquals(40, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
