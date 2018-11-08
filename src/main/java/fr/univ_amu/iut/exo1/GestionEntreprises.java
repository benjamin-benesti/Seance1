package fr.univ_amu.iut.exo1;

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

        Employe emp1 = new Employe(1,"7654","hervé","jean pierre",5,date,date2,base,heure);
        Employe emp2 = new Employe(4,"78765","gaulois","michel",58,date2,date,heure,base);

        maBoiteInfo.embaucher(emp1);
        maBoiteInfo.embaucher(emp2);

        System.out.println(maBoiteInfo);



    }
}