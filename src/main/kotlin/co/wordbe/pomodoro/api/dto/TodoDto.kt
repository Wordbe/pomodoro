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