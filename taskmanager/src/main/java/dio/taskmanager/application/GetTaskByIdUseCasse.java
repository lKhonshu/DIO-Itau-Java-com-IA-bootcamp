package dio.taskmanager.application;

import dio.taskmanager.application.output.TaskOutput;
import dio.taskmanager.domain.TaskId;
import dio.taskmanager.domain.TaskNotFoundExceptioon;
import dio.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class GetTaskByIdUseCasse {
    private final TaskRepository repository;

    public GetTaskByIdUseCasse(TaskRepository repository){
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id){
        return repository.findById(id).map(TaskOutput::from).orElseThrow(() -> new TaskNotFoundExceptioon(id));
    }
}
