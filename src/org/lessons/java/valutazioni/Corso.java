package org.lessons.java.valutazioni;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Corso {
    private ArrayList<Studente>studentiTot= new ArrayList<>();
    private ArrayList<Studente>promossi= new ArrayList<>();





    public List<Studente> getStudents(){
        return studentiTot;
    }
   /* public void removeStudent(int ID){
        for (int i=0; i< studentiTot.size(); i++){
            if (ID == studentiTot.get(i).getId()){

            }
        }

    }*/
   public void removeStudent(int ID){
       studentiTot.remove(ID-1);
   }
    public void addStudent(Studente nuovoStudente){
        studentiTot.add(nuovoStudente);

    }
    public List<Studente> getElencoPromossi(){

        return promossi;
    }
    public  double getPercStudentiPromossi (){

        for (Studente studente:studentiTot){
            if (studente.getStudentResult()){
                promossi.add(studente);

            }


        }
        double perPromossi =(promossi.size()*100.0/studentiTot.size());

        return perPromossi;

    }






}
