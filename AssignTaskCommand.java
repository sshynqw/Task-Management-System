package endTermProject;

public class AssignTaskCommand implements Command {
    private Task task;
    private User user;

    public AssignTaskCommand(Task task, User user) {
        this.task = task;
        this.user = user;
    }

    @Override
    public void execute() {
        task.assignTo(user);
    }

    @Override
    public void undo() {
        task.unassign();
    }
}

