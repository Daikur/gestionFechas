package jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static javax.print.attribute.Size2DSyntax.MM;

public class pruebas {

    public static void main(String[] args) {
        //YYY-MM-DD
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        System.out.println(hoy.getMonth());

        //Crear tus propias fechas (YYY-MM-DD)
        LocalDate fechaTope = LocalDate.of(2013, Month.DECEMBER, 12);
        System.out.println(fechaTope);

        //Hora (HH:MM:ss.SS)
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        //Dia y Hora (YYYY-MM-DDTHH:MM:ss:SS)
        LocalDateTime instante = LocalDateTime.now();
        System.out.println(instante);

        //Trabajar con fechas
        if (hoy.isBefore(fechaTope)) {
            System.out.println("Has llegado tarde");
        }

        LocalDate devolucion = hoy.plusWeeks(2).plusYears(2);
        System.out.println(devolucion);
        
        String fechaFormateada = hoy.format(DateTimeFormatter.ISO_DATE);
        
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = hoy.format(patron);
        String fecha1 = hoy.format(patron);
        System.out.println(fecha1);
    }

}
