package biblio.metier;

import java.time.LocalDate;
import java.util.Objects;

public class Livre extends Ouvrage {
    private String isbn;
    private int nombrePages;
    private String resumer;
    private TypeLivre typeLivre;

    public Livre(String titre, int ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre,String isbn,int nombrePages,TypeLivre typeLivre,String resumer) {
        super(titre, ageMin, dateParution, prixLocation, langue, genre);
        this.isbn=isbn;
        this.nombrePages=nombrePages;
        this.typeLivre=typeLivre;
        this.resumer=resumer;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public String getResumer() {
        return resumer;
    }

    public void setResumer(String resumer) {
        this.resumer = resumer;
    }

    public TypeLivre getTypeLivre() {
        return typeLivre;
    }

    public void setTypeLivre(TypeLivre typeLivre) {
        this.typeLivre = typeLivre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Livre livre = (Livre) o;
        return nombrePages == livre.nombrePages && Objects.equals(isbn, livre.isbn) && Objects.equals(resumer, livre.resumer) && Objects.equals(typeLivre, livre.typeLivre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbn, nombrePages, resumer, typeLivre);
    }

    @Override
    public String toString() {
        return "Livre{" +
                "isbn='" + isbn + '\'' +
                ", nombrePages=" + nombrePages +
                ", resumer='" + resumer + '\'' +
                ", typeLivre=" + typeLivre +
                '}';
    }
}

