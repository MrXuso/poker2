package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.exceptions.JugadorException;
import es.jimenezhidalgo.uni.programacion.poker2.utils.DateUtils;
import java.util.Date;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public abstract class Jugador {

    private String mNif;
    private String mNombre;
    private String mApellidos;
    private double mSaldo;
    private Date mFechaNacimiento;

    public Jugador(String nif, String nombre, String apellidos, double saldo, Date fechaNacimiento) throws JugadorException {
        mNif = nif;
        mNombre = nombre;
        mApellidos = apellidos;
        mSaldo = saldo;
        if (DateUtils.getDiferenciaAnios(fechaNacimiento, new Date()) < 18) {
            throw new JugadorException(JugadorException.EDAD_INCORRECTA);
        } else {
            mFechaNacimiento = fechaNacimiento;
        }
    }

    public String getNif() {
        return mNif;
    }

    public String getNombre() {
        return mNombre;
    }

    public String getApellidos() {
        return mApellidos;
    }

    public double getSaldo() {
        return mSaldo;
    }

    public Date getFechaNacimiento() {
        return mFechaNacimiento;
    }

    public void setSaldo(double saldo) {
        mSaldo = saldo;
    }

    public abstract double retirarBeneficios();

    public void aumentarSaldo(double cantidad) {
        if (cantidad > 0) {
            mSaldo += cantidad;
        } else {
            //TODO: Excepcion
        }
    }
    
    /**
     * Retira del saldo el dinero apostado
     * @param cantidad Cantidad de dinero que ha apostado el jugador
     */
    public void apuestaDinero(double cantidad){
        mSaldo -= cantidad;
    }
    
    /**
     * Añade la cantidad de dinero ganada al apostar al saldo
     * @param cantidad Cantidad ganada por el jugador
     */
    public void ganaDineroApuesta(double cantidad){
        mSaldo += cantidad;
    }
}
