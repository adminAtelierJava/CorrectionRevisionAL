/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wiemhjiri
 */
public class Medecin{
    private int cin;
    private String nom;
    private String prenom;
    private int numOrdre;

    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    
    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass())
            return false;
        Medecin p=(Medecin) obj;
        if(p.cin==cin&& p.nom.equals(nom))
            return true;
        return false;
    }
public int hashCode()
{
    return cin+nom.hashCode();
}

    @Override
    public String toString() {
        return "Medecin{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numOrdre=" + numOrdre +
                '}';
    }
}
