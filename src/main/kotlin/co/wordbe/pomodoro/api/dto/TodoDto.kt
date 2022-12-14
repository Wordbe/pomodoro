package co.wordbe.pomodoro.api.dto

import co.wordbe.pomodoro.domain.todo.entity.Todo

data class TodoRequest(
    val title: String,
    val description: String = ""
) {
    fun toEntity(): Todo {
        return Todo(
            title = title,
            description = description
        )
    }
}

data class TodoResponse (
    val id: Long,
    val title: String,
    val description: String
) {
    constructor(todo: Todo) : this(
        id = todo.id!!,
        title = todo.title,
        description = todo.description
    )
}

data class TodoGatheringResponse(
    val titles: List<String>
)
