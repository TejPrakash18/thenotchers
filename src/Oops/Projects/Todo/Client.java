package Oops.Projects.Todo;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(title, description);
                    break;
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    taskManager.deleteTask(idToDelete);
                    break;
                case 4:
                    System.out.print("Enter task ID to mark as completed: ");
                    int idToComplete = scanner.nextInt();
                    taskManager.markTaskAsCompleted(idToComplete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
