import java.util.*;

public class CollegeManagement {
    static Map<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Add Student\n2. Display All Students\n3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Roll No: ");
                String rollNo = sc.nextLine();
                students.put(rollNo, new Student(name, rollNo));
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students recorded.");
                } else {
                    for (Student s : students.values()) {
                        System.out.println(s.name + " - " + s.rollNo);
                    }
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }

    static class Student {
        String name, rollNo;
        Student(String name, String rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }
    }
}
