package biblio.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ouvrage {
    protected String titre;
    protected int ageMin;
    protected LocalDate dateParution;
    protected TypeOuvrage typeouvrage;
    protected double prixLocation;
    protected String langue;
    protected String genre;
    private List<Auteur> listauteur = new ArrayList<>();
    private List<Exemplaire> listexemplaire = new ArrayList<>();


    public Ouvrage(String titre, int ageMin, LocalDate dateParution, double prixLocation, String langue, String genre) {
        this.titre = titre;
        this.ageMin = ageMin;
        this.dateParution = dateParution;
        this.prixLocation = prixLocation;
        this.langue = langue;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public LocalDate getDateParution() {
        return dateParution;
    }

    public void setDateParution(LocalDate dateParution) {
        this.dateParution = dateParution;
    }

    public double getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(double prixLocation) {
        this.prixLocation = prixLocation;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Auteur> getListauteur() {
        return listauteur;
    }

    public void setListauteur(List<Auteur> listauteur) {
        this.listauteur = listauteur;
    }

    public List<Exemplaire> getListexemplaire() {
        return listexemplaire;
    }

    public void setListexemplaire(List<Exemplaire> listexemplaire) {
        this.listexemplaire = listexemplaire;
    }

    public TypeOuvrage getTypeouvrage() {
        return typeouvrage;
    }

    public void setTypeouvrage(TypeOuvrage typeouvrage) {
        this.typeouvrage = typeouvrage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ouvrage ouvrage = (Ouvrage) o;
        return ageMin == ouvrage.ageMin && Double.compare(prixLocation, ouvrage.prixLocation) == 0 && Objects.equals(titre, ouvrage.titre) && Objects.equals(dateParution, ouvrage.dateParution) && Objects.equals(langue, ouvrage.langue) && Objects.equals(genre, ouvrage.genre) && Objects.equals(listauteur, ouvrage.listauteur) && Objects.equals(listexemplaire, ouvrage.listexemplaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, ageMin, dateParution, prixLocation, langue, genre, listauteur, listexemplaire);
    }

    @Override
    public String toString() {
        return "Ouvrage{" +
                "titre='" + titre + '\'' +
                ", ageMin=" + ageMin +
                ", dateParution=" + dateParution +
                ", prixLocation=" + prixLocation +
                ", langue='" + langue + '\'' +
                ", genre='" + genre + '\'' +
                ", listauteur=" + listauteur +
                ", listexemplaire=" + listexemplaire +
                '}';
    }
}
