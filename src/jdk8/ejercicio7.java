package jdk8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ejercicio7 {

    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        LocalDateTime h = LocalDateTime.now();
        //a. “Hoy es Viernes, día 15 de Enero del año 2016 y son las 13:30”.

        DayOfWeek dia_Semana = hoy.getDayOfWeek();
        int dia = hoy.getDayOfMonth();
        int mes = hoy.getMonthValue() - 1;
        String mesA[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int anyo = hoy.getYear();
        int hora = ahora.getHour();
        int minutos = ahora.getMinute();

        //System.out.println("Hoy es " + dia_Semana + ", día " + dia + " de " + mesA[mes] + " del año " + anyo + " y son las " + hora + ":" + minutos + ".");
        DateTimeFormatter a = DateTimeFormatter.ofPattern("'Hoy es' eee, 'día' dd 'de' MM 'del año' yyyy 'y son las 'HH':'mm");
        String fechaa = hoy.format(a);
        System.out.println(fechaa);
        //b. 15-01-16
        DateTimeFormatter b = DateTimeFormatter.ofPattern("dd-MM-yy");
        String fechaB = hoy.format(b);
        System.out.println(fechaB);

        //c. 2016.01.15 13:30:15:55
        DateTimeFormatter c = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss:SS");
        String fechaC = h.format(c);
        System.out.println(fechaC);

        //d. viernes, Ene 15, '16
        DateTimeFormatter d = DateTimeFormatter.ofPattern("EEEE, MMM dd ''yy");
        String fechaD = h.format(d);
        System.out.println(fechaD);

        //e. 1:30 PM
        DateTimeFormatter e = DateTimeFormatter.ofPattern("H:mm a");
        String fechaE = h.format(e);
        System.out.println(fechaE);

        //f. 13:30:55:624
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss:SS");
        String fechaf = h.format(f);
        System.out.println(fechaf);

        //g. 2016.enero.15 13:30
        DateTimeFormatter g = DateTimeFormatter.ofPattern("yyy.MMMM.dd HH:mm");
        String fechag = h.format(g);
        System.out.println(fechag);

    }

}
