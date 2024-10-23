package endTermProject;

public abstract class Task {
    protected String title;
    protected String description;
    protected User assignedUser;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void assignTo(User user) {
        this.assignedUser = user;
        System.out.println("Task '" + title + "' assigned to " + user.getUsername());
    }

    public void unassign() {
        System.out.println("Task '" + title + "' unassigned from " + assignedUser.getUsername());
        this.assignedUser = null;
    }

    public abstract void executeTask();

    public String getTitle() {
        return title;
    }
}

