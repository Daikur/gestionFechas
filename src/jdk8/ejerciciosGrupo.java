package jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejerciciosGrupo {

    public static void main(String[] args) {
        //Recoger la fecha del examen de programación y que nos diga cuántos dias faltan.
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué día es el examen de programación?: (dd/MM/yyyy)");
        String fechaProg = sc.next();
        
        LocalDateTime hoy = LocalDateTime.now();
        
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaProg, patron);
        
        int numDias = fecha.getDayOfMonth()-hoy.getDayOfMonth();
        
        System.out.println("Quedan : "+numDias+" dias.");
        
        //Dentro de 1 año ,3 meses y 15 días nos presentaremos al exámen del B1. Saca el día que corresponde al día del examen.
        
        LocalDate today = LocalDate.now();
        
        LocalDate dia_examen = today.plusYears(1).plusMonths(3).plusDays(15);
        
        System.out.println("El examen es el día: "+dia_examen);
        
        
    }
    
}
