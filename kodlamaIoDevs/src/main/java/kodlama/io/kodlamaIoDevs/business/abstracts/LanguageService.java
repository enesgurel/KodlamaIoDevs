package kodlama.io.kodlamaIoDevs.business.abstracts;

import kodlama.io.kodlamaIoDevs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage language);
    void update(ProgrammingLanguage language);
    void delete(ProgrammingLanguage language);
}
