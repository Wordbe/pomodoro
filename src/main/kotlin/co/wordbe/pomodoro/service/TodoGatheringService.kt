package co.wordbe.pomodoro.service

import co.wordbe.pomodoro.client.todo.TodoClient
import co.wordbe.pomodoro.domain.todo.entity.Todo
import co.wordbe.pomodoro.domain.todo.repository.TodoRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import co.wordbe.pomodoro.client.todo.Todo as ExternalTodo

@Service
class TodoGatheringService(
    private val todoRepository: TodoRepository,
    private val todoClient: TodoClient,
) {

    suspend fun gatherTitles(id: Long): List<String> {
        val todo: Todo = todoRepository.findById(id) ?: throw NotFoundException()
        val externalTodo: ExternalTodo = todoClient.getById(id)

        return listOf(todo.title, externalTodo.title)
    }
}
