package entities;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private int id;
    private String nomComplet;
    private String tel;
    private static int nbreProf;
    private List<Cours> CoursProf = new ArrayList<>();

    public Professeur() {
        id = ++nbreProf;
    }
    public Professeur(String nomComplet, String tel) {
        id = ++nbreProf;
        this.nomComplet = nomComplet;
        this.tel = tel;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public static int getNbreProf() {
        return ++nbreProf;
    }
    public List<Cours> getCoursProf() {
        return CoursProf;
    }
    public void setCoursProf(Cours cours) {
        CoursProf.add(cours);
    }
    @Override
    public String toString() {
        return "Professeur [id=" + id + ", nomComplet=" + nomComplet + ", tel=" + tel + "]";
    }

}
