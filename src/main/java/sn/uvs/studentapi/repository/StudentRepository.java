package sn.uvs.studentapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.uvs.studentapi.model.Student;

/**
 * Repository étudiant.
 */
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    /**
     * Recherche par email.
     *
     * @param email email étudiant
     * @return étudiant trouvé
     */
    Optional<Student> findByEmail(String email);

}