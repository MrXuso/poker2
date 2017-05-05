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
    public void tieneTrioTest() throws Exception {
        mano.add(new Carta(0));
        mano.add(new Carta(100));
        mano.add(new Carta(200));
        mano.add(new Carta(2));
        mano.add(new Carta(3));

        assertEquals("La mano lleva trio y no debería llevar otra cosa", PremiosUtils.TIENE_TRIO, PremiosUtils.comprobarCombinacionEnMano(mano));
    }

    @After
    public void tearDown() throws Exception {
        mano.clear();
    }
}