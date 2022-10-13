package co.wordbe.pomodoro.api

import co.wordbe.pomodoro.api.dto.TodoGatheringResponse
import co.wordbe.pomodoro.api.dto.TodoRequest
import co.wordbe.pomodoro.api.dto.TodoResponse
import co.wordbe.pomodoro.service.TodoGatheringService
import co.wordbe.pomodoro.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
class TodoController(
    val todoService: TodoService,
    val todoGatheringService: TodoGatheringService,
) {

    @PostMapping("/api/v1/todos")
    suspend fun create(@RequestBody todoRequest: TodoRequest) =
        TodoResponse(todoService.create(todoRequest))

    @GetMapping("/api/v1/todo/{id}/gather")
    suspend fun getById(@PathVariable id: Long) =
        TodoGatheringResponse(todoGatheringService.gatherTitles(id))
}
