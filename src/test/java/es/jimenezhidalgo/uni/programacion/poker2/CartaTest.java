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
    public void cartaExceptionTest(){
        try {
            new Carta(400);
            fail("No se ha detectado la excepción");
        } catch (Carta.CartaExcepcion ignored) {}

        try {
            new Carta(215);
            fail("No se ha detectado la excepción");
        } catch (Carta.CartaExcepcion ignored) {}

        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 12; j++) {
                    new Carta(i*100 + j);
                }
            }
        } catch (Carta.CartaExcepcion e){
            fail("Se ha detectado una excepción con una carta correcta");
        }
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

    @Test
    public void getCartaIntTest() throws Exception {
        assertEquals("Se ha creado una carta 103, pero el valor obtenido no coincide", 103, carta.getCartaInt());
        assertEquals("Se ha creado una carta 104, pero el valor obtenido no coincide", 104, Carta.getCartaInt(new Carta(104)));
    }

}