package es.jimenezhidalgo.uni.programacion.poker2.utils;

import es.jimenezhidalgo.uni.programacion.poker2.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by jesus.jimenez on 05/05/2017.
 */
public class PremiosTest {

    private ArrayList<Carta> mano;
    private static final int CANTIDAD_APOSTADA = 10;
    private static JugadorRegistrado sJugadorRegistrado;
    private static JugadorOcasional sJugadorOcasional;

    @BeforeClass
    public static void beforeClassSetUp8(){
        sJugadorOcasional = new JugadorOcasional("0", "pepito", "perez", 50, new Date(System.currentTimeMillis() - 18L * 365 * 24 * 3600 * 1000), "1234 5678 9101 1121");
        sJugadorRegistrado = new JugadorRegistrado("0", "pepito", "perez", 50, new Date(System.currentTimeMillis() - 18L * 365 * 24 * 3600 * 1000), "ES92 1111 2222 3333 4444", "asdf", new Date());
    }

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

        assertEquals("El jugador registrado debería haber recuperado lo apostado", CANTIDAD_APOSTADA, (new Apuesta(sJugadorRegistrado, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
        assertEquals("El jugador ocasional debería haber recuperado lo apostado", CANTIDAD_APOSTADA, (new Apuesta(sJugadorOcasional, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
    }

    @Test
    public void tieneDobleParejaTest() throws Exception {
        mano.add(new Carta(100));
        mano.add(new Carta(0));
        mano.add(new Carta(202));
        mano.add(new Carta(1));
        mano.add(new Carta(1));

        assertEquals("La mano lleva doble pareja y no debería llevar otra cosa", PremiosUtils.TIENE_DOBLE_PAREJA, PremiosUtils.comprobarCombinacionEnMano(mano));

        assertEquals("El jugador registrado debería tener 2 veces lo apostado", CANTIDAD_APOSTADA * 2, (new Apuesta(sJugadorRegistrado, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
        assertEquals("El jugador ocasional debería tener 2 veces lo apostado", CANTIDAD_APOSTADA * 2, (new Apuesta(sJugadorOcasional, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
    }

    @Test
    public void tieneTrioTest() throws Exception {
        mano.add(new Carta(100));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(1));
        mano.add(new Carta(2));

        assertEquals("La mano lleva trio y no debería llevar otra cosa", PremiosUtils.TIENE_TRIO, PremiosUtils.comprobarCombinacionEnMano(mano));

        assertEquals("El jugador registrado debería tener 2 veces lo apostado", CANTIDAD_APOSTADA * 4, (new Apuesta(sJugadorRegistrado, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
        assertEquals("El jugador ocasional debería tener 2 veces lo apostado", CANTIDAD_APOSTADA * 3, (new Apuesta(sJugadorOcasional, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
    }

    @Test
    public void tieneColorTest() throws Exception {
        mano.add(new Carta(0));
        mano.add(new Carta(1));
        mano.add(new Carta(2));
        mano.add(new Carta(3));
        mano.add(new Carta(4));

        assertEquals("La mano lleva color y no debería llevar otra cosa", PremiosUtils.TIENE_COLOR, PremiosUtils.comprobarCombinacionEnMano(mano));

        assertEquals("El jugador registrado debería tener 6 veces lo apostado", CANTIDAD_APOSTADA * 6, (new Apuesta(sJugadorRegistrado, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
        assertEquals("El jugador ocasional debería tener 4 veces lo apostado", CANTIDAD_APOSTADA * 4, (new Apuesta(sJugadorOcasional, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
    }

    @Test
    public void tieneFullTest() throws Exception {
        mano.add(new Carta(100));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(1));
        mano.add(new Carta(1));

        assertEquals("La mano lleva full y no debería llevar otra cosa", PremiosUtils.TIENE_FULL, PremiosUtils.comprobarCombinacionEnMano(mano));

        assertEquals("El jugador registrado debería tener 8 veces lo apostado", CANTIDAD_APOSTADA * 8, (new Apuesta(sJugadorRegistrado, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
        assertEquals("El jugador ocasional debería tener 5 veces lo apostado", CANTIDAD_APOSTADA * 5, (new Apuesta(sJugadorOcasional, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
    }

    @Test
    public void tienePokerTest() throws Exception {
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(0));
        mano.add(new Carta(101));

        assertEquals("La mano lleva poker y no debería llevar otra cosa", PremiosUtils.TIENE_POKER, PremiosUtils.comprobarCombinacionEnMano(mano));

        assertEquals("El jugador registrado debería tener 10 veces lo apostado", CANTIDAD_APOSTADA * 10, (new Apuesta(sJugadorRegistrado, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
        assertEquals("El jugador ocasional debería tener 6 veces lo apostado", CANTIDAD_APOSTADA * 6, (new Apuesta(sJugadorOcasional, mano, CANTIDAD_APOSTADA)).verPremio().getPremioEconomico(), 0);
    }

    @After
    public void tearDown() throws Exception {
        mano.clear();
    }
}