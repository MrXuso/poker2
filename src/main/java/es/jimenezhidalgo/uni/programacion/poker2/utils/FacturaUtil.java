package es.jimenezhidalgo.uni.programacion.poker2.utils;

import es.jimenezhidalgo.uni.programacion.poker2.Jugador;
import es.jimenezhidalgo.uni.programacion.poker2.JugadorOcasional;
import es.jimenezhidalgo.uni.programacion.poker2.JugadorRegistrado;

import java.io.*;
import java.util.Date;

/**
 * Created by jesus.jimenez on 07/05/2017.
 *
 * Esta clase nos permite generar una factura cuando el jugador haga un ingreso en su cuenta
 */
public class FacturaUtil {

    /**
     * Crea una factura en un archivo de texto con el nif del jugador y diversos datos.
     * @param jugador Jugador que ha retirado sus fondos
     * @param saldoRetirado cantidad de fondos retirados
     */
    public static void crearFactura(Jugador jugador, double saldoRetirado){
        try {
            Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("Factura_" + jugador.getNif() + ".txt"), "UTF-8"));

            String bonificacionMensaje = "";

            if (jugador.getClass().equals(JugadorRegistrado.class)){        //Si es un jugador registrado tendrá bonificación, si no no se aplica
                bonificacionMensaje = Integer.toString(DateUtils.getDiferenciaAnios(((JugadorRegistrado) jugador).getFechaRegistro(), new Date()) * 2) + "% de bonificación";
            } else if(jugador.getClass().equals(JugadorOcasional.class)){
                bonificacionMensaje = "No aplica por ser un jugador ocasional";
            }

            String cabecera = "\nFactura de " + jugador.getNombre() + " " + jugador.getApellidos() + " con NIF " + jugador.getNif() + "\n";
            writer.write(cabecera);

            for (int i = 0; i < cabecera.length() - 1; i++) {
                writer.write("-");      //Ponemos tantos guiones como carácteres tiene la cabecera
            }

            String cuerpo = "\n\n\n--" +
                    "\nFecha emitida: " + (new Date()).toString() +
                    "\n--" +
                    "\nCantidad retirada: " + saldoRetirado + "€" +
                    "\n--" +
                    "\nBonificacion por antigüedad: " + bonificacionMensaje +
                    "\n--" +
                    "\nConcepto: Ganancias poker" +
                    "\n--" +
                    "\n\n\nGRACIAS POR JUGAR CON NOSOTROS!";
            writer.write(cuerpo);

            writer.close();     //Cerramos el archivo
        } catch (IOException e){
            System.err.println("No se ha podido crear una factura");
            e.printStackTrace();
        }

    }
}
