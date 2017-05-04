package es.jimenezhidalgo.uni.programacion.poker2.utils;

import es.jimenezhidalgo.uni.programacion.poker2.Carta;

import java.util.ArrayList;

/**
 * Clase que nos permite abstraer las comprobaciones de qué lleva la mano de la clase Apuesta.
 */
public final class PremiosUtils {
    public static final int TIENE_COLOR = 1;
    public static final int TIENE_FULL = 2;
    public static final int TIENE_POKER = 3;
    public static final int NO_TIENE_NADA = -1;

    /**
     * Nos devuelve un int con la constante de lo que lleva la mano que le pasamos o -1 si no lleva nada.
     * Comprobamos qué lleva en las manos con un orden de prioridad (color vale más que full t full vale más que póker
     * @param mano array de cinco cartas (int[] de tamaño 5)
     * @return entero con un código con lo que tiene la mano.
     * El valor de ese código viene dado en las constantes definidas en esta calse.
     */
    public static int comprobarCombinacionEnMano(ArrayList<Carta> mano){
        if (tieneColor(mano)){
            return TIENE_COLOR;
        }

        if (tieneFull(mano)){
            return TIENE_FULL;
        }

        if (tienePoker(mano)){
            return TIENE_POKER;
        }

        return NO_TIENE_NADA;
    }

    /**
     * Comprueba si la mano tiene color
     * @param mano array de cinco cartas (int[] de tamaño 5)
     * @return true si la mano tiene color, false en caso contrario
     */
    private static boolean tieneColor(ArrayList<Carta> mano){

        /*Comparamos las cartas etre sí para ver si tienen diferente palo*/
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if(!mano.get(i).mismoPalo(mano.get(j))){ //Si dos son del mismo palo, entonces no tenemos color
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Comprueba si la mano tiene full
     * @param mano array de cinco cartas (int[] de tamaño 5)
     * @return true si la mano lleva full, false en caso contrario
     */
    private static boolean tieneFull(ArrayList<Carta> mano){

        int ocurrencias1 = 1, ocurrencias2 = 0;

        /*
        * Primero compruebo cuántas cartas hay en la mano que tengan la misma figura y
        * guardo el resultado en la variable ocurrencias1
        */
        for (int i = 1; i < 5; i++) {
            if (mano.get(0).mismaFigura(mano.get(i))){
                ocurrencias1++;
            }
        }

        /*
        * Si tenemos menos de dos cartas repetidas o más de tres entonces no podemos tener full
        */
        if (ocurrencias1 < 2 || ocurrencias1 > 3){
            return false;
        }

        /*
        * Busco la primera carta diferente a la primera carta de la mano
         */
        int cartaDiferente = 1;

        for (int i = 1; i < 5; i++) {
            if (!mano.get(i).mismaFigura(mano.get(0))){
                cartaDiferente = i;
                break;
            }
        }

        /*
        * Cuento el número de cartas iguales a la cartaDiferente a la primera carta de la mano
         */
        for (int i = 1; i < 5; i++) {
            if (mano.get(cartaDiferente).mismaFigura(mano.get(i))){
                ocurrencias2++;
            }
        }

        /*
        * En el caso de que la ocurrencia 1 y la 2 sumen 5, entonces tenemos trío y pareja,
        * por lo tanto es full
         */
        if (ocurrencias1 + ocurrencias2 != 5){
            return false;
        }

        return true;
    }

    /**
     * Comprueba si la mano tiene poker
     * @param mano array de cinco cartas (int[] de tamaño 5)
     * @return true si la mano lleva poker, false en caso contrario
     */
    private static boolean tienePoker(ArrayList<Carta> mano){

        /*
        * Contamos el número de cartas iguales dentro de la mano y
        * guardamos el valor dentro de la variable ocurrencias
        */
        for (int i = 0; i <= 1; i++) {

            int ocurrencias = 0;

            for (int j = 0; j < 5; j++) {
                /*Si la figura es la misma, aumentamos la variable ocurrencia*/
                if (mano.get(i).mismaFigura(mano.get(j))){
                    ocurrencias++;
                }
            }

            /*Si tenemos cuatro cartas iguales, tenemos poker y devolvemos true*/
            if (ocurrencias == 4){
                return true;
            }
        }

        return false;
    }
}
