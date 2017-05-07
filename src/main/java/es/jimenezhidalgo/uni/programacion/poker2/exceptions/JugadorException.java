package es.jimenezhidalgo.uni.programacion.poker2.exceptions;

/**
 * Created by jesus.jimenez on 07/05/2017.
 */
public class JugadorException extends Exception{

    public static final String SALDO_INSUFICIENTE = "Saldo insuficiente";

    public static final String NIF_INCORRECTO = "NIF incorrecto";

    public static final String CONTRASENIA_INCORRECTA = "Contraseña incorrecta";

    public static final String EDAD_INCORRECTA = "Edad incorrecta";

    public JugadorException() {
        super();
    }

    public JugadorException(String message) {
        super(message);
    }
}