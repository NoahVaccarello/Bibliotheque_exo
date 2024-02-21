package biblio.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lecteur {

    private String numLecteur;
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private String mail;
    private String adresse;
    private String tel;
    private List <Location> listLocation = new ArrayList<>();

    public Lecteur(String nom,String prenom,LocalDate dateNaiss,String adresse, String mail,String tel) {
        this.numLecteur = numLecteur;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
    }

    public String getNumLecteur() {
        return numLecteur;
    }

    public void setNumLecteur(String numLecteur) {
        this.numLecteur = numLecteur;
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

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Location> getListLocation() {
        return listLocation;
    }

    public void setListLocation(List<Location> listLocation) {
        this.listLocation = listLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecteur lecteur = (Lecteur) o;
        return Objects.equals(numLecteur, lecteur.numLecteur) && Objects.equals(nom, lecteur.nom) && Objects.equals(prenom, lecteur.prenom) && Objects.equals(dateNaiss, lecteur.dateNaiss) && Objects.equals(mail, lecteur.mail) && Objects.equals(adresse, lecteur.adresse) && Objects.equals(tel, lecteur.tel) && Objects.equals(listLocation, lecteur.listLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numLecteur, nom, prenom, dateNaiss, mail, adresse, tel, listLocation);
    }

    @Override
    public String toString() {
        return "Lecteur{" +
                "numLecteur=" + numLecteur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", mail='" + mail + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", listLocation=" + listLocation +
                '}';
    }
}
