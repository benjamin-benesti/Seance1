package fr.univ_amu.iut.exo1;


import java.time.LocalDate;

public class Employe
{
    private  int NumEmp;
    private String NumSecSoc;
    private String Nom;
    private String Prenom;
    private int Echelon;
    private LocalDate Naissance;
    private LocalDate Embauche;

    public Employe(int numEmp, String numSecSoc, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche)
    {
        this.NumEmp = numEmp;
        this.NumSecSoc = numSecSoc;
        this.Nom = nom;
        this.Prenom = prenom;
        this.Echelon = echelon;
        this.Naissance = naissance;
        this.Embauche = embauche;
    }

    public int getNumEmp() {
        return NumEmp;
    }

    public String getNumSecSoc() {
        return NumSecSoc;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getEchelon() {
        return Echelon;
    }

    public LocalDate getNaissance() {
        return Naissance;
    }

    public LocalDate getEmbauche() {
        return Embauche;
    }

    public void AffichePersonne(Employe e)
    {
        String affichage = e.getNom()+e.getPrenom()+e.getNumEmp()+e.getNumSecSoc()+e.getEchelon()+e.getNaissance()+e.getEmbauche();
    }

}
