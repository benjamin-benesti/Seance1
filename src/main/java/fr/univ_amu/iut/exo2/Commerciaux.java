package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Commerciaux extends Employe
{
    private double chiffreAffaire;
    private double tauxCommision;

    public Commerciaux(){}

    public Commerciaux(int numEmp, String numSecSoc, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, Double base, Double nbHeure, double chiffreAffaire, double tauxCommision) {
        super(numEmp, numSecSoc, nom, prenom, echelon, naissance, embauche, base, nbHeure);
        this.chiffreAffaire = chiffreAffaire;
        this.tauxCommision = tauxCommision;
    }

    public void negocierTransaction()
    {
        System.out.println("je négocie une transaction");
    }


    public Double CalcSalBrut()
    {
      return super.CalcSalBrut()/getNbHeure() + chiffreAffaire * tauxCommision;
    }
}
