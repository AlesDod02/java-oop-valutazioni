package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> students= new ArrayList<>();
        Random random= new Random();
        int numberofStudents = random.nextInt(10,20);

        for (int i = 0; i <3 ; i++) {

            int assenze= random.nextInt(0,100);
            double media = random.nextInt(0,5);
            Studente studente = new Studente(assenze,media
            );
            students.add(studente);
            System.out.println(studente);

        }
        Corso.getPercStudentiPromossi(students);

    }
}
