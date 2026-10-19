package dio.taskmanager.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public abstract class TaskRepositoryTest {
    TaskRepository repository;

    protected abstract TaskRepository createRepository();

    @BeforeEach
    public void setup(){
        this.repository = createRepository();
    }

    @Test
    void should_save_and_retrieve_task_by_id() {
        var task = new Task("Passar na portaria", Optional.empty());

        var saved = repository.save(task);
        Optional<Task> result = repository.findById(saved.getId());

        assertThat(result).isPresent();
        assertThat(result.get().getId()).isEqualTo(saved.getId());
        assertThat(result.get().getTitle()).isEqualTo("Passar na portaria");
    }

    @Test
    void should_return_empty_when_task_not_found() {
        Optional<Task> result = repository.findById(new TaskId());

        assertThat(result).isEmpty();
    }

    @Test
    void should_find_all_tasks() {
        var first = repository.save(new Task("Primeira tarefa", Optional.of("Detalhe")));
        var second = repository.save(new Task("Segunda tarefa", Optional.empty()));

        var result = repository.findAll();

        assertThat(result).hasSize(2);
        assertThat(result).extracting(Task::getId).containsExactlyInAnyOrder(first.getId(), second.getId());
    }

    @Test
    void should_delete_task() {
        var saved = repository.save(new Task("Tarefa para remover", Optional.empty()));

        repository.delete(saved.getId());

        assertThat(repository.findById(saved.getId())).isEmpty();
        assertThat(repository.findAll()).isEmpty();
    }
}