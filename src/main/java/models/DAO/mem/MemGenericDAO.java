package models.DAO.mem;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import models.DAO.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

    private TreeMap<ID, T> map = new TreeMap<ID, T>();

    protected abstract ID getID(T Entity);

    public void create(T entity) { 
        assert !map.containsKey(this.getID(entity)): "La entidad a crear ya existe";
        map.put(this.getID(entity), entity);
    }

    public T read(ID id) {
        assert map.containsKey(id): "La entidad a leer no existe";
        return map.get(id);
    }

    public void update(T entity) {
        assert map.containsKey(this.getID(entity)): "La entidad a actualizar no existe";
        map.put(this.getID(entity), entity);
    }

    public void delete(T entity) {
        assert map.containsKey(this.getID(entity)): "La entidad a borrar no existe";
        map.remove(this.getID(entity));
    }

    public void deleteByID(ID id) {
        assert map.containsKey(id): "La entidad a borrar no existe";
        map.remove(id);
    }

    public List<T> findAll() {
        return new ArrayList<T>(map.values());
    }

    public List<T> findAll(int index, int size) {
        List<T> listaEntidades = new ArrayList<T>(map.values());
        return listaEntidades.subList(index, size);
    }

}
