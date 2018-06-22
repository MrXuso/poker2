package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.utils.PremiosUtils;

import java.util.ArrayList;

/**
 * Created by jesus.jimenez on 07/05/2017.
 */
public class Apuesta {

    private Jugador mJugador;
    private ArrayList<Carta> mMano;
    private double mCantidadApostada;

    public Apuesta(Jugador jugador, ArrayList<Carta> mano, double cantidadApostada) {
        mJugador = jugador;
        mMano = mano;
        mCantidadApostada = cantidadApostada;
    }

    /**
     * Nos devuelve un objeto de tipo premio que contiene el premio económico y la combinacion de cartas
     * @return objeto de tipo premio que contiene el premio económico y la combinacion de cartas
     */
    public Premio verPremio(){
        double premioEconomico = 0;
        int combinacion = PremiosUtils.NO_TIENE_NADA;

        switch (PremiosUtils.comprobarCombinacionEnMano(mMano)){
            case PremiosUtils.TIENE_PAREJA:
                combinacion = PremiosUtils.TIENE_PAREJA;
                premioEconomico = mCantidadApostada;
                break;
            case PremiosUtils.TIENE_DOBLE_PAREJA:
                combinacion = PremiosUtils.TIENE_DOBLE_PAREJA;
                premioEconomico = mCantidadApostada * 2;
                break;
            case PremiosUtils.TIENE_TRIO:
                combinacion = PremiosUtils.TIENE_TRIO;
                if (mJugador.getClass().equals(JugadorRegistrado.class)){
                    premioEconomico = mCantidadApostada * 4;
                } else {
                    premioEconomico = mCantidadApostada * 3;
                }
                break;
            case PremiosUtils.TIENE_COLOR:
                combinacion = PremiosUtils.TIENE_COLOR;
                if (mJugador.getClass().equals(JugadorRegistrado.class)){
                    premioEconomico = mCantidadApostada * 6;
                } else {
                    premioEconomico = mCantidadApostada * 4;
                }
                break;
            case PremiosUtils.TIENE_FULL:
                combinacion = PremiosUtils.TIENE_FULL;
                if (mJugador.getClass().equals(JugadorRegistrado.class)){
                    premioEconomico = mCantidadApostada * 8;
                } else {
                    premioEconomico = mCantidadApostada * 5;
                }
                break;
            case PremiosUtils.TIENE_POKER:
                combinacion = PremiosUtils.TIENE_POKER;
                if (mJugador.getClass().equals(JugadorRegistrado.class)){
                    premioEconomico = mCantidadApostada * 10;
                } else {
                    premioEconomico = mCantidadApostada * 6;
                }
                break;
            default:
                combinacion = PremiosUtils.NO_TIENE_NADA;
                break;
        }

        return new Premio(combinacion, premioEconomico);
    }

    /**
     * Clase Premio que nos permite devolver los premios de manera más sencilla
     */
    public class Premio {
        private int mCombinacion;
        private double premioEconomico;

        Premio(int combinacion, double premioEconomico) {
            mCombinacion = combinacion;
            this.premioEconomico = premioEconomico;
        }

        public int getCombinacion() {
            return mCombinacion;
        }

        public double getPremioEconomico() {
            return premioEconomico;
        }
    }
}
