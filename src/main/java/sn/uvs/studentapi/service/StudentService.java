package sn.uvs.studentapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import sn.uvs.studentapi.model.Student;
import sn.uvs.studentapi.repository.StudentRepository;

/**
 * Service étudiant.
 */
@Service
public final class StudentService {

    /**
     * Repository étudiant.
     */
    private final StudentRepository repository;

    /**
     * Constructeur du service.
     *
     * @param newRepository repository étudiant
     */
    public StudentService(final StudentRepository newRepository) {
        this.repository = newRepository;
    }

    /**
     * Retourne tous les étudiants.
     *
     * @return liste des étudiants
     */
    public List<Student> findAll() {
        return repository.findAll();
    }

    /**
     * Recherche un étudiant par identifiant.
     *
     * @param id identifiant étudiant
     * @return étudiant trouvé
     */
    public Optional<Student> findById(final Long id) {
        return repository.findById(id);
    }

    /**
     * Enregistre un étudiant.
     *
     * @param student étudiant
     * @return étudiant enregistré
     */
    public Student save(final Student student) {
        return repository.save(student);
    }

    /**
     * Supprime un étudiant.
     *
     * @param id identifiant étudiant
     */
    public void deleteById(final Long id) {
        repository.deleteById(id);
    }
}
