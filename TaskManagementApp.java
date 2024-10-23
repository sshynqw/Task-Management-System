package endTermProject;

public class TaskManagementApp {
    public static void main(String[] args) {
        // Create usersу
        User alice = new User("Alice");
        User bob = new User("Bob");

        // Create Task Manager and add observers
        TaskManager taskManager = new TaskManager();
        taskManager.addObserver(alice);
        taskManager.addObserver(bob);

        // Create tasks
        taskManager.createTask("bug", "Fix login issue", "Fix the login authentication problem");
        taskManager.createTask("feature", "Add dark mode", "Implement dark mode for the app");

        // Get tasks
        Task bugTask = taskManager.getTasks().get(0);
        Task featureTask = taskManager.getTasks().get(1);

        // Assign tasks
        taskManager.assignTask(bugTask, alice);
        taskManager.assignTask(featureTask, bob);

        // Use decorators
        Task priorityBugTask = new PriorityTaskDecorator(bugTask, "High");
        Task deadlineFeatureTask = new DeadlineTaskDecorator(featureTask, "2024-10-30");

        // Execute tasks
        priorityBugTask.executeTask();
        deadlineFeatureTask.executeTask();

        // Undo the last command (unassign the last assigned task)
        taskManager.undoLastCommand();
    }
}

