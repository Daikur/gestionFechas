package jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejerciciosGrupo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        LocalDateTime hoy = LocalDateTime.now();
//      1)
//      a. febrero, jueves 11 del '16
        DateTimeFormatter patronA = DateTimeFormatter.ofPattern("MMM, eee dd 'del' ''16");
        System.out.println(hoy.format(patronA));

//      b. 2016.02.11 12:46 PM
        DateTimeFormatter patronB = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm a");
        System.out.println(hoy.format(patronB));

//      c. Haz que dado un numero de días,introducido por teclado, los sume a la fecha actual 
//        y que saque por pantalla la fecha calculada.
        System.out.println("Introduce los días a sumar: ");
        long nDias = sc.nextLong();
        DateTimeFormatter patronC = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(hoy.plusDays(nDias).format(patronC));

//      2)        
//      a. Recoger la fecha del examen de programación y que nos diga cuántos dias faltan.
        System.out.println("¿Qué día es el examen de programación?: (dd/MM/yyyy)");
        String fechaProg = sc1.next();

        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaProg, patron);

        int numDias = fecha.getDayOfMonth() - hoy.getDayOfMonth();
        int numMeses = fecha.getMonthValue() - hoy.getMonthValue();

        System.out.println("Quedan : " + numDias + " dias y quedan " + numMeses + " meses.");

//      b. Dentro de 1 año ,3 meses y 15 días nos presentaremos al exámen del B1. Saca el día que corresponde al día del examen.
        LocalDate dia_examen = today.plusYears(1).plusMonths(3).plusDays(15);

        System.out.println("El examen es el día: " + dia_examen);

    }

}
