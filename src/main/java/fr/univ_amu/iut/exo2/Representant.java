package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Representant extends Commerciaux
{
    public Representant(int numEmp, String numSecSoc, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, Double base, Double nbHeure, double chiffreAffaire, double tauxCommision) {
        super(numEmp, numSecSoc, nom, prenom, echelon, naissance, embauche, base, nbHeure, chiffreAffaire, tauxCommision);
    }

    @Override
    public Double CalcSalBrut()
    {
        Employe_Ordinaire emp =new Employe_Ordinaire(getNumEmp(),getNumSecSoc(),getNom(),getPrenom(),getEchelon(),getNaissance(),getEmbauche(),getBase(),getNbHeure());
        return emp.CalcSalBrut();
    }
}
