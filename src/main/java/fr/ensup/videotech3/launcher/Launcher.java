package fr.ensup.videotech3.launcher;

import fr.ensup.videotech3.domaine.Video;
import fr.ensup.videotech3.service.VideoService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {

        // 1. Chargement du conteneur  en 4.0.0 Spring
        ConfigurableApplicationContext applicationContext = (ConfigurableApplicationContext) new ClassPathXmlApplicationContext(
                "demoService-beans.xml");

        // 2. Recuperation d'un bean du conteneur
        VideoService videoService = (VideoService) applicationContext.getBean("videoService");

        // 3. Manipulation du bean avec injection de dependances
        Video v1 = new Video(1, "Ville nouvelle", "Documentaire", "3", "20/30/2020");
        videoService.creerCompte(v1);

        Video v2 = videoService.recuperationCompte(2);
        if (v2 != null) {
            System.out.println("LAUNCHER: R�cuperation de la video r�ussie " + v2.toString());
        } else {
            System.out.println("LAUNCHER: R�cuperation dela video �chou�e");
        }
        applicationContext.close();
    }
}
