package es.jimenezhidalgo.uni.programacion.poker2;

public class Carta {

    public static class CartaExcepcion extends Exception{

        public static final String CARTA_INCORRECTA = "El valor de la carta es incorrecto";

        public CartaExcepcion(String mensaje) {
            super(mensaje);
        }
    }

    private static final String[] PALOS = {"Oros", "Copas", "Espadas", "Bastos"};
    private static final String[] FIGURAS = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota", "Caballo", "Rey"};

    /*
     * 0-Oros 1-Copas 2-Espadas 3-Bastos
     */
    private int mPalo;
    /*
     * 0-As 1-Dos ... 9-Sota 10-Caballo 11-Rey
     */
    private int mFigura;

    /**
     * Constructor que recibe un entero y lo convierte en carta
     * @param carta entero de la forma palo * 100 + figura
     * @throws es.jimenezhidalgo.uni.programacion.poker2.Carta.CartaExcepcion una excepción personalizada si ocurre un error al intentar crear una carta imposible
     */
    public Carta(int carta) throws CartaExcepcion {

        if (carta < 0 || carta > 311 || carta % 100 > 11){
            throw new CartaExcepcion(CartaExcepcion.CARTA_INCORRECTA);
        }

        mPalo = carta / 100;
        mFigura = carta % 100;
    }

    @Override
    public String toString() {
        return FIGURAS[mFigura] + " de " + PALOS[mPalo];
    }

    /**
     * Comparamos las figuras de dos cartas
     * @param carta Carta con la que comparamos la figura
     * @return true si es la misma figura
     */
    public boolean mismaFigura(Carta carta){
        return (mFigura == carta.mFigura);
    }

    /**
     * Comparamos los palos de dos cartas
     * @param carta Carta con la que comparamos el palo
     * @return true si es el mismo palo
     */
    public boolean mismoPalo(Carta carta){
        return (mPalo == carta.mPalo);
    }

    public int getCartaInt(){
        return mPalo * 100 + mFigura;
    }

    public static int getCartaInt(Carta carta){
        return carta.getCartaInt();
    }
}