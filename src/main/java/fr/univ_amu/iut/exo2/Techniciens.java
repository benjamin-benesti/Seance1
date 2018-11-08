package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Techniciens extends Employe
{
    private int nbUnitesProduite;
    private double tauxComission;


    public Techniciens(int numEmp, String numSecSoc, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, Double base, Double nbHeure, int nbUnitesProduite, double tauxComission) {
        super(numEmp, numSecSoc, nom, prenom, echelon, naissance, embauche, base, nbHeure);
        this.nbUnitesProduite = nbUnitesProduite;
        this.tauxComission = tauxComission;
    }

    public void fabriquerProduit()
    {
        System.out.println("je fabrique un produit");
    }
    public Double CalcSalBrut()
    {
        return super.CalcSalBrut()+nbUnitesProduite *tauxComission;
    }
}
