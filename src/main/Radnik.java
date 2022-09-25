package main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zaposleni")
public class Radnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zaposleni_id")
    private int id;

    @Column(name = "ime")
    private String ime;

    @Column(name = "godine")
    private int godine;

    @Column(name = "adresa")
    private String adresa;

    @Column(name = "dohodak")
    private int dohodak;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public int getGodine() {
        return godine;
    }

    public int getDohodak() {
        return dohodak;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setDohodak(int dohodak) {
        this.dohodak = dohodak;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Radnik(String ime, int godine, int dohodak, String adresa) {
        this.ime = ime;
        this.godine = godine;
        this.dohodak = dohodak;
        this.adresa = adresa;
    }

    public Radnik() {
    }

    @Override
    public String toString() {

        return "Id: " + id + "  Ime: " + ime + "   Godine: " + godine + "   Adresa: " + adresa + "   Dohodak: " + dohodak;

    }

}
