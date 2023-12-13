package org.lessons.java.valutazioni;

import java.util.ArrayList;


public class Corso {
    private static ArrayList<Studente>gianni= new ArrayList<>();


    public static void getStudents(ArrayList<Studente>gianni){
        for (Studente studente: gianni){
            System.out.println(studente);
        }


    }
    public static void removeStudent(ArrayList<Studente>gianni,int ID){
        gianni.remove(ID);

    }
    public static void addStudent(ArrayList<Studente>gianni,Studente nuovoStudente){
        gianni.remove(nuovoStudente);

    }
    public static  void getPercStudentiPromossi (ArrayList<Studente>gianni){
        ArrayList<Studente>promossi= new ArrayList<>();
        for (Studente studente:gianni){
            if (studente.getStudentResult()){
                promossi.add(studente);

            }


        }
        System.out.println("la percentuale di studenti promossi è:"+(promossi.size()*100.0/(promossi.size()+gianni.size())));

    }






}
