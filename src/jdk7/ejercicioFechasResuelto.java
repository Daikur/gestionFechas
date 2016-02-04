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

/**
 *
 * @author daw1
 */
public class ejercicioFechasResuelto {

    public static void main(String[] args) {
        Date hoy = new Date();
        GregorianCalendar gr = new GregorianCalendar();

//      Hoy es 12 Martes de Febrero del 2016.
        int dia = gr.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = gr.get(GregorianCalendar.DAY_OF_MONTH);
        int anyo = gr.get(GregorianCalendar.YEAR);
        int hora = gr.get(GregorianCalendar.HOUR);
        int minutos = gr.get(GregorianCalendar.MINUTE);

        String diasS[] = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};

        String mesA[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        System.out.println("Hoy es " + diasS[dia] + ", día " + dia + " de " + mesA[gr.get(Calendar.MONTH)] + " del año " + anyo + " y son las " + hora + ":" + minutos + ".");
//      02-01-16 09:01:55
        DateFormat formato_2 = new SimpleDateFormat("dd-MM-yy HH:MM:ss");
        String fechaL = formato_2.format(hoy);
        System.out.println(fechaL);

//       mar 2 febrero 2016.
        DateFormat formato_3 = new SimpleDateFormat("EE d MMMM YYYY.");
        fechaL = formato_3.format(hoy);
        System.out.println(fechaL);

//      Escriba la fecha completa en formato:
//      a) En formato americano
//      b) español (creando una localizacion)
//        a)
        DateFormat formateador = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        fechaL = formateador.format(hoy);
        System.out.println(fechaL);

//        b)
        Locale fEsp = new Locale("es", "ES", "Traditional_WIN");

        fechaL = DateFormat.getDateInstance(DateFormat.FULL, fEsp).format(hoy);
        System.out.println(fechaL);

    }

}
