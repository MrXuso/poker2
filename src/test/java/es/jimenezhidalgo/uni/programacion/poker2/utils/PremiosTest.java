package es.jimenezhidalgo.uni.programacion.poker2.utils;

import es.jimenezhidalgo.uni.programacion.poker2.Baraja;
import es.jimenezhidalgo.uni.programacion.poker2.Carta;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by jesus.jimenez on 05/05/2017.
 */
public class PremiosTest {

    private ArrayList<Carta> mano;

    @Before
    public void setUp() throws Exception {
        mano = new ArrayList<>();
    }

    @Test
    public void tieneParejaTest() throws Exception {
        mano.add(new Carta(0));
        mano.add(new Carta(100));
        mano.add(new Carta(1));
        mano.add(new Carta(2));
        mano.add(new Carta(3));

        assertEquals("La mano lleva pareja y no debería llevar otra cosa", PremiosUtils.TIENE_PAREJA, PremiosUtils.comprobarCombinacionEnMano(mano));
    }

    @Test
    public void tieneDobleParejaTest() throws Exception {
        mano.add(new Carta(100));
        mano.add(new Carta(0));
        mano.add(new Carta(202));
        mano.add(new Carta(1));
        mano.add(new Carta(1));

        assertEquals("La mano lleva doble pareja y no debería llevar otra cosa", PremiosUtils.TIENE_DOBLE_PAREJA, PremiosUtils.comprobarCombinacionEnMano(mano));
    }

    @Test
    public void tieneTrioTest() throws Exception {
        mano.add(new Carta(100));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(1));
        mano.add(new Carta(2));

        assertEquals("La mano lleva trio y no debería llevar otra cosa", PremiosUtils.TIENE_TRIO, PremiosUtils.comprobarCombinacionEnMano(mano));
    }

    @Test
    public void tieneColorTest() throws Exception {
        mano.add(new Carta(0));
        mano.add(new Carta(1));
        mano.add(new Carta(2));
        mano.add(new Carta(3));
        mano.add(new Carta(4));

        assertEquals("La mano lleva color y no debería llevar otra cosa", PremiosUtils.TIENE_COLOR, PremiosUtils.comprobarCombinacionEnMano(mano));
    }

    @Test
    public void tieneFullTest() throws Exception {
        mano.add(new Carta(100));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(1));
        mano.add(new Carta(1));

        assertEquals("La mano lleva full y no debería llevar otra cosa", PremiosUtils.TIENE_FULL, PremiosUtils.comprobarCombinacionEnMano(mano));
    }

    @Test
    public void tienePokerTest() throws Exception {
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(101));

        assertEquals("La mano lleva poker y no debería llevar otra cosa", PremiosUtils.TIENE_POKER, PremiosUtils.comprobarCombinacionEnMano(mano));
    }

    @After
    public void tearDown() throws Exception {
        mano.clear();
    }
}