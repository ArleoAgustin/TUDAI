package persistence.service;

import java.util.List;

public interface Dao<T> {

    public void crearTabla() throws Exception;
    public void add(T x) throws Exception;
    public void update(T x, T xNew) throws Exception;
    public void delete(T x) throws Exception;
    public List<T> getAll() throws Exception;
    public T getById(int id) throws Exception;
}
