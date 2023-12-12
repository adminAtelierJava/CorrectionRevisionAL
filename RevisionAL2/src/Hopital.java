/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author wiemhjiri
 */
public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
       medecinPatiens=new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
       medecinPatiens.put(m,new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
       if(medecinPatiens.containsKey(m))
       {
           medecinPatiens.get(m).ajouterPatient(p);
       }
       else {
           ajouterMedecin(m);
           medecinPatiens.get(m).ajouterPatient(p);
       }
        
    }
    /*Avec l'api stream */

    public void afficherMap() {
        /*First way*/

        medecinPatiens.forEach((e,v)->{
            System.out.println("Medecin :"+e);
          //  v.afficherPatients();
            System.out.println("Liste patient :"+v);
        });

        for (Map.Entry<Medecin,ListPatients> mp:medecinPatiens.entrySet())
        {
            System.out.println("Medecin :"+mp.getKey());
            System.out.println("List patient :"+mp.getValue());
        }
        /*Second Way */
        medecinPatiens.entrySet().stream().forEach(e->{
            System.out.println("Medecin :"+e.getKey());
            System.out.println("Liste Patient :"+e.getValue());
        });
        medecinPatiens.keySet().stream().forEach(m->{
            ListPatients l=medecinPatiens.get(m);
            System.out.println("Medecin :"+m);
            System.out.println("Liste patient :"+l);
        });
    }

    /* Afficher les patients dont le nom est "mohamed" 
    qui appartiennent au medecin m passé en paramétre */
    public void afficherMedcinPatients(Medecin m) {
        medecinPatiens.get(m).getListP().stream().
                filter(e->e.getPrenom().equalsIgnoreCase("mohamed")).
                forEach(e-> System.out.println(e));

    }



}
