package core;

import java.util.List;

public interface Service<T> {
    public abstract boolean save(T data);
    public abstract List<T> show();
    public abstract T getBy(String string);
}
