package mangila.it2e;

import java.util.Scanner;

public class Application {
    public void manageApplication(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Id: ");
        int id = scanner.nextInt();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Annual Family Income: ");
        int fincome = scanner.nextInt();
        System.out.println("Comunity Service hours: ");
        int csh = scanner.nextInt();
        
        Applications application = new Applications();
        application.setScholarApplication(id, name, gpa, fincome, csh);
        application.viewApplication();
    }
}
