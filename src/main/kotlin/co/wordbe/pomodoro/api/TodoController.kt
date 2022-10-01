package co.wordbe.pomodoro.api

import co.wordbe.pomodoro.api.dto.TodoRequest
import co.wordbe.pomodoro.service.TodoService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(
    val todoService: TodoService
) {

    @PostMapping("/api/v1/todos")
    suspend fun create(@RequestBody todoRequest: TodoRequest) {
        todoService.create(todoRequest)
    }
}