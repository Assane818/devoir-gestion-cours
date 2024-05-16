package service;

import java.util.ArrayList;
import java.util.List;

import core.Service;
import entities.Cours;

public class CoursService implements Service<Cours> {
    List<Cours> coursList = new ArrayList<>();

    @Override
    public boolean save(Cours cours) {
        coursList.add(cours);
        return true;
    }

    @Override
    public List<Cours> show() {
        return coursList;
    }

    @Override
    public Cours getBy(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBy'");
    }
    
}
