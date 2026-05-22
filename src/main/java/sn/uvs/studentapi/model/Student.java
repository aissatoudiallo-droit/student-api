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
     * Identifiant étudiant.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nom étudiant.
     */
    private String nom;

    /**
     * Prénom étudiant.
     */
    private String prenom;

    /**
     * Email étudiant.
     */
    private String email;

    /**
     * Moyenne étudiant.
     */
    private Double moyenne;

    /**
     * Constructeur vide.
     */
    public Student() {
    }

    /**
     * Constructeur avec paramètres.
     *
     * @param nom nom étudiant
     * @param prenom prénom étudiant
     * @param email email étudiant
     * @param moyenne moyenne étudiant
     */
    public Student(
            final String nom,
            final String prenom,
            final String email,
            final Double moyenne) {

        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.moyenne = moyenne;
    }

    /**
     * Retourne l'identifiant.
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant.
     * @param newId identifiant
     */
    public void setId(final Long newId) {
        this.id = newId;
    }

    /**
     * Retourne le nom.
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom.
     * @param newNom nom
     */
    public void setNom(final String newNom) {
        this.nom = newNom;
    }

    /**
     * Retourne le prénom.
     * @return prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom.
     * @param newPrenom prénom
     */
    public void setPrenom(final String newPrenom) {
        this.prenom = newPrenom;
    }

    /**
     * Retourne l'email.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit l'email.
     * @param newEmail email
     */
    public void setEmail(final String newEmail) {
        this.email = newEmail;
    }

    /**
     * Retourne la moyenne.
     * @return moyenne
     */
    public Double getMoyenne() {
        return moyenne;
    }

    /**
     * Définit la moyenne.
     * @param newMoyenne moyenne
     */
    public void setMoyenne(final Double newMoyenne) {
        this.moyenne = newMoyenne;
    }
}