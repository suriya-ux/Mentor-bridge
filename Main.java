import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        List<Student> stuList = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n");
        System.out.println("|-------------------------|");
        System.out.println();
        System.out.println("Below Options are available in the Student Management System:");
        System.out.println();
        System.out.println("1. Structure of Student Data");
        System.out.println("2. Add Student Data");
        System.out.println("3. View All Students Data");
        System.out.println("4. View Specific Student Data");
        System.out.println("5. Student ID to be Updated");
        System.out.println("6. Student ID to be Deleted");
        System.out.println("7. Exit");
        System.out.println();
        System.out.println("|-------------------------|");
        System.out.println();
        System.out.println("Enter Your Choice: ");

        choice = sc.nextInt();

            switch (choice) {
            case 1:
                    System.out.println("\nSample Student Data:");
                    System.out.println("Id: 1");
                    System.out.println("Name: Nandha");
                    System.out.println("Age: 22");
                    System.out.println("Course: CSE\n");
                    break;

                case 2:
                    System.out.println("\nEnter Student Details");
                    Student stu = new Student();

                    System.out.print("Id: ");
                    stu.setId(sc.nextInt());

                    System.out.print("Name: ");
                    stu.setName(sc.next());

                    System.out.print("Age: ");
                    stu.setAge(sc.nextInt());

                    System.out.print("Course: ");
                    stu.setCourse(sc.next());

                    stuList.add(stu);
                    System.out.println("Student added successfully!\n");
                   
                    break;

                case 3:
                    System.out.println("\nAll Student Details:");
                    if (stuList.isEmpty()) {
                        System.out.println("No student data available.\n");
                    } else {
                        for (Student s : stuList) {
                            System.out.println("Id: " + s.getId());
                            System.out.println("Name: " + s.getName());
                            System.out.println("Age: " + s.getAge());
                            System.out.println("Course: " + s.getCourse());
                            System.out.println("-----------------------");
                        }
                    }
                    break;

            case 4:
            System.out.print("Enter Student ID to search: ");
            int searchId = sc.nextInt();
    
            Student s = stuList.get(searchId-1);
   
            System.out.println("\nStudent Found:");
            System.out.println("Id: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Course: " + s.getCourse());
            break;

             case 5:
                    System.out.println("Enter the student ID to be Updated:");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for (Student s5 : stuList) {
                        if (s5.getId() == updateId) {
                            System.out.println("Enter new name:");
                            s5.setName(sc.next());

                            System.out.println("Enter new age:");
                            s5.setAge(sc.nextInt());

                            System.out.println("Enter new course:");
                            s5.setCourse(sc.next());

                            System.out.println("Student data updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student with ID " + updateId + " not found.");
                    }
                    break;

             case 6:
                    System.out.print("Enter ID to be deleted: ");
                    int deleteId = sc.nextInt();

                    boolean removed = stuList.removeIf(student -> student.getId() == deleteId);

                    if (removed) {
                       System.out.println("Student with ID " + deleteId + " has been deleted.");
                    } else {
                       System.out.println("Student with ID " + deleteId + " not found.");
                    }
                    break;

            case 7:
                    System.out.println("Exiting system. Goodbye!!!!!!!");
                    break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
        }while(choice!=7);

    sc.close();

}

}
