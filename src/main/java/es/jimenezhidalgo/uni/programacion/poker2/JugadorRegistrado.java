package es.jimenezhidalgo.uni.programacion.poker2;

import java.util.Date;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public class JugadorRegistrado extends Jugador{

    private String mCuentaBancaria;
    private String mContrasenia;

    public JugadorRegistrado(String nif, String nombbre, String apellidos, double saldo, Date fechaNacimiento, String cuentaBancaria, String contrasenia) {
        super(nif, nombbre, apellidos, saldo, fechaNacimiento);
        mCuentaBancaria = cuentaBancaria;
        mContrasenia = contrasenia;
    }

    public String getCuentaBancaria() {
        return mCuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        mCuentaBancaria = cuentaBancaria;
    }

    public String getContrasenia() {
        return mContrasenia;
    }

    public void setContrasenia(String contrasenia) {
        mContrasenia = contrasenia;
    }

    public double retirarBeneficios() {

        if (getSaldo() > 0) {
            double saldo = getSaldo();
            //TODO: Añadir 2% por año
            setSaldo(0);
            return saldo;
        }

        //TODO:  Añadir excepción
        return -1;
    }
}
