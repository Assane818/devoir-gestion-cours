package service;

import java.util.ArrayList;
import java.util.List;

import core.Service;
import entities.Professeur;

public class ProfesseurService implements Service<Professeur> {
    List<Professeur> professeurs = new ArrayList<>();

    @Override
    public boolean save(Professeur professeur) {
        professeurs.add(professeur);
        return true;
    }

    @Override
    public List<Professeur> show() {
        return professeurs;
    }

    @Override
    public Professeur getBy(String tel) {
        for (Professeur professeur : professeurs) {
            if (professeur.getTel().compareTo(tel) == 0) {
                return professeur;
            }
        }
        return null;
    }
    
}
