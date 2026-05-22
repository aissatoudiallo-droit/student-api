package sn.uvs.studentapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import sn.uvs.studentapi.model.Student;
import sn.uvs.studentapi.repository.StudentRepository;
import sn.uvs.studentapi.model.Student;

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
     * Constructeur.
     */
    public StudentService(final StudentRepository newRepository) {
        this.repository = newRepository;
    }

    /**
     * Retourne tous les étudiants.
     */
    public List<Student> findAll() {
        return repository.findAll();
    }

    /**
     * Retourne un étudiant.
     */
    public Optional<Student> findById(final Long id) {
        return repository.findById(id);
    }

    /**
     * Sauvegarde étudiant.
     */
    public Student save(final Student student) {
        return repository.save(student);
    }

    /**
     * Supprime étudiant.
     */
    public void deleteById(final Long id) {
        repository.deleteById(id);
    }
}