package kodlamaio.HRMS.api;

import kodlamaio.HRMS.business.abstracts.CandidateService;
import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    private CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        super();
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public DataResult<List<Candidate>> getAll() {
        return this.candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Candidate candidate){

        return this.candidateService.add(candidate);
    }
}
