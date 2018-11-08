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
    private Double Base;
    private Double NbHeure;

    public Employe(int numEmp, String numSecSoc, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche ,Double base,Double nbHeure)
    {
        this.NumEmp = numEmp;
        this.NumSecSoc = numSecSoc;
        this.Nom = nom;
        this.Prenom = prenom;
        this.Echelon = echelon;
        this.Naissance = naissance;
        this.Embauche = embauche;
        this.Base = base;
        this.NbHeure = nbHeure;
    }

    protected int getNumEmp() {
        return this.NumEmp;
    }

    protected String getNumSecSoc() {
        return this.NumSecSoc;
    }

    protected String getNom() {
        return this.Nom;
    }

    protected String getPrenom() {
        return this.Prenom;
    }

    protected int getEchelon() {
        return this.Echelon;
    }

    protected LocalDate getNaissance() {
        return this.Naissance;
    }

    protected LocalDate getEmbauche() {
        return this.Embauche;
    }

    protected Double getBase() {return this.Base;}

    protected Double getNbHeure(){return this.NbHeure ;}

    public void toString(Employe e)
    {
        System.out.println((e.getNom()+e.getPrenom()+e.getNumEmp()+e.getNumSecSoc()+e.getEchelon()+e.getNaissance()+e.getEmbauche())+CalcSalBrut(e)+CalcSalNet(e));
    }

    public Double CalcSalBrut (Employe e)
    {
        return e.getBase() *  e.getNbHeure();
    }

    public Double CalcSalNet (Employe e)
    {
        return e.getBase() *  e.getNbHeure() * 80 /100 ;
    }

}
