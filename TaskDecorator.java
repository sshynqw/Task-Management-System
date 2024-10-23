package endTermProject;

public abstract class TaskDecorator extends Task {
    protected Task task;

    public TaskDecorator(Task task) {
        super(task.getTitle(), task.description);
        this.task = task;
    }

    @Override
    public void executeTask() {
        task.executeTask();
    }
}

