/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author wiemhjiri
 */
public class SetMedecins {
    private Set<Medecin> setM;

    public SetMedecins(){
        setM=new HashSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);//hashCode et equals
    }

    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(e->e.getCin()==cin);
    }

    public void afficherMedecins() {
        setM.forEach(e-> System.out.println(e));
    }
    
    public long nombreMedecins(){
        return setM.stream().count();
    }
    
    public TreeSet<Medecin> trierMedecins(){
        //TreeSet<Medecin> tr=new TreeSet<>();//erreur d'exéc si comparable n'est pas implémebt
       /* TreeSet<Medecin> tr=new TreeSet<>((a,v)->a.getCin()-v.getCin());
        tr.addAll(setM);
        return tr;*/

        return setM.stream().collect(Collectors.toCollection(()->new TreeSet<>((a,v)->a.getCin()-v.getCin())));
    }
    
}
