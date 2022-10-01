package co.wordbe.pomodoro.service

import co.wordbe.pomodoro.api.dto.TodoRequest
import co.wordbe.pomodoro.domain.todo.entity.Todo
import co.wordbe.pomodoro.domain.todo.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
    val todoRepository: TodoRepository
) {

    suspend fun create(todoRequest: TodoRequest): Todo {
        return todoRepository.save(todoRequest.toEntity())
    }
}