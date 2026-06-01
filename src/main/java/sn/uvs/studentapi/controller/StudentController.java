package sn.uvs.studentapi.controller;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.uvs.studentapi.model.Student;
import sn.uvs.studentapi.service.StudentService;

/**
 * Contrôleur REST des étudiants.
 */
@RestController
@RequestMapping("/api/students")
public class StudentController {

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
public ResponseEntity<Student> getById(
        @PathVariable final Long id) {

    return studentService.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
}

    /**
     * Crée étudiant.
     *
     * @param student étudiant
     * @return étudiant créé
     */
    @PostMapping
    public Student create(
            @RequestBody final Student student) {

        return studentService.save(student);
    }

    /**
     * Supprime étudiant.
     *
     * @param id identifiant
     */
    @DeleteMapping("/{id}")
public ResponseEntity<Void> delete(
        @PathVariable final Long id) {

    studentService.deleteById(id);
    return ResponseEntity.noContent().build();
}
}
