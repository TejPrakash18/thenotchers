package Oops.Projects.Todo;

import java.util.ArrayList;
import java.util.List;


public class TaskManager {
    private List<Task> tasks;
    private int idCounter;

    public TaskManager() {
        tasks = new ArrayList<>();
        idCounter = 1;
    }

    public void addTask(String title, String description) {
        Task newTask = new Task(idCounter++, title, description);
        tasks.add(newTask);
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }


    public void deleteTask(int id) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getId() == id) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Task marked as completed!");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}

