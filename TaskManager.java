package endTermProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private Stack<Command> commandHistory = new Stack<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Task task) {
        for (Observer observer : observers) {
            observer.update(task);
        }
    }

    public void createTask(String taskType, String title, String description) {
        Task task = TaskFactory.createTask(taskType, title, description);
        tasks.add(task);
        System.out.println("Task created: " + task.getTitle());
    }

    public void updateTask(Task task) {
        notifyObservers(task);
    }

    public void assignTask(Task task, User user) {
        AssignTaskCommand assignCommand = new AssignTaskCommand(task, user);
        assignCommand.execute();
        commandHistory.push(assignCommand);
        notifyObservers(task);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
