package fr.univ_amu.iut.exo1;

import java.util.ArrayList;
import java.util.List;

public class Entreprise
{
    private String nom;
    private List<Employe> listeEmploye = new ArrayList<Employe>();

    public Entreprise(String nom, List<Employe> listeEmploye)
    {
        this.nom = nom;
        this.listeEmploye = listeEmploye;
    }

    protected void setNom(String nom)
    {
        this.nom = nom;
    }

    protected String getNom() {
        return nom;
    }

    protected List<Employe> getListeEmploye() {
        return listeEmploye;
    }



    protected List<Employe> getList()
    {
        return this.listeEmploye;
    }

    public void embaucher(Employe e)
    {
        getList().add(e);
    }

    public void licencier (Employe e)
    {
        getList().remove(e);
    }
    @Override
    public String toString()
    {
        String statut = "";
        for (Employe emp : listeEmploye)
        {
            statut += emp.Afficher() + "\n";
        }

        return nom+" "+ statut;

    }
}
