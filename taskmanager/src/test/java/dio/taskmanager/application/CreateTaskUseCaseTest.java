package dio.taskmanager.application;

import dio.taskmanager.application.input.CreateTaskInput;
import dio.taskmanager.application.output.TaskOutput;
import dio.taskmanager.domain.Task;
import dio.taskmanager.domain.TaskRepository;
import dio.taskmanager.infrastructure.repository.InMemoryTaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CreateTaskUseCaseTest {
    @Mock
    TaskRepository repository;
    @InjectMocks
    CreateTaskUseCase useCase;

    @Test
    void should_create_task_sucessfully(){
        var input = new CreateTaskInput("Estudar java", Optional.of("Finalizar  o modulo de records"));

        when(repository.save(any(Task.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));

        TaskOutput output = useCase.execute(input);

        assertNotNull(output);
        assertNotNull(output.id());
        assertEquals("Estudar java", output.title());
        assertEquals(Optional.of("Finalizar  o modulo de records"), output);

        verify(repository, times(1)).save(any(Task.class));
    }

}