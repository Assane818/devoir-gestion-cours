package core;

import java.util.List;

public interface View<T> {
    public abstract T saisie();
    public abstract void affiche(List<T> datas);
}
