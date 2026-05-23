package sn.uvs.studentapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application principale.
 */
@SpringBootApplication
public class StudentApiApplication {

    /**
     * Point d'entrée.
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(
                StudentApiApplication.class,
                args
        );
    }
}