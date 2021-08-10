package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager {
    private JobTitleDao jobTitleDao;
    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    List<JobTitle> getAll(){
        return this.jobTitleDao.findAll();
    }
}
