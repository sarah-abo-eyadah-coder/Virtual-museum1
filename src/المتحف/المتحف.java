
package المتحف;
import model.*;
import controller.*;
import view.*;


public class المتحف {

 
    public static void main(String[] args) {
         //model 
        TourManager tourManager = new TourManager();
        tourManager.addExhibit(new Exhibit("Ancient Statue", "Old Roman statue", "statue.mp4"));
        tourManager.addExhibit(new Exhibit("Golden Crown", "Pharaoh crown", "crown.mp4"));

        // Controller
        ExhibitController controller = new ExhibitController(tourManager);

        // View
        MuseumView view = new MuseumView();

        int choice;

        do {
            choice = view.showMenu();

            switch (choice) {

                case 1:
                    controller.browseExhibits();
                    break;

                case 2:
                    String title = view.getSearchInput();
                    controller.search(title);
                    break;

                case 3:
                    tourManager.nextExhibit();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
        
        
    }
        
        
        
        
        
        
        
        
        
    }
   
