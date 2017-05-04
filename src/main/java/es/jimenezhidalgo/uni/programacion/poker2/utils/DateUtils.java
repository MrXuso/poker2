package es.jimenezhidalgo.uni.programacion.poker2.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public class DateUtils {

    public static int getDiferenciaAnios(Date fechaInicial, Date fechaFinal){
        Calendar calInical = Calendar.getInstance();
        calInical.setTime(fechaInicial);

        Calendar calFinal = Calendar.getInstance();
        calFinal.setTime(fechaFinal);

        int diferenciaAnios = calFinal.get(Calendar.YEAR) - calInical.get(Calendar.YEAR);

        if (calFinal.get(Calendar.DAY_OF_YEAR) < calInical.get(Calendar.DAY_OF_YEAR)) {
            diferenciaAnios--;
        }

        return diferenciaAnios;
    }
}
