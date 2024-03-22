package Service;

import Domain.Masina;
import Exceptions.DoesntExistException;
import Exceptions.DuplicateEntityException;
import Repository.IRepo;

import java.io.IOException;
import java.util.ArrayList;

public class ServiceMasini {

    IRepo<Masina> repoMasini;

    public ServiceMasini(IRepo<Masina> repoMasini){
        this.repoMasini = repoMasini;
    }

    public void adaugaMasina(int id, String marca, String nume) throws IOException, DuplicateEntityException {
        Masina m = new Masina(id, marca, nume);
        repoMasini.add(m);
    }

    public void modificaMasina(int id, String marca, String nume) throws DoesntExistException {
        Masina m = new Masina(id, marca, nume);
        repoMasini.update(m);
    }

    public void stergeMasina(int id) throws Exception {
        repoMasini.delete(id);
    }

    public Masina getMasina(int id){
        return repoMasini.getById(id);
    }
    public ArrayList<Masina> getMasini(){
        return repoMasini.getAll();
    }

    public int nrMasini(){
        return repoMasini.size();
    }

}
