package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.JugadorRegistrado;
import es.jimenezhidalgo.uni.programacion.poker2.exceptions.JugadorException;
import es.jimenezhidalgo.uni.programacion.poker2.utils.FacturaUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public class JugadorTest {

    private JugadorRegistrado mJugadorRegistrado;
    private String mNif, mNombre, mApellidos, mCuentaBancaria, mContrasenia;

    @Before
    public void setUp() throws Exception {
        mNif = "00000000T";
        mNombre = "Pepito";
        mJugadorRegistrado = new JugadorRegistrado(mNif, "Pepito", "Pérez", 50.0, new Date(0), "12309331093", "asdf1234", new Date());
    }

    @Test
    public void crearFactura(){
        mJugadorRegistrado.setFechaRegistro(new Date(System.currentTimeMillis() - 4L * 356 * 24 * 3600 * 1000));
        FacturaUtil.crearFactura(mJugadorRegistrado, 50);

    }

    @Test
    public void retirarBeneficios() throws Exception {
        assertEquals("Expected 50", 50, mJugadorRegistrado.retirarBeneficios(),0.0);
        mJugadorRegistrado.aumentarSaldo(50);
        mJugadorRegistrado.setFechaRegistro(new Date(System.currentTimeMillis() - (4L * 367 * 24 * 3600 * 1000)));
        assertEquals("Expected 54", 54, mJugadorRegistrado.retirarBeneficios(), 0.0);
    }

    @Test
    public void altaBajaJugadorTest() throws JugadorException {

        mJugadorRegistrado.setFechaRegistro(new Date(System.currentTimeMillis() - 4L * 367 * 24 * 3600 * 1000));

        try {
            CasaApuestas.altaJugador(mJugadorRegistrado);
        } catch (Exception e) {
            fail("No debería salta una excepción al añadir el jugador");
        }

        try {
            CasaApuestas.altaJugador(mJugadorRegistrado);
            fail("Debería de provocar una excepción al ya existir el jugador");
        } catch (JugadorException ignored){}

        assertEquals("Debería haber devuelto el jugadorRegistrado", mJugadorRegistrado, CasaApuestas.bajaJugador(mJugadorRegistrado.getNif()));

    }

}