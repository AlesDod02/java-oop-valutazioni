package org.lessons.java.valutazioni;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random random= new Random();
        Corso corsoletteratura = new Corso();
        int numberofStudents = random.nextInt(10,20);

        for (int i = 0; i <numberofStudents ; i++) {

            int assenze= random.nextInt(0,100);
            double media = random.nextInt(0,5);
            Studente studente = new Studente(assenze,media
            );
            corsoletteratura.addStudent(studente);
            System.out.println(studente);


        }
        System.out.println("/////////////////////////////////////////////////");
        corsoletteratura.removeStudent(3);
        for (Studente student: corsoletteratura.getStudents()){
            System.out.println(student);
        }
        //creo un esempio di un corso


        double perPromossiLetteratura =corsoletteratura.getPercStudentiPromossi();
        DecimalFormat df = new DecimalFormat("#.##");
        String perPromossiLetteraturaFormatted = df.format(perPromossiLetteratura);
        System.out.println("la percentuale di studenti promossi è:"+ perPromossiLetteraturaFormatted + "%");
        System.out.println("ecco gli studenti promossi: ");
        for (Studente studentepromosso : corsoletteratura.getElencoPromossi()){
            System.out.println(studentepromosso);
        }


    }
}
