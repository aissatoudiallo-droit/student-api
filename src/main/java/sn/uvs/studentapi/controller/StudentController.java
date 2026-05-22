package sn.uvs.studentapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import sn.uvs.studentapi.model.Student;
import sn.uvs.studentapi.service.StudentService;

/**
 * Contrôleur REST des étudiants.
 */
@RestController
@RequestMapping("/students")
public final class StudentController {

    /**
     * Service étudiant.
     */
    private final StudentService studentService;

    /**
     * Constructeur.
     *
     * @param newService service étudiant
     */
    public StudentController(final StudentService newService) {
        this.studentService = newService;
    }

    /**
     * Retourne tous les étudiants.
     *
     * @return liste étudiants
     */
    @GetMapping
    public List<Student> getAll() {
        return studentService.findAll();
    }

    /**
     * Retourne étudiant par id.
     *
     * @param id identifiant
     * @return étudiant
     */
    @GetMapping("/{id}")
    public Optional<Student> getById(final Long id) {
        return studentService.findById(id);
    }

    /**
     * Crée étudiant.
     *
     * @param student étudiant
     * @return étudiant créé
     */
    @PostMapping
    public Student create(final Student student) {
        return studentService.save(student);
    }

    /**
     * Supprime étudiant.
     *
     * @param id identifiant
     */
    @DeleteMapping("/{id}")
    public void delete(final Long id) {
        studentService.deleteById(id);
    }
}