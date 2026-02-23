
package view;

import java.util.Scanner;

public class MuseumView {

    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n--- Virtual Museum ---");
        System.out.println("1. Browse Exhibits");
        System.out.println("2. Search Exhibit");
        System.out.println("3. Next Exhibit");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
        return scanner.nextInt();
    }

    public String getSearchInput() {
        System.out.print("Enter exhibit title: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}