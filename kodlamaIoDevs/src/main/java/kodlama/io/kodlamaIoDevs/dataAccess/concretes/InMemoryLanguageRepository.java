package kodlama.io.kodlamaIoDevs.dataAccess.concretes;

import kodlama.io.kodlamaIoDevs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlamaIoDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<ProgrammingLanguage> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<ProgrammingLanguage>();
        languages.add(new ProgrammingLanguage(1,"C#"));
        languages.add(new ProgrammingLanguage(2,"Java"));
        languages.add(new ProgrammingLanguage(3,"Flutter"));
        languages.add(new ProgrammingLanguage(4,"Python"));
        languages.add(new ProgrammingLanguage(5,"JavaScript"));
    }

    @Override
    public List<ProgrammingLanguage> getall() {
        return languages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : languages){
            if (programmingLanguage.getId() == id){
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage language) {
        languages.add(language);
    }

    @Override
    public void update(ProgrammingLanguage language) {
        var item = getById(language.getId());
        item.setLanguageName(language.getLanguageName());
    }

    @Override
    public void delete(ProgrammingLanguage language) {
        var item = getById(language.getId());
        languages.remove(item);
    }
}
