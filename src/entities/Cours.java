package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cours {
    private int id;
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    private static int nbreCours;
    private Professeur professeur;
    public Cours() {
        id = ++ nbreCours;
    }
    public Cours(LocalDate date, LocalTime heureDb, LocalTime heureFin) {
        id = ++ nbreCours;
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getHeureDb() {
        return heureDb;
    }
    public void setHeureDb(LocalTime heureDb) {
        this.heureDb = heureDb;
    }
    public LocalTime getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }
    public static int getNbreCours() {
        return ++nbreCours;
    }

    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    @Override
    public String toString() {
        return "Cours [id=" + id + ", date=" + date + ", heureDb=" + heureDb + ", heureFin=" + heureFin
                + ", professeur=" + professeur.getNomComplet() + "]";
    }
    
}
