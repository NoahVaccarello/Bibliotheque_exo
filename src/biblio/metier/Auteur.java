package biblio.metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Noah Vaccarello
 * @version 1.0
 */

public class Auteur {
    private String nom;
    private String prenom;
    private String nationalite;
    private List<Ouvrage> listouvrage = new ArrayList<>();

    public Auteur(String nom, String prenom, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public List<Ouvrage> getListouvrage() {
        return listouvrage;
    }

    public void setListouvrage(List<Ouvrage> listouvrage) {
        this.listouvrage = listouvrage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auteur auteur = (Auteur) o;
        return Objects.equals(nom, auteur.nom) && Objects.equals(prenom, auteur.prenom) && Objects.equals(nationalite, auteur.nationalite) && Objects.equals(listouvrage, auteur.listouvrage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, nationalite, listouvrage);
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", listouvrage=" + listouvrage +
                '}';
    }
}
