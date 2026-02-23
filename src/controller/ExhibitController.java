
package controller;
import model.*;
import controller.ExhibitController;

public class ExhibitController {
    
    private TourManager tourManager;
    private MediaPlayer mediaPlayer;

    public ExhibitController(TourManager tourManager) {
        this.tourManager = tourManager;
        this.mediaPlayer = new MediaPlayer();
    }

    public void browseExhibits() {
        for (Exhibit e : tourManager.getAllExhibits()) {
            System.out.println("- " + e.getTitle());
        }
    }

    public void playMedia(Exhibit exhibit) {
        mediaPlayer.playVideo(exhibit.getMediaFile());
    }

    public void search(String title) {
        Exhibit found = tourManager.searchExhibit(title);
        if (found != null) {
            found.getDetails();
        } else {
            System.out.println("Exhibit not found.");
        }
    }
}
