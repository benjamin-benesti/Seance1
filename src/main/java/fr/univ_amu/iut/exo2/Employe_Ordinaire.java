package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Employe_Ordinaire extends Employe
{


    public Employe_Ordinaire(int numEmp, String numSecSoc, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, Double base, Double nbHeure) {
        super(numEmp, numSecSoc, nom, prenom, echelon, naissance, embauche, base, nbHeure);
    }

    public void effectuerTacheOrdinaire()
    {
        System.out.println("j'effectue une tâche ordinaire");
    }

    public Double CalcSalBrut()
    {
        return super.CalcSalBrut() + getEchelon() *100;
    }
}
