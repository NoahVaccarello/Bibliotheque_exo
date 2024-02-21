package biblio.metier;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DVD extends Ouvrage{

    private Long code;
    private LocalTime dureeTotal;
    private byte nbreBonus;
    private List<String> autresLangues= new ArrayList<>();
    private List<String> sousTitres= new ArrayList<>();

    public DVD(String titre, byte ageMin, LocalDate dateParution, double prixLocation, String langue, String genre, Long code, LocalTime dureeTotal, byte nbreBonus, List<String> autresLangues, List<String> sousTitres) {
        super(titre, ageMin, dateParution, prixLocation, langue, genre);
        this.code = code;
        this.dureeTotal = dureeTotal;
        this.nbreBonus = nbreBonus;
        this.autresLangues = autresLangues;
        this.sousTitres = sousTitres;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public LocalTime getDureeTotal() {
        return dureeTotal;
    }

    public void setDureeTotal(LocalTime dureeTotal) {
        this.dureeTotal = dureeTotal;
    }

    public byte getNbreBonus() {
        return nbreBonus;
    }

    public void setNbreBonus(byte nbreBonus) {
        this.nbreBonus = nbreBonus;
    }

    public List<String> getAutresLangues() {
        return autresLangues;
    }

    public void setAutresLangues(List<String> autresLangues) {
        this.autresLangues = autresLangues;
    }

    public List<String> getSousTitres() {
        return sousTitres;
    }

    public void setSousTitres(List<String> sousTitres) {
        this.sousTitres = sousTitres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DVD dvd = (DVD) o;
        return nbreBonus == dvd.nbreBonus && Objects.equals(code, dvd.code) && Objects.equals(dureeTotal, dvd.dureeTotal) && Objects.equals(autresLangues, dvd.autresLangues) && Objects.equals(sousTitres, dvd.sousTitres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code, dureeTotal, nbreBonus, autresLangues, sousTitres);
    }
}
