package kodlamaio.hrms.core;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface UserCheckService {
    boolean checkIsRealPerson(Candidates candidates);
}
