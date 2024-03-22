package Repository;

import Domain.Entitate;
import Exceptions.DoesntExistException;
import Exceptions.DuplicateEntityException;

import java.util.ArrayList;

public interface IRepo<T extends Entitate> {

    void add(T e)throws DuplicateEntityException;
    void update(T e) throws DoesntExistException;
    void delete(int id) throws DoesntExistException;
    T getById(int id);
    int size();
    ArrayList<T> getAll();

}

