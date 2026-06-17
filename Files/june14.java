 
    import java.util.Scanner;

public class june14 {

    static int[] empIds = new int[100];
    static String[] empNames = new String[100];
    static int[] ages = new int[100];
    static int[] experiences = new int[100];
    static double[] salaries = new double[100];
    static String[] maritalStatus = new String[100];

    static int count = 0;

    public static void addEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        empIds[count] = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        empNames[count] = sc.nextLine();

        System.out.print("Enter Age: ");
        ages[count] = sc.nextInt();

        System.out.print("Enter Experience (Years): ");
        experiences[count] = sc.nextInt();

        System.out.print("Enter Salary: ");
        salaries[count] = sc.nextDouble();

        System.out.println("\nSelect Marital Status");
        System.out.println("1. Married");
        System.out.println("2. Still Bachelor");
        System.out.println("3. Already Committed");
        System.out.println("4. Ready To Mingle");

        System.out.print("Enter Choice: ");
        int statusChoice = sc.nextInt();

        switch (statusChoice) {
            case 1:
                maritalStatus[count] = "Married";
                break;
            case 2:
                maritalStatus[count] = "Still Bachelor";
                break;
            case 3:
                maritalStatus[count] = "Already Committed";
                break;
            case 4:
                maritalStatus[count] = "Ready To Mingle";
                break;
            default:
                maritalStatus[count] = "Unknown";
        }

        count++;
        System.out.println("Employee Added Successfully!");
    }

    public static void viewEmployees() {

        if (count == 0) {
            System.out.println("No Employees Found!");
            return;
        }

        System.out.println("\n========== Employee Details ==========");

        for (int i = 0; i < count; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Employee ID     : " + empIds[i]);
            System.out.println("Employee Name   : " + empNames[i]);
            System.out.println("Age             : " + ages[i]);
            System.out.println("Experience      : " + experiences[i] + " Years");
            System.out.println("Salary          : " + salaries[i]);
            System.out.println("Marital Status  : " + maritalStatus[i]);
        }
    }

    public static void searchEmployee(Scanner sc) {

        System.out.print("Enter Employee ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (empIds[i] == searchId) {

                System.out.println("\nEmployee Found!");
                System.out.println("-----------------------------------");
                System.out.println("Employee ID     : " + empIds[i]);
                System.out.println("Employee Name   : " + empNames[i]);
                System.out.println("Age             : " + ages[i]);
                System.out.println("Experience      : " + experiences[i] + " Years");
                System.out.println("Salary          : " + salaries[i]);
                System.out.println("Marital Status  : " + maritalStatus[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    searchEmployee(sc);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

