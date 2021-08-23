package kodlamaio.hrms.core;

import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.mernis.DLKKPSPublicSoap;

import java.util.Locale;

public class MernisCheckServiceAdapter implements UserCheckService{
    DLKKPSPublicSoap client = new DLKKPSPublicSoap();
    @Override
    public boolean checkIsRealPerson(Candidates candidates) {
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(candidates.getNationalID()), candidates.getUserName().toUpperCase(new Locale("tr")), candidates.getUserLastName().toUpperCase(new Locale("tr")), candidates.getBirthDate().getYear());
        } catch (Exception e) {
            return false;
        }
    }
}
