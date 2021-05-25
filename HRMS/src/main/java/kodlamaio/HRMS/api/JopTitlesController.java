package kodlamaio.HRMS.api;

import kodlamaio.HRMS.business.abstracts.JopTitlesService;
import kodlamaio.HRMS.core.Utilities.results.DataResult;
import kodlamaio.HRMS.core.Utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.JopTitles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/joptitles")
public class JopTitlesController {

    private JopTitlesService jopTitlesService;

    @Autowired
    public JopTitlesController(JopTitlesService jopTitlesService) {
        this.jopTitlesService = jopTitlesService;
    }
    @GetMapping("/getall")
    public DataResult<List<JopTitles>>getAll(){
        return this.jopTitlesService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody JopTitles jopTitles){
        return  this.jopTitlesService.add(jopTitles);
    }

}
