package es.jimenezhidalgo.uni.programacion.poker2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by jesus.jimenez on 08/03/2017.
 */
public final class Baraja {

    //Baraja de 20 cartas con ases, doses, sotas, caballos y reyes de los cautro palos
    private static ArrayList<Carta> mBaraja = new ArrayList<>();

    private static void inicializarBaraja() throws Carta.CartaExcepcion {
        mBaraja.clear();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                mBaraja.add(new Carta((i * 100) + j));
            }
        }
    }

    /**
     * Crea una mano para jugar
     * @return Arraylist con una mano de cinco cartas
     * @throws es.jimenezhidalgo.uni.programacion.poker2.Carta.CartaExcepcion devuelve una excepción de carta
     */
    public static ArrayList<Carta> crearMano() throws Carta.CartaExcepcion {
        ArrayList<Carta> mano = new ArrayList<>();

        inicializarBaraja();
        Collections.shuffle(mBaraja);

        for (int i = 0; i < 5; i++) {
            mano.add(mBaraja.get(i));
        }

        return mano;
    }
}
