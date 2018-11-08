package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;
import fr.univ_amu.iut.exo1.Entreprise;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args)
    {
        List<Employe> liste =new ArrayList<>();
        Entreprise maBoiteInfo = new Entreprise("maBoiteInfo", liste);

        LocalDate date = LocalDate.of(2018, Month.APRIL,5);
        LocalDate date2 = LocalDate.of(2001, Month.JANUARY,6);
        Double base = 1500.00;
        Double heure = 10.15;

        Vendeur emp1 = new Vendeur(1,"7654","hervé","jean pierre",5,date,date2,base,heure,2500.5,80.4);
        Representant emp2 = new Representant(4,"78765","gaulois","michel",58,date2,date,base,heure,2500.5,80.4);
        Techniciens tec = new Techniciens(4,"544564","yolo","whynot",9,date,date2,base,heure,8500,40.0);


        maBoiteInfo.embaucher(emp1);
        maBoiteInfo.embaucher(emp2);
        maBoiteInfo.embaucher(tec);


        System.out.println(maBoiteInfo);

    }
}