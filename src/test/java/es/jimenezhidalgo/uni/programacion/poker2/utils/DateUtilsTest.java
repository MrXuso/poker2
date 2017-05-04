package es.jimenezhidalgo.uni.programacion.poker2.utils;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by jesus.jimenez on 04/05/2017.
 */
public class DateUtilsTest {
    @Test
    public void getDiferenciaAnios() throws Exception {

        long milis = System.currentTimeMillis();
        Date start = new Date(milis);
        Date end = new Date(milis);
        end.setYear(end.getYear() + 1);

        assertEquals("expected 1", 1, DateUtils.getDiferenciaAnios(start,end), 0);

        end.setTime(end.getTime() - 24L*3600*1000);
        assertEquals("expected 0", 0, DateUtils.getDiferenciaAnios(start,end), 0);
    }
}