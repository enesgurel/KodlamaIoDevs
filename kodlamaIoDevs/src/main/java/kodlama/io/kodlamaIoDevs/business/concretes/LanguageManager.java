package kodlama.io.kodlamaIoDevs.business.concretes;

import kodlama.io.kodlamaIoDevs.business.abstracts.LanguageService;
import kodlama.io.kodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlamaIoDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languageRepository.getall();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage language) {
        var languageName = language.getLanguageName();
        if (languageName.isEmpty()){
            System.out.print("Programlama Dili Boş Olamaz");
        }

        languageRepository.add(language);
    }

    @Override
    public void update(ProgrammingLanguage language) {
        languageRepository.update(language);
    }

    @Override
    public void delete(ProgrammingLanguage language) {
        languageRepository.update(language);
    }
}
