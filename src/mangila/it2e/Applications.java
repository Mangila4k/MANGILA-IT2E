package mangila.it2e;

public class Applications {
    private int id;
    private String name;
    private double gpa;
    private int fincome;
    private int csh;

    private static int applicationCount = 0;

    public void setScholarApplication(int id, String name, double gpa, int fincome, int csh) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.fincome = fincome;
        this.csh = csh;

        applicationCount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getFincome() {
        return fincome;
    }

    public int getCsh() {
        return csh;
    }

    public String viewApplication() {
        if (this.gpa >= 3.5 && this.fincome <= 350000 && this.csh >= 50) {
            return "Approved";
        } else {
            return "Denied";
        }
    }

    public void printApplication() {
        System.out.printf("ID: %d%nName: %s%nGPA: %.1f%nAnnual Family Income: $%,d%nCommunity Service Hours: %d%nScholarship Status: %s%n",
                          id, name, gpa, fincome, csh, viewApplication());
    }
    
    public static int getApplicationCount() {
        return applicationCount;
    }
}
