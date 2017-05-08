package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.exceptions.JugadorException;

import java.util.HashMap;

/**
 * Created by jesus.jimenez on 08/05/2017.
 *
 * Clase que se encarga de dar de alta y de baja a los jugadores en el sistema.
 */
public class CasaApuestas {

    public static HashMap<String, JugadorRegistrado> sJugadoresRegistrados = new HashMap();

    /**
     * Da de alta un jugador en el sistema
     * @param jugadorRegistrado jugador que se desea registrar
     * @throws JugadorException Salta la excecpción en caso de que el jugador ya esté registrado
     */
    public static void altaJugador(JugadorRegistrado jugadorRegistrado) throws JugadorException {

        if (sJugadoresRegistrados.put(jugadorRegistrado.getNif(), jugadorRegistrado) != null){
            throw new JugadorException(JugadorException.JUGADOR_YA_REGISTRADO);
        }
    }

    /**
     * Da de baja un jugador en el sistem
     * @param NIF NIF del jugador a dar de baja en el sistema
     * @return el jugador que se ha dado de baja
     */
    public static JugadorRegistrado bajaJugador(String NIF) {
        JugadorRegistrado jugadorRegistrado = sJugadoresRegistrados.remove(NIF);

        jugadorRegistrado.retirarBeneficios();

        return jugadorRegistrado;
    }



}
