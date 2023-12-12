/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wiemhjiri
 */
public class ListPatients implements InterfacePatient{
    private List<Patient> listP;

    public ListPatients(){
        listP=new ArrayList<>();
    }

    public List<Patient> getListP() {
        return listP;
    }

    @Override
    public void ajouterPatient(Patient p) {
       listP.add(p);
    }

    @Override
    public void supprimerPatient(Patient p) {
       listP.remove(p); //equals
    }

/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(Patient p) {
     //return listP.contains(p);//equals
   return listP.stream().anyMatch(pat->p.equals(pat));
    }
    
/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(int cin) {
       /* for (int i=0;i<listP.size();i++)
        {
            if (listP.get(i).getCin()==cin)
                return true;
        }
        return false;*/
        return listP.stream().anyMatch(e->e.getCin()==cin);
    }

    @Override
    public void afficherPatients() {
        listP.forEach(e->System.out.println(e));
        listP.stream().forEach(System.out::println);
    }
    
/* Avec lambda expression */
    @Override
    public void trierPatientsParNom() {
       // Collections.sort(listP);//il faut implémenter comparable
        Collections.sort(listP,(a,b)->a.getNom().compareTo(b.getNom()));
        listP.stream().sorted((a,b)->a.getNom().compareTo(b.getNom())).
                forEach(e-> System.out.println(e));

    }
    
/* Avec l'api stream */
    public void PatientSansRedondance(){
              listP.stream().distinct().forEach(e-> System.out.println(e));
    }
    
    /*Méthode toString */

    @Override
    public String toString() {
        String str="Liste patients";

        for (Patient p:listP)
            str+=p+"\n";
        return str;
    }
    
    
}
