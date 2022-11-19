package kodlama.io.kodlamaIoDevs.dataAccess.abstracts;

import kodlama.io.kodlamaIoDevs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageRepository {
    List<ProgrammingLanguage> getall();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage language);
    void update(ProgrammingLanguage language);
    void delete(ProgrammingLanguage language);
}
