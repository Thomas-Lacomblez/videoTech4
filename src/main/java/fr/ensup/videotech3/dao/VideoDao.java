package fr.ensup.videotech3.dao;

import fr.ensup.videotech3.domaine.Video;

import java.util.List;

public class VideoDao implements IDao {
    public Video getVideoById(int id) {
        System.out.println("DAO: r�cup�ration de la video id=" + id);

        if (id == 2) {
            return new Video(2, "Ville nouvelle", "Documentaire", "3", "20/30/2020"); // MOCK SGBDR
        }
        return null;
    }

    public void createVideo(Video video) {
        System.out.println("DAO: cr�ation d'une video " + video.toString());
    }

    public Video updateVideo(Video compte) {
        System.out.println("DAO: mise � jour du compte " + compte.toString());
        return null;
    }

    public void deleteVideo(Video video) {
        System.out.println("DAO: suppression d'une video' " + video.toString());
    }

    public List<Video> getAllVideo() {
        System.out.println("DAO: r�cup�ration de tous les videos");
        return null;
    }
    public void initialisation() {
        System.out.println("DAO: creation spring");
    }

    public void destruction() {
        System.out.println("DAO: destruction spring");
    }
}
