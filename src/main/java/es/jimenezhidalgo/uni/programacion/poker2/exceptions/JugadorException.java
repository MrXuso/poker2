package es.jimenezhidalgo.uni.programacion.poker2.exceptions;

/**
 * Created by jesus.jimenez on 07/05/2017.
 */
public class JugadorException extends Exception{

    public static final String JUGADOR_YA_REGISTRADO = "El jugador ya había sido registrado";

    public static final String SALDO_INSUFICIENTE = "Saldo insuficiente";

    public static final String NIF_INCORRECTO = "NIF incorrecto";

    public static final String CONTRASENIA_INCORRECTA = "Contraseña incorrecta";

    public static final String EDAD_INCORRECTA = "Edad incorrecta";

    public JugadorException() {
        super("Se ha producido un error en el programa");
    }

    public JugadorException(String message) {
        super(message);
    }
}
