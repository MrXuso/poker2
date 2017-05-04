package es.jimenezhidalgo.uni.programacion.poker2;

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

    public Jugador(String nif, String nombre, String apellidos, double saldo, Date fechaNacimiento) {
        mNif = nif;
        mNombre = nombre;
        mApellidos = apellidos;
        mSaldo = saldo;
        mFechaNacimiento = fechaNacimiento;
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
}
