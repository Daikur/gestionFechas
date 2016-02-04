/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class fechas {

    public static void main(String[] args) {
        Date hoy = new Date();
        System.out.println(hoy);

        GregorianCalendar d1 = new GregorianCalendar(2016, 7, 30);
        Date fecha = d1.getTime();
        System.out.println(fecha);

        GregorianCalendar d2 = new GregorianCalendar(2013, 11, 30, 14, 30, 14);
        Date fecha_hora = d2.getTime();
        System.out.println(fecha_hora);

        GregorianCalendar d3 = new GregorianCalendar();
        d3.setTime(hoy);
        int anyo = d3.get(GregorianCalendar.YEAR);
        System.out.println("año " + anyo);
        int mes = d3.get(GregorianCalendar.MONTH);
        System.out.println("mes " + mes);
        int dia = d3.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("dia " + dia);
        int dia_semana = d3.get(GregorianCalendar.DAY_OF_WEEK);
        System.out.println(dia_semana);
        new SimpleDateFormat("HH:mm:ss");
        int hora = d3.get(GregorianCalendar.HOUR);
        int min = d3.get(GregorianCalendar.MINUTE);

        System.out.println(hora + ":" + min);

        d3.add(GregorianCalendar.YEAR, 3);
        Date d4 = d3.getTime();
        System.out.println(d4);

        DateFormat formatF = DateFormat.getDateInstance();
        String formato_fecha = formatF.format(hoy);
        System.out.println(formato_fecha);
        //a
        DateFormat formatF1 = DateFormat.getDateInstance(DateFormat.FULL);
        String formato2_fecha = formatF1.format(hoy);
        System.out.println("a: " + formato2_fecha);

        Locale fEspañol = new Locale("es", "ES", "Traditional WIN");
        DateFormat formatF3 = DateFormat.getDateInstance(DateFormat.FULL, fEspañol);
        String formato3_fecha = formatF3.format(hoy);

    }

}
