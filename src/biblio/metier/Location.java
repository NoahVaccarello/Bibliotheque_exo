package biblio.metier;

import java.time.LocalDate;
import java.util.Objects;

public class Location {

    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    private Lecteur amende;
    private Exemplaire exemplaire;

    public Location(LocalDate dateLoc, LocalDate dateRestitution, Lecteur amende, Exemplaire exemplaire) {
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
        this.amende = amende;
        this.exemplaire = exemplaire;
    }

    public LocalDate getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(LocalDate dateLoc) {
        this.dateLoc = dateLoc;
    }

    public LocalDate getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(LocalDate dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public Lecteur getAmende() {
        return amende;
    }

    public void setAmende(Lecteur amende) {
        this.amende = amende;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(dateLoc, location.dateLoc) && Objects.equals(dateRestitution, location.dateRestitution) && Objects.equals(amende, location.amende) && Objects.equals(exemplaire, location.exemplaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateLoc, dateRestitution, amende, exemplaire);
    }

    @Override
    public String toString() {
        return "Location{" +
                "dateLoc=" + dateLoc +
                ", dateRestitution=" + dateRestitution +
                ", amende=" + amende +
                ", exemplaire=" + exemplaire +
                '}';
    }
}
