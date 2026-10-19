package dio.taskmanager.domain;

public class TaskNotFoundExceptioon extends RuntimeException {
    public TaskNotFoundExceptioon(TaskId taskId)
    {
        super("Task with id " + taskId + " not found");
    }
}
