package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Vendeur extends Commerciaux
{

    public Vendeur(int numEmp, String numSecSoc, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, Double base, Double nbHeure, double chiffreAffaire, double tauxCommision) {
        super(numEmp, numSecSoc, nom, prenom, echelon, naissance, embauche, base, nbHeure, chiffreAffaire, tauxCommision);
    }

    @Override
    public Double CalcSalBrut() {
        return super.CalcSalBrut();
    }
}
