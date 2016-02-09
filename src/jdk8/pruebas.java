package jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class pruebas {

    public static void main(String[] args) {
        //YYY-MM-DD
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        //Hora
        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        //Crear tus propias fechas (YYY-MM-DD)
        LocalDate fechaTope = LocalDate.of(2013, Month.DECEMBER, 12);
        System.out.println(fechaTope);

        //Hora (HH:MM:ss.SS)
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        //Dia y Hora (YYYY-MM-DDTHH:MM:ss:SS)
        LocalDateTime instante = LocalDateTime.now();
        System.out.println(instante);

        //Trabajar con fechas (Antes, igual, despues..)
        if (hoy.isBefore(fechaTope)) {
            System.out.println("Has llegado tarde");
        }

        //Sumar años a una fecha
        LocalDate devolucion = hoy.plusWeeks(2).plusYears(2);
        System.out.println(devolucion);

        //formatear fecha a un formato predefinido
        String fechaFormateada = instante.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        System.out.println("fecha formateada: " + fechaFormateada);

        //Formatear fecha por patron
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = hoy.format(patron);
        System.out.println(fecha);

        //Pasar una fecha de String a LocalDate
        DateTimeFormatter patron1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String fecha1 = "2015/12/24";
        LocalDate fecha2 = LocalDate.parse(fecha1, patron1);
        System.out.println("fecha 2: " + fecha2);
    }

}
