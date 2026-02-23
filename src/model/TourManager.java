
package model;

import java.util.ArrayList;
import java.util.List;

public class TourManager {

    private List<Exhibit> exhibits = new ArrayList<>();
    private int currentIndex = 0;

    public void addExhibit(Exhibit exhibit) {
        exhibits.add(exhibit);
    }

    public void showCurrentExhibit() {
        if (!exhibits.isEmpty()) {
            exhibits.get(currentIndex).getDetails();
        }
    }

    public void nextExhibit() {
        if (currentIndex < exhibits.size() - 1) {
            currentIndex++;
            showCurrentExhibit();
        } else {
            System.out.println("No more exhibits.");
        }
    }
          public List<Exhibit> getAllExhibits() {
               return exhibits;
}

    public Exhibit searchExhibit(String title) {
        for (Exhibit e : exhibits) {
            if (e.getTitle().equalsIgnoreCase(title)) {
                return e;
            }
        }
        return null;
    }

    
}