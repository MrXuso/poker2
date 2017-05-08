package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.exceptions.JugadorException;
import es.jimenezhidalgo.uni.programacion.poker2.gui.VentanaPrincipal;
import es.jimenezhidalgo.uni.programacion.poker2.utils.NIFHelper;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jesus.jimenez on 05/05/2017.
 */
public class Main {
    
    public static Apuesta sApuesta = null;
    
    /**
     * Jugador que apuesta, una vez inicie sesión o se registre, le daremos un valor
     */
    public static Jugador sJugador = null;
    
    public static void main(String[] args) {
        
        //Ventana principal
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
    }
}
