package es.jimenezhidalgo.uni.programacion.poker2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jesus.jimenez on 05/05/2017.
 */
public class CartaTest {

    private Carta carta;

    @Before
    public void setUp() throws Exception {
        carta = new Carta(103);
    }

    @Test
    public void toStringTest() throws Exception {
        assertEquals("Expected \"Cuatro de Copas\"", "Cuatro de Copas", carta.toString());
    }

    @Test
    public void mismaFiguraTest() throws Exception {
        assertEquals("Expected true", true, carta.mismaFigura(new Carta(203)));
    }

    @Test
    public void mismoPaloTest() throws Exception {
        assertEquals("Expected true", true, carta.mismoPalo(new Carta(111)));
    }

}