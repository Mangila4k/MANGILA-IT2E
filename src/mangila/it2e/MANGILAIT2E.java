package mangila.it2e;

import java.util.Scanner;

public class MANGILAIT2E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total number of applications: " + Applications.getApplicationCount());

        Application appManager = new Application();
        appManager.manageApplication();

        System.out.println("Total number of applications after this entry: " + Applications.getApplicationCount());

        scanner.close();
    }
}
