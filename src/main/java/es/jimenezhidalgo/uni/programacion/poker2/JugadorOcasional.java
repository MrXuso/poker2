package es.jimenezhidalgo.uni.programacion.poker2;

import es.jimenezhidalgo.uni.programacion.poker2.exceptions.JugadorException;
import es.jimenezhidalgo.uni.programacion.poker2.utils.FacturaUtil;
import java.util.Date;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public class JugadorOcasional extends Jugador {

    private String mNumeroTarjeta;

    public JugadorOcasional(String nif, String nombre, String apellidos, double saldo, Date fechaNacimiento, String numeroTarjeta) throws JugadorException {
        super(nif, nombre, apellidos, saldo, fechaNacimiento);
        mNumeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return mNumeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        mNumeroTarjeta = numeroTarjeta;
    }


    public double retirarBeneficios() {

        if (getSaldo() > 0) {
            double saldo = getSaldo();
            FacturaUtil.crearFactura(this, saldo);
            setSaldo(0);
            return saldo;
        }
        return -1;
    }
}
