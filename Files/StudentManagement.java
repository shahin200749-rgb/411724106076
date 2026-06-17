import java.util.Scanner;

public class StudentManagement {

    static int[] studentIds = new int[100];
    static String[] studentNames = new String[100];
    static int[] ages = new int[100];
    static String[] departments = new String[100];
    static double[] cgpas = new double[100];

    static int count = 0;

    // Add Student
    public static void addStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        studentIds[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentNames[count] = sc.nextLine();

        System.out.print("Enter Age: ");
        ages[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        departments[count] = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpas[count] = sc.nextDouble();

        count++;

        System.out.println("Student Added Successfully!");
    }

    // View Students
    public static void viewStudents() {

        if (count == 0) {
            System.out.println("No Students Available!");
            return;
        }

        System.out.println("\n===== STUDENT DETAILS =====");

        for (int i = 0; i < count; i++) {

            System.out.println("-------------------------");
            System.out.println("ID         : " + studentIds[i]);
            System.out.println("Name       : " + studentNames[i]);
            System.out.println("Age        : " + ages[i]);
            System.out.println("Department : " + departments[i]);
            System.out.println("CGPA       : " + cgpas[i]);
        }
    }

    // Search by ID
    public static void searchStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (studentIds[i] == id) {

                System.out.println("\nStudent Found!");
                System.out.println("Name : " + studentNames[i]);
                System.out.println("CGPA : " + cgpas[i]);
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Search by Name
    public static void searchByName(Scanner sc) {

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (studentNames[i].equalsIgnoreCase(name)) {

                System.out.println("ID : " + studentIds[i]);
                System.out.println("Department : " + departments[i]);
                System.out.println("CGPA : " + cgpas[i]);

                found = true;
            }
        }

        if (!found)
            System.out.println("Student Not Found!");
    }

    // Update Student
    public static void updateStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (studentIds[i] == id) {

                sc.nextLine();

                System.out.print("New Name: ");
                studentNames[i] = sc.nextLine();

                System.out.print("New Age: ");
                ages[i] = sc.nextInt();
                sc.nextLine();

                System.out.print("New Department: ");
                departments[i] = sc.nextLine();

                System.out.print("New CGPA: ");
                cgpas[i] = sc.nextDouble();

                System.out.println("Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Delete Student
    public static void deleteStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (studentIds[i] == id) {

                for (int j = i; j < count - 1; j++) {

                    studentIds[j] = studentIds[j + 1];
                    studentNames[j] = studentNames[j + 1];
                    ages[j] = ages[j + 1];
                    departments[j] = departments[j + 1];
                    cgpas[j] = cgpas[j + 1];
                }

                count--;
                System.out.println("Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    // Total Students
    public static void totalStudents() {

        System.out.println("Total Students = " + count);
    }

    // Highest CGPA Student
    public static void highestCGPA() {

        if (count == 0) {
            System.out.println("No Students Available!");
            return;
        }

        int index = 0;

        for (int i = 1; i < count; i++) {

            if (cgpas[i] > cgpas[index]) {
                index = i;
            }
        }

        System.out.println("\nTop Student");
        System.out.println("ID : " + studentIds[index]);
        System.out.println("Name : " + studentNames[index]);
        System.out.println("CGPA : " + cgpas[index]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search By ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Search By Name");
            System.out.println("7. Total Students");
            System.out.println("8. Highest CGPA Student");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: addStudent(sc); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(sc); break;
                case 4: updateStudent(sc); break;
                case 5: deleteStudent(sc); break;
                case 6: searchByName(sc); break;
                case 7: totalStudents(); break;
                case 8: highestCGPA(); break;

                case 9:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}