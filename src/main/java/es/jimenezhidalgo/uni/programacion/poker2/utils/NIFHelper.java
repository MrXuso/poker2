package es.jimenezhidalgo.uni.programacion.poker2.utils;

import es.jimenezhidalgo.uni.programacion.poker2.exceptions.JugadorException;

/**
 * Created by jesus.jimenez on 07/05/2017.
 */
public class NIFHelper {

    private static final char LETRAS_NIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    //TODO implementar la validación de un NIF
    public static char getLetraNif(int Nif){
        return LETRAS_NIF[Nif % 23];
    }
    
    public static boolean comprobarLetraNif(String Nif) throws JugadorException {
        char letra;
        try {
            int nifNumero = Integer.parseInt(Nif.substring(0, 8));
            letra = LETRAS_NIF[nifNumero % 23];
            //letra = letras[NIF%23];
            if(letra != Nif.toUpperCase().toCharArray()[8]){
                throw new JugadorException(JugadorException.NIF_INCORRECTO);
            } else {
                return true;
            }
        } catch (Exception e){
            throw new JugadorException(JugadorException.NIF_INCORRECTO);
        }
    }
    
}
