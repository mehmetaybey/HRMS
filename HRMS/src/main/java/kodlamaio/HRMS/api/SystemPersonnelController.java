package kodlamaio.HRMS.api;


import kodlamaio.HRMS.business.abstracts.SystemPersonnelService;
import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/systempersonnel")
public class SystemPersonnelController {

    private SystemPersonnelService systemPersonnelService;

    @Autowired
    public SystemPersonnelController(SystemPersonnelService systemPersonnelService) {
        this.systemPersonnelService = systemPersonnelService;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemPersonnel>> getAll() {
        return this.systemPersonnelService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemPersonnel systemPersonnel) {
        return this.systemPersonnelService.add(systemPersonnel);
    }
}
