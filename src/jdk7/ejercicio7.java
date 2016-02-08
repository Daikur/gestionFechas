/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ejercicio7 {

    public static void main(String[] args) {
        Date hoy = new Date();
        GregorianCalendar gr = new GregorianCalendar();

// Ejercicio 7
        //a
//        int dia = gr.get(GregorianCalendar.DAY_OF_MONTH);
//        int mes = gr.get(GregorianCalendar.DAY_OF_MONTH);
//        int anyo = gr.get(GregorianCalendar.YEAR);
//        int hora = gr.get(GregorianCalendar.HOUR);
//        int minutos = gr.get(GregorianCalendar.MINUTE);
//
//        String diasS[] = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
//
//        String mesA[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
//            "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
//
//        System.out.println("Hoy es " + diasS[dia] + ", día " + dia + " de " + mesA[gr.get(Calendar.MONTH)] + " del año " + anyo + " y son las " + hora + ":" + minutos + ".");

        //b   
        DateFormat formato_2 = new SimpleDateFormat("dd-MM-yy");
        String fechaL = formato_2.format(hoy);
        System.out.println(fechaL);

        //c
        DateFormat formato_3 = new SimpleDateFormat("yyyy.MM.yy H:m:s:S");
        fechaL = formato_3.format(hoy);
        System.out.println(fechaL);

        //d
        DateFormat formato_4 = new SimpleDateFormat("EE,MMM d,''yy");
        fechaL = formato_4.format(hoy);
        System.out.println(fechaL);

        //e
        DateFormat formato_5 = new SimpleDateFormat("K:mm a");
        fechaL = formato_5.format(hoy);
        System.out.println(fechaL);

        //f
        DateFormat formato_6 = new SimpleDateFormat("H:m:s:S");
        fechaL = formato_6.format(hoy);
        System.out.println(fechaL);

        //6
        DateFormat formato_7 = new SimpleDateFormat("yyyy.MMMM.dd H:m");
        fechaL = formato_7.format(hoy);
        System.out.println(fechaL);

        //prueba
        Locale fEspañol = new Locale("es", "ES", "Traditional WIN");
        DateFormat formatF
                = DateFormat.getDateInstance(DateFormat.SHORT, fEspañol);
        String fecha = formatF.format(hoy);

        //
        DateFormat formateador = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ITALIAN);
        fechaL = formateador.format(hoy);
        System.out.println("Fecha media: " + fechaL);

    }

}
