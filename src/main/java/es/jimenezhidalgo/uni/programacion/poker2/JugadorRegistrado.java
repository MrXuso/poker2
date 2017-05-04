package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.utils.DateUtils;

import java.util.Date;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public class JugadorRegistrado extends Jugador{

    private String mCuentaBancaria;
    private String mContrasenia;
    private Date mFechaRegistro;

    public JugadorRegistrado(String nif, String nombbre, String apellidos, double saldo, Date fechaNacimiento, String cuentaBancaria, String contrasenia, Date fechaRegistro) {
        super(nif, nombbre, apellidos, saldo, fechaNacimiento);
        mCuentaBancaria = cuentaBancaria;
        mContrasenia = contrasenia;
        mFechaRegistro = fechaRegistro;
    }

    public Date getFechaRegistro() {
        return mFechaRegistro;
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

    public void setFechaRegistro(Date fechaRegistro) {
        mFechaRegistro = fechaRegistro;
    }

    public double retirarBeneficios() {

        if (getSaldo() > 0) {
            int anios = DateUtils.getDiferenciaAnios(mFechaRegistro, new Date());
            double multiplicador = 1 + (anios * 0.02);

            double saldo = getSaldo();
            setSaldo(0);
            
            return saldo * multiplicador;
        }

        //TODO:  Añadir excepción
        return -1;
    }
}
