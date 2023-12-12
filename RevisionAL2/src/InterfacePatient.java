/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wiemhjiri
 */
public interface InterfacePatient {
    public void ajouterPatient(Patient p);
    public void supprimerPatient(Patient p);
    public boolean rechercherPatient(Patient p);
    public boolean rechercherPatient(int cin);
    public void afficherPatients();
    public void trierPatientsParNom();

}
