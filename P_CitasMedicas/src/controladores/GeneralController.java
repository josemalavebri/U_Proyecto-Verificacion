package controladores;

import java.util.ArrayList;
import Data.Repository;

public abstract class GeneralController<T> {
    
    protected Repository<T> db;

    public GeneralController(Repository<T> db) {
        this.db = db;
    }

    public abstract ArrayList<T> get();

    public abstract boolean post(T objeto);

    public abstract boolean put(T objeto);

    public abstract boolean delete(int id);
}
