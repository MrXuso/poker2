package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.JugadorRegistrado;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public class JugadorRegistradoTest {

    private JugadorRegistrado mJugadorRegistrado;
    private String mNif, mNombre, mApellidos, mCuentaBancaria, mContrasenia;

    @Before
    public void setUp() throws Exception {
        mNif = "00000000T";
        mNombre = "Pepito";
        mJugadorRegistrado = new JugadorRegistrado(mNif, "Pepito", "Perez", 50.0, new Date(0), "12309331093", "asdf1234", new Date());
    }

    @Test
    public void getFechaRegistro() throws Exception {

    }

    @Test
    public void getCuentaBancaria() throws Exception {

    }

    @Test
    public void setCuentaBancaria() throws Exception {

    }

    @Test
    public void getContrasenia() throws Exception {

    }

    @Test
    public void setContrasenia() throws Exception {

    }

    @Test
    public void setFechaRegistro() throws Exception {

    }

    @Test
    public void retirarBeneficios() throws Exception {
        assertEquals("Expected 50", 50, mJugadorRegistrado.retirarBeneficios(),0.0);
        mJugadorRegistrado.aumentarSaldo(50);
        mJugadorRegistrado.setFechaRegistro(new Date(System.currentTimeMillis() - (400L * 24 * 3600 * 1000)));
        assertEquals("Expected 51", 51, mJugadorRegistrado.retirarBeneficios(), 0.0);
    }

}