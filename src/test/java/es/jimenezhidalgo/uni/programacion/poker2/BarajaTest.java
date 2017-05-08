package es.jimenezhidalgo.uni.programacion.poker2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jesus.jimenez on 05/05/2017.
 */
public class BarajaTest {

    @Test
    public void crearMano() throws Carta.CartaExcepcion{
        try {
            Baraja.crearMano();
        } catch (Carta.CartaExcepcion cartaExcepcion) {
            fail("Se ha generado una excepción al crear la mano");
        }
    }

}