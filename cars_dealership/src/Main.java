import Domain.Inchiriere;
import Domain.Masina;
import Exceptions.DoesntExistException;
import Exceptions.DuplicateEntityException;
import Exceptions.WrongDatesException;
import Repository.BDInchiriereRepo;
import Repository.BDMasinaRepo;
import Repository.IRepo;
import Repository.MemoryRepo;
import Service.ServiceInchirieri;
import Service.ServiceMasini;
import UI.Console;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws DuplicateEntityException, IOException, WrongDatesException, DoesntExistException {
        BDMasinaRepo masini = new BDMasinaRepo();
        BDInchiriereRepo inchirieri = new BDInchiriereRepo();
        ServiceMasini serviceMasini = new ServiceMasini(masini);
        ServiceInchirieri serviceInchirieri = new ServiceInchirieri(inchirieri, masini);
        Console c = new Console(serviceMasini,serviceInchirieri);
        c.meniu();
        masini.closeConnection();
        inchirieri.closeConnection();
    }

}
