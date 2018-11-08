package fr.univ_amu.iut.exo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

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

    public void distribuerBonus(long bonus)
    {
        Comparator<Employe> comparateurAncienneté = new Comparator<Employe>()
        {
            @Override
            public int compare(Employe o1, Employe o2)
            {
                return (o1.getEmbauche().compareTo(o2.getEmbauche()));
            }
        };

        PriorityQueue<Employe> queue = new PriorityQueue<Employe>(getList().size(),comparateurAncienneté);
        queue.addAll(getList());

            while (!(bonus == 0))
            {
                Employe emp = queue.poll();
                if ((bonus - emp.getAnciennete()*10 > 0))
                {
                    bonus = bonus - emp.getAnciennete()*10;
                    System.out.println(emp.getNom()+emp.getAnciennete()*10);
                    queue.remove(emp);
                }
                else
                {

                    System.out.println(emp.getNom()+bonus);
                    bonus = 0;
                    System.out.println("c'est la hess");
                    queue.remove(emp);
                }

            }
    }
}
