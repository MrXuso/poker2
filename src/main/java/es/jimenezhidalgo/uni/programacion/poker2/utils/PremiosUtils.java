package es.jimenezhidalgo.uni.programacion.poker2.utils;

import es.jimenezhidalgo.uni.programacion.poker2.Carta;

import java.util.ArrayList;

/**
 * Clase que nos permite abstraer las comprobaciones de qué lleva la mano de la clase Apuesta.
 */
public final class PremiosUtils {
    public static final int TIENE_PAREJA = 1;
    public static final int TIENE_DOBLE_PAREJA = 2;
    public static final int TIENE_TRIO = 3;
    public static final int TIENE_COLOR = 4;
    public static final int TIENE_FULL = 5;
    public static final int TIENE_POKER = 6;
    public static final int NO_TIENE_NADA = -1;

    /**
     * Nos devuelve un int con la constante de lo que lleva la mano que le pasamos o -1 si no lleva nada.
     * Comprobamos qué lleva en las manos con un orden de prioridad (color vale más que full t full vale más que póker
     * @param mano array de cinco cartas (int[] de tamaño 5)
     * @return entero con un código con lo que tiene la mano.
     * El valor de ese código viene dado en las constantes definidas en esta calse.
     */
    public static int comprobarCombinacionEnMano(ArrayList<Carta> mano){

        if (tienePoker(mano)){
            return TIENE_POKER;
        }

        if (tieneFull(mano)){
            return TIENE_FULL;
        }

        if (tieneColor(mano)){
            return TIENE_COLOR;
        }

        if(tieneTrio(mano)){
            return TIENE_TRIO;
        }

        if (tieneDoblePareja(mano)){
            return TIENE_DOBLE_PAREJA;
        }

        if(tienePareja(mano)){
            return TIENE_PAREJA;
        }

        return NO_TIENE_NADA;
    }

    private static boolean tienePareja(ArrayList<Carta> mano){
        int ocurrencias = 1;

        for (int i = 0, aux = 1; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) continue;
                if (mano.get(i).mismaFigura(mano.get(j))) aux++;
            }
            if (aux > ocurrencias) ocurrencias = aux;
            aux = 1;
        }

        return ocurrencias == 2;

    }

    private static boolean tieneDoblePareja(ArrayList<Carta> mano) {
        int ocurrencias = 0;
        ArrayList<Carta> manoAux = new ArrayList<>();
        manoAux.addAll(mano);

        for (int i = 0, aux = 0; i < 4; i++, aux=0) {
            for (Carta unaCarta : manoAux) {
                if (manoAux.get(0).mismaFigura(unaCarta)) aux++;
            }
            if (aux  == 2) ocurrencias += 2;
            if (aux >= 3) return false;
            manoAux.remove(0);
        }

        return ocurrencias == 4;
    }

    private static boolean tieneTrio(ArrayList<Carta> mano){
        int ocurrencias = 1;

        for (int i = 0, aux = 1; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) continue;
                if (mano.get(i).mismaFigura(mano.get(j))) aux++;
            }
            if (aux > ocurrencias) ocurrencias = aux;
            aux = 1;
        }

        return ocurrencias == 3;

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
                if(!mano.get(i).mismoPalo(mano.get(j))){ //Si dos son de diferente palo, entonces no tenemos color
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

        int ocurrencias = 1;

        /*
        * Primero compruebo cuántas cartas hay en la mano que tengan la misma figura y
        * guardo el resultado en la variable ocurrencias
        */
        for (int i = 1; i < 5; i++) {
            if (mano.get(0).mismaFigura(mano.get(i))){
                ocurrencias++;
            }
        }

        /*
        * Si tenemos menos de dos cartas repetidas o más de tres entonces no podemos tener full
        */
        if (ocurrencias < 2 || ocurrencias > 3){
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
                ocurrencias++;
            }
        }

        /*
        * En el caso de que la ocurrencia 1 y la 2 sumen 5, entonces tenemos trío y pareja,
        * por lo tanto es full
         */
        return ocurrencias == 5;
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
