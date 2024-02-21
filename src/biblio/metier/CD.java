package biblio.metier;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class CD extends Ouvrage{

    private Long code;
    private byte nbrePlages;
    private LocalTime dureeTotal;

    public CD(String titre, byte ageMin, LocalDate dateParution, double prixLocation, String langue, String genre, Long code, byte nbrePlages, LocalTime dureeTotal) {
        super(titre, ageMin, dateParution, prixLocation, langue, genre);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotal = dureeTotal;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public byte getNbrePlages() {
        return nbrePlages;
    }

    public void setNbrePlages(byte nbrePlages) {
        this.nbrePlages = nbrePlages;
    }

    public LocalTime getDureeTotal() {
        return dureeTotal;
    }

    public void setDureeTotal(LocalTime dureeTotal) {
        this.dureeTotal = dureeTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CD cd = (CD) o;
        return nbrePlages == cd.nbrePlages && Objects.equals(code, cd.code) && Objects.equals(dureeTotal, cd.dureeTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code, nbrePlages, dureeTotal);
    }
}
