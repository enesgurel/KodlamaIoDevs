package kodlama.io.kodlamaIoDevs.webApi.controllers;

import kodlama.io.kodlamaIoDevs.business.abstracts.LanguageService;
import kodlama.io.kodlamaIoDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesControllers {
    private LanguageService languageService;

    @Autowired
    public LanguagesControllers(LanguageService languageService) {this.languageService = languageService;}

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public void getById(@PathVariable int id) throws Exception{
        languageService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage language) throws Exception{
        languageService.add(language);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody ProgrammingLanguage language) throws Exception{
        languageService.delete(language);
    }

    @PostMapping("/update")
    public void update(@RequestBody ProgrammingLanguage language) throws Exception{
        languageService.update(language);
    }
}
