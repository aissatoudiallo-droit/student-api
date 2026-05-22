package sn.uvs.studentapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Représente un étudiant.
 */
@Entity
@Table(name = "students")
public final class Student {

    /**
     * Identifiant.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nom.
     */
    private String nom;

    /**
     * Prénom.
     */
    private String prenom;

    /**
     * Email.
     */
    private String email;

    /**
     * Moyenne.
     */
    private Double moyenne;

    /**
     * Constructeur vide.
     */
    public Student() {
    }

    /**
     * Constructeur.
     *
     * @param newNom nom
     * @param newPrenom prénom
     * @param newEmail email
     * @param newMoyenne moyenne
     */
    public Student(
            final String newNom,
            final String newPrenom,
            final String newEmail,
            final Double newMoyenne) {

        this.nom = newNom;
        this.prenom = newPrenom;
        this.email = newEmail;
        this.moyenne = newMoyenne;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param newId id
     */
    public void setId(final Long newId) {
        this.id = newId;
    }

    /**
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param newNom nom
     */
    public void setNom(final String newNom) {
        this.nom = newNom;
    }

    /**
     * @return prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param newPrenom prénom
     */
    public void setPrenom(final String newPrenom) {
        this.prenom = newPrenom;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param newEmail email
     */
    public void setEmail(final String newEmail) {
        this.email = newEmail;
    }

    /**
     * @return moyenne
     */
    public Double getMoyenne() {
        return moyenne;
    }

    /**
     * @param newMoyenne moyenne
     */
    public void setMoyenne(final Double newMoyenne) {
        this.moyenne = newMoyenne;
    }
}
