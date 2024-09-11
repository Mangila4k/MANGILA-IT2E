package mangila.it2e;

import java.util.Scanner;

public class Application {
    public void manageApplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Id: ");
        int id = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Annual Family Income: ");
        int fincome = scanner.nextInt();
        
        System.out.print("Community Service hours: ");
        int csh = scanner.nextInt();
        
        Applications application = new Applications();
        application.setScholarApplication(id, name, gpa, fincome, csh);
        
        System.out.println("Application Status: " + application.viewApplication());
        
        application.printApplication();

        scanner.close();
    }
}
