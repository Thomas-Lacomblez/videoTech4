package fr.ensup.videotech3.service;

import fr.ensup.videotech3.dao.IDao;
import fr.ensup.videotech3.domaine.Video;

import java.util.List;

public class VideoService {

    private IDao iDao;

    public VideoService() {
        super();
    }

    public VideoService(IDao iDao) {
        super();
        this.iDao = iDao;
    }

    public Video recuperationCompte(int id) {
        System.out.println("SERVICE: r�cup�ration d'une video id=" + id);

        Video compteRetour = iDao.getVideoById(id);
        return compteRetour;
    }

    public void creerCompte(Video video) {
        System.out.println("SERVICE: cr�ation d'une video " + video.toString());

        iDao.createVideo(video);
    }

    public Video mettreAJourCompte(Video video) {
        System.out.println("SERVICE: mise � jour d'une video " + video.toString());

        Video compteRetour = iDao.updateVideo(video);
        return compteRetour;
    }

    public void supprimerCompte(Video video) {
        System.out.println("SERVICE: suppression d'une video " + video.toString());

        iDao.deleteVideo(video);
    }

    public List<Video> recuperationCompteListe() {
        System.out.println("SERVICE: r�cup�ration de tous les videos");

        List<Video> compteListeRetour = iDao.getAllVideo();
        return compteListeRetour;
    }

    public void comparaisonCompte(Video v1, Video v2) {
        System.out.println("SERVICE: comparaison entre deux video");
    }

    public IDao getiDao() {
        return iDao;
    }

    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }

    public void initialisation() {
        System.out.println("SERVICE: creation spring");
    }

    public void destruction() {
        System.out.println("SERVICE: destruction spring");
    }

}
