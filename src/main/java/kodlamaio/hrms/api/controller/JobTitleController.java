package kodlamaio.hrms.api.controller;


import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/controllers")
public class JobTitleController {
    JobTitleService jobTitleService;
    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }
    @GetMapping("/getAll")
    public List<JobTitle> getAll(){
        return this.jobTitleService.getAll();
    }
}
